/*******************************************************************************
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.dollyn.csdnclient.views;

import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.commands.ActionHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.CloseWindowListener;
import org.eclipse.swt.browser.LocationAdapter;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.OpenWindowListener;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.StatusTextEvent;
import org.eclipse.swt.browser.StatusTextListener;
import org.eclipse.swt.browser.TitleEvent;
import org.eclipse.swt.browser.TitleListener;
import org.eclipse.swt.browser.WindowEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;


/**
 * The Browser view.  This consists of a <code>Browser</code> control, and an
 * address bar consisting of a <code>Label</code> and a <code>Text</code> 
 * control.  This registers handling actions for the retargetable actions added 
 * by <code>BrowserActionBuilder</code> (Back, Forward, Stop, Refresh).  
 * This also hooks listeners on the Browser control for status and progress
 * messages, and redirects these to the status line.
 * 
 * @since 3.0
 */
public class BrowserView extends ViewPart {
	
    /**
	 * Debug flag.  When true, status and progress messages are sent to the
	 * console in addition to the status line.
	 */
	private static final boolean DEBUG = false;
	
	private Browser browser;
	private Text location;
	private String initialUrl;
	
	private Action backAction = new Action("Back") {
		public void run() {
			browser.back();
		}
	};
	
	private Action forwardAction = new Action("Forward") {
		public void run() {
			browser.forward();
		}
	};

	private Action stopAction = new Action("Stop") {
		public void run() {
			browser.stop();
			// cancel any partial progress.
			getViewSite().getActionBars().getStatusLineManager().getProgressMonitor().done();
		}
	};

	private Action refreshAction = new Action("Refresh") {
		public void run() {
			browser.refresh();
		}
	};
	

    
	/**
	 * Constructs a new <code>BrowserView</code>.
	 */
	public BrowserView() {
	    initialUrl = "";
	}
	
    public void init(IViewSite site, IMemento memento) throws PartInitException {
        super.init(site);
    }
    
    
	public void createPartControl(Composite parent) {
		browser = createBrowser(parent, getViewSite().getActionBars());
		browser.setUrl(initialUrl);
	}

	public void setFocus() {
		if (browser != null && !browser.isDisposed()) {
			browser.setFocus();
		}
	}
	
	private Browser createBrowser(Composite parent, final IActionBars actionBars) {
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		parent.setLayout(gridLayout);
		
		Label labelAddress = new Label(parent, SWT.NONE);
		labelAddress.setText("A&ddress");
		
		location = new Text(parent, SWT.BORDER);
		GridData data = new GridData();
		data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		location.setLayoutData(data);

		browser = new Browser(parent, SWT.NONE);
		data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.FILL;
		data.horizontalSpan = 2;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		browser.setLayoutData(data);

		browser.addProgressListener(new ProgressAdapter() {
			IProgressMonitor monitor = actionBars.getStatusLineManager().getProgressMonitor();
			boolean working = false;
			int workedSoFar;
			public void changed(ProgressEvent event) {
				if (DEBUG) {
					System.out.println("changed: " + event.current + "/" + event.total);
				}
				if (event.total == 0) return;
				if (!working) {
					if (event.current == event.total) return;
					monitor.beginTask("", event.total); //$NON-NLS-1$
					workedSoFar = 0;
					working = true;
				}
				monitor.worked(event.current - workedSoFar);
				workedSoFar = event.current;
			}
			public void completed(ProgressEvent event) {
				if (DEBUG) {
					System.out.println("completed: " + event.current + "/" + event.total);
				}
				monitor.done();
				working = false;
			}
		});
		browser.addStatusTextListener(new StatusTextListener() {
			IStatusLineManager status = actionBars.getStatusLineManager(); 
			public void changed(StatusTextEvent event) {
				if (DEBUG) {
					System.out.println("status: " + event.text);
				}
				status.setMessage(event.text);
			}
		});
		browser.addLocationListener(new LocationAdapter() {
			public void changed(LocationEvent event) {
			    if (event.top)
			        location.setText(event.location);
			}
		});
		browser.addTitleListener(new TitleListener() {
            public void changed(TitleEvent event) {
                setPartName(event.title);
            }
        });
        
		location.addSelectionListener(new SelectionAdapter() {
			public void widgetDefaultSelected(SelectionEvent e) {
				browser.setUrl(location.getText());
			}
		});
		
		// Hook the navigation actons as handlers for the retargetable actions
		// defined in BrowserActionBuilder.
		actionBars.setGlobalActionHandler("back", backAction); //$NON-NLS-1$
		actionBars.setGlobalActionHandler("forward", forwardAction); //$NON-NLS-1$
		actionBars.setGlobalActionHandler("stop", stopAction); //$NON-NLS-1$
		actionBars.setGlobalActionHandler("refresh", refreshAction); //$NON-NLS-1$
		
		// Register the easter egg action with the key binding service,
		// allowing it to be invoked directly via keypress, 
		// without requiring the action to be visible in the UI.
		// Note that the address field needs to have focus for this to work, 
		// or any control other than the browser widget, due to 
		// <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=69919">bug 69919</a>.
		return browser;
	}


    
}
