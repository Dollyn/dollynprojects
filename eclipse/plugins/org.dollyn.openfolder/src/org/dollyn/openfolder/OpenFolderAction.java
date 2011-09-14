package org.dollyn.openfolder;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class OpenFolderAction implements IObjectActionDelegate {

	private IResource resource;
	
	public OpenFolderAction() {
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

	@Override
	public void run(IAction action) {
		File target = null;
		
		IPath path = null;
		switch (resource.getType()) {
		case IResource.FILE:
			path = ((IFile)resource).getParent().getLocation();
			break;
		case IResource.FOLDER:
		case IResource.PROJECT:
			path = resource.getLocation();
		default:
			break;
		}
		
		target = path.toFile();
		
		try {
			Runtime.getRuntime().exec("explorer /e, " + target.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		IStructuredSelection ss = (IStructuredSelection)selection;
		if(!ss.isEmpty()) {
			Object o = ss.getFirstElement();
			if(o instanceof IResource) {
				resource = (IResource)o;
			} else if(o instanceof IAdaptable) {
				resource = (IResource)((IAdaptable)o).getAdapter(IResource.class);
			} else {
				resource = null;
			}
		} else {
			resource = null;
		}				
		
		if(resource == null) {
			action.setEnabled(false);
		} else {
			action.setEnabled(true);
		}
	}

}
