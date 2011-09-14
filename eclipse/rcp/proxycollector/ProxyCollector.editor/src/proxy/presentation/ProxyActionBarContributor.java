/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package proxy.presentation;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Timer;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;

import proxy.Proxy;
import proxy.Result;

/**
 * This is the action bar contributor for the Proxy model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProxyActionBarContributor
    extends EditingDomainActionBarContributor
    implements ISelectionChangedListener {
    /**
	 * Action to create objects from the Proxy model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static class NewAction extends WorkbenchWindowActionDelegate {
        /**
		 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        public void run(IAction action) {
			ProxyModelWizard wizard = new ProxyModelWizard();
			wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.open();
		}
    }

    /**
	 * This keeps track of the active editor.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected IEditorPart activeEditorPart;

    /**
	 * This keeps track of the current selection provider.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ISelectionProvider selectionProvider;

    /**
	 * This action opens the Properties view.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected IAction showPropertiesViewAction =
        new Action(ProxyEditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
			@Override
			public void run() {
				try {
					getPage().showView("org.eclipse.ui.views.PropertySheet");
				}
				catch (PartInitException exception) {
					ProxyEditorPlugin.INSTANCE.log(exception);
				}
			}
		};

    /**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected IAction refreshViewerAction =
        new Action(ProxyEditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) {
			@Override
			public boolean isEnabled() {
				return activeEditorPart instanceof IViewerProvider;
			}

			@Override
			public void run() {
				if (activeEditorPart instanceof IViewerProvider) {
					Viewer viewer = ((IViewerProvider)activeEditorPart).getViewer();
					if (viewer != null) {
						viewer.refresh();
					}
				}
			}
		};

        
        /**
         * @generated NOT
         */
    protected IAction collectAction;
    
    /**
     * @generated NOT
     */
    protected IAction validateAction;
    
    /**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Collection<IAction> createChildActions;

    /**
	 * This is the menu manager into which menu contribution items should be added for CreateChild actions.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected IMenuManager createChildMenuManager;

    /**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Collection<IAction> createSiblingActions;

    /**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected IMenuManager createSiblingMenuManager;

    /**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProxyActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		loadResourceAction = new LoadResourceAction();
	}

    /**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("proxy-settings"));
		toolBarManager.add(new Separator("proxy-additions"));
	}

    /**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(ProxyEditorPlugin.INSTANCE.getString("_UI_ProxyEditor_menu"), "proxyMenuID");
		menuManager.insertAfter("additions", submenuManager);
		submenuManager.add(new Separator("settings"));
		submenuManager.add(new Separator("actions"));
		submenuManager.add(new Separator("additions"));
		submenuManager.add(new Separator("additions-end"));

		// Prepare for CreateChild item addition or removal.
		//
		createChildMenuManager = new MenuManager(ProxyEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		submenuManager.insertBefore("additions", createChildMenuManager);

		// Prepare for CreateSibling item addition or removal.
		//
		createSiblingMenuManager = new MenuManager(ProxyEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		submenuManager.insertBefore("additions", createSiblingMenuManager);
		

		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener
			(new IMenuListener() {
				 public void menuAboutToShow(IMenuManager menuManager) {
					 menuManager.updateAll(true);
				 }
			 });

		addGlobalActions(submenuManager);
	}

    /**
	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
		}
		else {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);

			// Fake a selection changed event to update the menus.
			//
			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
			}
		}
	}

    /**
     * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
     * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
     * that can be added to the selected object and updating the menus accordingly.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void selectionChanged(SelectionChangedEvent event) {
        // Remove any menu items for old selection.
        //
        if (createChildMenuManager != null) {
            depopulateManager(createChildMenuManager, createChildActions);
        }
        if (createSiblingMenuManager != null) {
            depopulateManager(createSiblingMenuManager, createSiblingActions);
        }

        // Query the new selection for appropriate new child/sibling descriptors
        //
        Collection<?> newChildDescriptors = null;
        Collection<?> newSiblingDescriptors = null;

        ISelection selection = event.getSelection();
        if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1) {
            Object object = ((IStructuredSelection)selection).getFirstElement();

            EditingDomain domain = ((IEditingDomainProvider)activeEditorPart).getEditingDomain();

            newChildDescriptors = domain.getNewChildDescriptors(object, null);
            newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
            
            if (object instanceof Result) {
            	collectAction = generateCollectProxyAction((Result) object);
            	validateAction = generateValidateProxyAction((Result) object);
            } 
            if (object instanceof Proxy) {
            	validateAction = generateValidateProxyAction((Proxy) object);
            }
        }

        // Generate actions for selection; populate and redraw the menus.
        //
        createChildActions = generateCreateChildActions(newChildDescriptors, selection);
        createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);

        if (createChildMenuManager != null) {
            populateManager(createChildMenuManager, createChildActions, null);
            createChildMenuManager.update(true);
        }
        if (createSiblingMenuManager != null) {
            populateManager(createSiblingMenuManager, createSiblingActions, null);
            createSiblingMenuManager.update(true);
        }
        
        
    }

    /**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}
    
    /**
     * @generated NOT
     */
    protected Shell getShell() {
    	return getActiveEditor().getSite().getShell();
    }
    
    /**
     * @generated NOT
     */
    protected IAction generateCollectProxyAction(final Result result) {
    	return new Action() {

			@Override
			public String getText() {
				return "Collect...";
			}

			@Override
			public void run() {
				InputDialog dialog = new InputDialog(getShell(), "URL", "URL:", "", null);
				if (dialog.open() == Dialog.OK) {
					final String url = dialog.getValue();
					Job collectJob = new Job("Collecting...") {
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							getShell().getDisplay().syncExec(new Runnable() {

								@Override
								public void run() {
									new ProxyCollector().collect(result, url);
								}
								
							});
						
							return Status.OK_STATUS;
						}
					};
					collectJob.setUser(true);
					collectJob.schedule();
				}
			}
    		
    	};
    }
    
    /**
     * @generated NOT
     */
    protected IAction generateValidateProxyAction(final Proxy proxy) {
    	return new Action() {
    		@Override
			public String getText() {
				return "Validate...";
			}

			@Override
			public void run() {
				Job job = new Job("Validating") {

					@Override
					protected IStatus run(IProgressMonitor monitor) {
						try {
							URL url = new URL("http://www.baidu.com");
							URLConnection conn = url.openConnection(new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(proxy.getIp(), Integer.parseInt(proxy.getPort()))));
							
							long t0 = System.currentTimeMillis();
							InputStream is = conn.getInputStream();
							String content = IOUtils.toString(is);
							long t1 = System.currentTimeMillis();
							final long delay = t1 - t0;
							final StringBuffer sb = new StringBuffer(content);
							if(sb.length() > 500) {
								sb.delete(500, sb.length() -1 );
							}
							long t2 = System.currentTimeMillis();
							System.out.println("�ַ�������ʱ�䣺" + (t2 - t1));
							is.close();
							long t3 = System.currentTimeMillis();
							System.out.println("�ر���:" + (t3 - t2));
							
							proxy.setLastValidateDate(new Date());
							proxy.setDelay((int) delay);
							
							getShell().getDisplay().asyncExec(new Runnable() {
								@Override
								public void run() {
									MessageDialog.openInformation(getActiveEditor().getSite().getShell(), "��������", "�ο���ʱ:" + delay + "\n" + sb.toString());
								}
							});
							
//							InetAddress address = InetAddress.getByName(proxy.getIp());
//							boolean chkConnection = address.isReachable(1000);
//							System.out.println(chkConnection);
						} catch (MalformedURLException e) {
							getShell().getDisplay().asyncExec(new Runnable() {
								@Override
								public void run() {
									MessageDialog.openError(getActiveEditor().getSite().getShell(), "����", "��֤ʧ��");
								}
							});
						} catch (IOException e) {
							getShell().getDisplay().asyncExec(new Runnable() {
								@Override
								public void run() {
									MessageDialog.openError(getActiveEditor().getSite().getShell(), "����", "��֤ʧ��");
								}
							});						}
						return Status.OK_STATUS;
					}
					
				};

				job.setUser(true);
				job.schedule();
			}
    	};
    }
    
    /**
     * @generated NOT
     */
    protected IAction generateValidateProxyAction(final Result result) {
    	return new Action() {
    		@Override
			public String getText() {
				return "Validate...";
			}

			@Override
			public void run() {
				Job job = new Job("Validating") {

					@Override
					protected IStatus run(IProgressMonitor monitor) {
						List<Proxy> proxies = result.getProxies();
						int size = proxies.size();
						monitor.beginTask("��֤...", size);
						for (Proxy proxy : proxies) {
							validate(proxy);
						}
						System.out.println("ȫ����֤��ɣ�����");
						monitor.done();
						return Status.OK_STATUS;
					}
					
				};

				job.setUser(true);
				job.schedule();
			}
			
			private void validate(final Proxy proxy) {
				
//				final boolean[] timeout = new boolean[] {false};
				final boolean[] validteOk = new boolean[] {false};
				
				Thread thread = new Thread("xx") {

					@Override
					public void run() {
						try {
							URL url = new URL("http://www.baidu.com");
							URLConnection conn = url.openConnection(new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(proxy.getIp(), Integer.parseInt(proxy.getPort()))));
							
							long t0 = System.currentTimeMillis();
							InputStream is = conn.getInputStream();
							String content = IOUtils.toString(is);
							long t1 = System.currentTimeMillis();
							
							if (Thread.currentThread().isInterrupted()) 
								return;
							
							final long delay = t1 - t0;
							final StringBuffer sb = new StringBuffer(content);
							if(sb.length() > 500) {
								sb.delete(500, sb.length() -1 );
							}
							
							long t2 = System.currentTimeMillis();
							System.out.println("�ַ�������ʱ�䣺" + (t2 - t1));
							is.close();
							long t3 = System.currentTimeMillis();
							System.out.println("�ر���:" + (t3 - t2));
							
							if (sb.indexOf("�ٶ�һ��") != -1) {
								proxy.setLastValidateDate(new Date());
								proxy.setDelay((int) delay);
								System.out.println("����" + proxy.getName() + "��֤�ɹ����ο���ʱ:" + delay);
								validteOk[0] = true;
								return;
							} 
							
						} catch (MalformedURLException e) {
							//System.out.println("����" + proxy.getName() + "��֤ʧ�ܣ�");
						} catch (IOException e) {
							//System.out.println("����" + proxy.getName() + "��֤ʧ�ܣ�");
						}
					}
					
				};
				
				try {
					thread.start();
					thread.join(1500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				if (!validteOk[0]) {
					thread.interrupt();
					System.out.println("����" + proxy.getName() + "��֤ʧ�ܣ�����ʱ�� ");
					proxy.setDelay(-1);
				}
					
			}
    	};
    }

    /**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

    /**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				}
				else {
					manager.add(action);
				}
			}
		}
	}
        
    /**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem)contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

    /**
	 * This populates the pop-up menu before it appears.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    @Override
    public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(ProxyEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		populateManager(submenuManager, createChildActions, null);
		menuManager.insertBefore("edit", submenuManager);

		submenuManager = new MenuManager(ProxyEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		populateManager(submenuManager, createSiblingActions, null);
		menuManager.insertBefore("edit", submenuManager);
		
		if (collectAction != null)
			menuManager.insertBefore("edit", collectAction);
		
		if (validateAction != null)
			menuManager.insertBefore("edit", validateAction);
	}

    /**
	 * This inserts global actions before the "additions-end" separator.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
		menuManager.insertAfter("ui-actions", refreshViewerAction);

		super.addGlobalActions(menuManager);
	}

    /**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected boolean removeAllReferencesOnDelete() {
		return true;
	}

}