package com.google.code.dollynprojects.exploer;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class OpenInExplorerAction implements IObjectActionDelegate {

	private IResource resource;
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

	public void run(IAction action) {
		String path = resource.getLocation().toOSString();
		if (resource instanceof IContainer) {
			try {
				Runtime.getRuntime().exec("explorer /e," + path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("explorer /e,/select," + path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection)selection;
			Object obj = ss.getFirstElement();
			this.resource = getResource(obj);
		} else {
			resource = null;
		}
		
		action.setEnabled(resource != null);
	}
	
	private IResource getResource(Object obj) {
		if (obj == null) {
			return null;
		}
		
		if (obj instanceof IResource) {
			return (IResource)obj;
		}
		
		if (obj instanceof IAdaptable) {
			return (IResource)((IAdaptable)obj).getAdapter(IResource.class);
		}
		
		return null;
	}

}
