package org.dollyn.csdnclient;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	
	private IContributionItem showView;

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	showView = ContributionItemFactory.VIEWS_SHORTLIST.create(window);
    }

    protected void fillMenuBar(IMenuManager menuBar) {
       	//一级菜单“window”
    	MenuManager windowMenu = new MenuManager("窗口(&W)", IWorkbenchActionConstants.M_WINDOW);
    	menuBar.add(windowMenu);
 
       	MenuManager showViewMenu = new MenuManager("打开视图(&V)", IWorkbenchActionConstants.SHOW_EXT);
    	windowMenu.add(showViewMenu); 
    	//打开视图action
    	showViewMenu.add(showView);
    }
    
}
