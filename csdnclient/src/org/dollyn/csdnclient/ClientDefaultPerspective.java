package org.dollyn.csdnclient;

import org.dollyn.csdnclient.views.ForumsView;
import org.dollyn.csdnclient.views.TopicsView;
import org.dollyn.csdnclient.views.UsersView;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ClientDefaultPerspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
        String editorArea = layout.getEditorArea();
        layout.setEditorAreaVisible(true);

        // Top left.
        IFolderLayout topLeft = layout.createFolder(
                "topLeft", IPageLayout.LEFT, (float) 0.33, editorArea);//$NON-NLS-1$
        topLeft.addView(ForumsView.ID);
        topLeft.addView(UsersView.ID);

        IFolderLayout top = layout.createFolder("top", IPageLayout.TOP, (float) 0.50, editorArea);
        top.addView(TopicsView.ID);
	}
}
