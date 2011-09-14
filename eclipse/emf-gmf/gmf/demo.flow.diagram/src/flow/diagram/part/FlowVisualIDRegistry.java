package flow.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import flow.Flow;
import flow.FlowPackage;
import flow.diagram.edit.parts.BeginNodeEditPart;
import flow.diagram.edit.parts.CheckNodeEditPart;
import flow.diagram.edit.parts.CheckNodeNameEditPart;
import flow.diagram.edit.parts.EndNodeEditPart;
import flow.diagram.edit.parts.ExcuteNodeEditPart;
import flow.diagram.edit.parts.ExcuteNodeNameEditPart;
import flow.diagram.edit.parts.FlowEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FlowVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "demo.flow.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FlowEditPart.MODEL_ID.equals(view.getType())) {
				return FlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return flow.diagram.part.FlowVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				FlowDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FlowPackage.eINSTANCE.getFlow().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Flow) domainElement)) {
			return FlowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = flow.diagram.part.FlowVisualIDRegistry
				.getModelID(containerView);
		if (!FlowEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = flow.diagram.part.FlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FlowEditPart.VISUAL_ID:
			if (FlowPackage.eINSTANCE.getCheckNode().isSuperTypeOf(
					domainElement.eClass())) {
				return CheckNodeEditPart.VISUAL_ID;
			}
			if (FlowPackage.eINSTANCE.getExcuteNode().isSuperTypeOf(
					domainElement.eClass())) {
				return ExcuteNodeEditPart.VISUAL_ID;
			}
			if (FlowPackage.eINSTANCE.getBeginNode().isSuperTypeOf(
					domainElement.eClass())) {
				return BeginNodeEditPart.VISUAL_ID;
			}
			if (FlowPackage.eINSTANCE.getEndNode().isSuperTypeOf(
					domainElement.eClass())) {
				return EndNodeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = flow.diagram.part.FlowVisualIDRegistry
				.getModelID(containerView);
		if (!FlowEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = flow.diagram.part.FlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FlowEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CheckNodeEditPart.VISUAL_ID:
			if (CheckNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExcuteNodeEditPart.VISUAL_ID:
			if (ExcuteNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowEditPart.VISUAL_ID:
			if (CheckNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExcuteNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BeginNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Flow element) {
		return true;
	}

}
