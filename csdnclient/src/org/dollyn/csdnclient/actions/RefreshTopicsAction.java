package org.dollyn.csdnclient.actions;

import org.dollyn.csdnclient.views.TopicsView;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class RefreshTopicsAction implements IViewActionDelegate {

	private TopicsView view;
	
	@Override
	public void init(IViewPart view) {
		this.view = (TopicsView)view;
	}

	@Override
	public void run(IAction action) {
		view.refreshTopics();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

	}

}
