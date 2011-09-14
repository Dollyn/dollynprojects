package org.dollyn.csdnclient.views;

import org.dollyn.csdnclient.ModelManager;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ForumsView extends ViewPart {
	
	public static final String ID = "org.dollyn.csdnclient.forumsview";
	private TreeViewer viewer;

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		
		viewer = new TreeViewer(parent, SWT.NONE);
		viewer.setContentProvider(new ForumModelContentProvider());
		viewer.setLabelProvider(new LabelProvider());
		getSite().setSelectionProvider(viewer);
		
		refresh();
	}

	private void refresh() {
//		Job refresh = new Job("") {
//			@Override
//			protected IStatus run(final IProgressMonitor monitor) {
//				monitor.beginTask("adding users", IProgressMonitor.UNKNOWN);
//				viewer.getTree().getDisplay().asyncExec(new Runnable() {
//					@Override
//					public void run() {
//						viewer.setInput(ModelManager.getInstance().getRootForum());
//						monitor.done();
//					}
//					
//				});										
//				return Status.OK_STATUS;
//			}			
//		};
//		
//		refresh.setUser(true);
//		refresh.schedule();
		
		viewer.getTree().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				viewer.setInput(ModelManager.getInstance().getRootForum());
			}			
		});										

	}
	
	@Override
	public void setFocus() {
		
	}

}
