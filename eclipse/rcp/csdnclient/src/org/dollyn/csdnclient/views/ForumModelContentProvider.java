package org.dollyn.csdnclient.views;

import org.dollyn.csdnclient.model.ForumModel;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ForumModelContentProvider implements ITreeContentProvider {

	public Object[] getChildren(Object parentElement) {
		return ((ForumModel)parentElement).getChildren();
	}

	public Object getParent(Object element) {
		return ((ForumModel)element).getParent();
	}

	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
