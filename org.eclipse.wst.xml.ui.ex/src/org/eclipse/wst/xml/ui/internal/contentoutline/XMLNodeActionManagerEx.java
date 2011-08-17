package org.eclipse.wst.xml.ui.internal.contentoutline;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.xml.ui.internal.tabletree.RenameElementAction;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMLNodeActionManagerEx extends XMLNodeActionManager {

	public XMLNodeActionManagerEx(IStructuredModel model, Viewer viewer) {
		super(model, viewer);
	}
	
	public void removeNode(List selection) {
		Action remove = createDeleteAction(selection);
		remove.run();
	}
	
	public void createElement(Node parent, int index) {
		Action add = createAddElementAction(parent, null, index);
		add.run();
	}
	
	public void renameElement(Element element, String newName) {
		Action rename = new RenameElementAction(this, element, newName);
		rename.run();
	}
	
}
