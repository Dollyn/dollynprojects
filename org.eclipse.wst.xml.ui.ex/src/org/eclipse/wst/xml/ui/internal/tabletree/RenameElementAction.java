package org.eclipse.wst.xml.ui.internal.tabletree;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMElement;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.eclipse.wst.xml.ui.internal.actions.AbstractNodeActionManager;
import org.eclipse.wst.xml.ui.internal.actions.NodeAction;
import org.eclipse.wst.xml.ui.internal.editor.XMLEditorPluginImageHelper;
import org.eclipse.wst.xml.ui.internal.editor.XMLEditorPluginImages;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class RenameElementAction extends NodeAction{
	protected static ImageDescriptor imageDescriptor;

	public static ImageDescriptor createImageDescriptor() {
		if (imageDescriptor == null) {
			imageDescriptor = XMLEditorPluginImageHelper.getInstance().getImageDescriptor(XMLEditorPluginImages.IMG_OBJ_ELEMENT);
		}
		return imageDescriptor;
	}

	protected Element element;
	protected int insertionIndex = -1;
	protected AbstractNodeActionManager manager;
	protected Node parent;
	protected String newName;

	public RenameElementAction(AbstractNodeActionManager manager, Element element, String newName) {
		this(manager, element.getParentNode(), -1, element, newName);
	}

	protected RenameElementAction(AbstractNodeActionManager manager, Node parent, int index, Element element, String newName) {
		this.manager = manager;
		this.parent = parent;
		this.insertionIndex = index;
		this.element = element;
		this.newName = newName;
		if (element == null) {
			setImageDescriptor(createImageDescriptor());
		}
	}

	public RenameElementAction(AbstractNodeActionManager manager, Node parent, int index, String newName) {
		this(manager, parent, index, null, newName);
	}

	public String getUndoDescription() {
		return "";
	}

	public void run() {
		manager.beginNodeAction(this);
		if (element != null) {
			// here we need to do a rename... which seems to be quite hard
			// to do :-(
			if (element instanceof IDOMElement) {
				IDOMElement elementImpl = (IDOMElement) element;
				IDOMModel model = elementImpl.getModel();
				String oldName = elementImpl.getNodeName();
				IStructuredDocumentRegion start = elementImpl.getStartStructuredDocumentRegion();
				IStructuredDocumentRegion end = elementImpl.getEndStructuredDocumentRegion();
				setStructuredDocumentRegionElementName(model, start, oldName, newName);
				setStructuredDocumentRegionElementName(model, end, oldName, newName);
			}
		}
		manager.endNodeAction(this);
	}

	protected void setStructuredDocumentRegionElementName(IDOMModel model, IStructuredDocumentRegion flatNode, String oldName, String newName) {
		if (flatNode != null) {
			String string = flatNode.getText();
			int index = string.indexOf(oldName);
			if (index != -1) {
				index += flatNode.getStart();
				model.getStructuredDocument().replaceText(this, index, oldName.length(), newName);
			}
		}
	}
}
