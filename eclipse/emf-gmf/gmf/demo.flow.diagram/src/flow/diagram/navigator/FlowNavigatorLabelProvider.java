package flow.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import flow.BeginNode;
import flow.EndNode;
import flow.diagram.edit.parts.BeginNodeEditPart;
import flow.diagram.edit.parts.CheckNodeEditPart;
import flow.diagram.edit.parts.CheckNodeElseFlowEditPart;
import flow.diagram.edit.parts.CheckNodeIfFlowEditPart;
import flow.diagram.edit.parts.CheckNodeNameEditPart;
import flow.diagram.edit.parts.EndNodeEditPart;
import flow.diagram.edit.parts.ExcuteNodeEditPart;
import flow.diagram.edit.parts.ExcuteNodeNameEditPart;
import flow.diagram.edit.parts.FlowEditPart;
import flow.diagram.edit.parts.NormalNodeNextEditPart;
import flow.diagram.part.FlowDiagramEditorPlugin;
import flow.diagram.part.FlowVisualIDRegistry;
import flow.diagram.providers.FlowElementTypes;
import flow.diagram.providers.FlowParserProvider;

/**
 * @generated
 */
public class FlowNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FlowNavigatorItem
				&& !isOwnView(((FlowNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FlowNavigatorGroup) {
			FlowNavigatorGroup group = (FlowNavigatorGroup) element;
			return FlowDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof FlowNavigatorItem) {
			FlowNavigatorItem navigatorItem = (FlowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case FlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://demo/flow?Flow", FlowElementTypes.Flow_1000); //$NON-NLS-1$
		case CheckNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://demo/flow?CheckNode", FlowElementTypes.CheckNode_2001); //$NON-NLS-1$
		case ExcuteNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://demo/flow?ExcuteNode", FlowElementTypes.ExcuteNode_2002); //$NON-NLS-1$
		case BeginNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://demo/flow?BeginNode", FlowElementTypes.BeginNode_2003); //$NON-NLS-1$
		case EndNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://demo/flow?EndNode", FlowElementTypes.EndNode_2004); //$NON-NLS-1$
		case NormalNodeNextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://demo/flow?NormalNode?next", FlowElementTypes.NormalNodeNext_4001); //$NON-NLS-1$
		case CheckNodeIfFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://demo/flow?CheckNode?ifFlow", FlowElementTypes.CheckNodeIfFlow_4002); //$NON-NLS-1$
		case CheckNodeElseFlowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://demo/flow?CheckNode?elseFlow", FlowElementTypes.CheckNodeElseFlow_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FlowDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& FlowElementTypes.isKnownElementType(elementType)) {
			image = FlowElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof FlowNavigatorGroup) {
			FlowNavigatorGroup group = (FlowNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FlowNavigatorItem) {
			FlowNavigatorItem navigatorItem = (FlowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case FlowEditPart.VISUAL_ID:
			return getFlow_1000Text(view);
		case CheckNodeEditPart.VISUAL_ID:
			return getCheckNode_2001Text(view);
		case ExcuteNodeEditPart.VISUAL_ID:
			return getExcuteNode_2002Text(view);
		case BeginNodeEditPart.VISUAL_ID:
			return getBeginNode_2003Text(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2004Text(view);
		case NormalNodeNextEditPart.VISUAL_ID:
			return getNormalNodeNext_4001Text(view);
		case CheckNodeIfFlowEditPart.VISUAL_ID:
			return getCheckNodeIfFlow_4002Text(view);
		case CheckNodeElseFlowEditPart.VISUAL_ID:
			return getCheckNodeElseFlow_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFlow_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCheckNode_2001Text(View view) {
		IParser parser = FlowParserProvider.getParser(
				FlowElementTypes.CheckNode_2001,
				view.getElement() != null ? view.getElement() : view,
				FlowVisualIDRegistry.getType(CheckNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExcuteNode_2002Text(View view) {
		IParser parser = FlowParserProvider.getParser(
				FlowElementTypes.ExcuteNode_2002,
				view.getElement() != null ? view.getElement() : view,
				FlowVisualIDRegistry.getType(ExcuteNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBeginNode_2003Text(View view) {
		BeginNode domainModelElement = (BeginNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			FlowDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndNode_2004Text(View view) {
		EndNode domainModelElement = (EndNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			FlowDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNormalNodeNext_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCheckNodeIfFlow_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCheckNodeElseFlow_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FlowEditPart.MODEL_ID.equals(FlowVisualIDRegistry
				.getModelID(view));
	}

}
