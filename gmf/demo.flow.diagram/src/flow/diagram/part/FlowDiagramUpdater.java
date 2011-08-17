package flow.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import flow.BeginNode;
import flow.CheckNode;
import flow.EndNode;
import flow.ExcuteNode;
import flow.Flow;
import flow.FlowPackage;
import flow.INode;
import flow.NormalNode;
import flow.diagram.edit.parts.BeginNodeEditPart;
import flow.diagram.edit.parts.CheckNodeEditPart;
import flow.diagram.edit.parts.CheckNodeElseFlowEditPart;
import flow.diagram.edit.parts.CheckNodeIfFlowEditPart;
import flow.diagram.edit.parts.EndNodeEditPart;
import flow.diagram.edit.parts.ExcuteNodeEditPart;
import flow.diagram.edit.parts.FlowEditPart;
import flow.diagram.edit.parts.NormalNodeNextEditPart;
import flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class FlowDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case FlowEditPart.VISUAL_ID:
			return getFlow_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Flow modelElement = (Flow) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			INode childElement = (INode) it.next();
			int visualID = FlowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CheckNodeEditPart.VISUAL_ID) {
				result.add(new FlowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExcuteNodeEditPart.VISUAL_ID) {
				result.add(new FlowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BeginNodeEditPart.VISUAL_ID) {
				result.add(new FlowNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndNodeEditPart.VISUAL_ID) {
				result.add(new FlowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case FlowEditPart.VISUAL_ID:
			return getFlow_1000ContainedLinks(view);
		case CheckNodeEditPart.VISUAL_ID:
			return getCheckNode_2001ContainedLinks(view);
		case ExcuteNodeEditPart.VISUAL_ID:
			return getExcuteNode_2002ContainedLinks(view);
		case BeginNodeEditPart.VISUAL_ID:
			return getBeginNode_2003ContainedLinks(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2004ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case CheckNodeEditPart.VISUAL_ID:
			return getCheckNode_2001IncomingLinks(view);
		case ExcuteNodeEditPart.VISUAL_ID:
			return getExcuteNode_2002IncomingLinks(view);
		case BeginNodeEditPart.VISUAL_ID:
			return getBeginNode_2003IncomingLinks(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2004IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (FlowVisualIDRegistry.getVisualID(view)) {
		case CheckNodeEditPart.VISUAL_ID:
			return getCheckNode_2001OutgoingLinks(view);
		case ExcuteNodeEditPart.VISUAL_ID:
			return getExcuteNode_2002OutgoingLinks(view);
		case BeginNodeEditPart.VISUAL_ID:
			return getBeginNode_2003OutgoingLinks(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2004OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlow_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCheckNode_2001ContainedLinks(View view) {
		CheckNode modelElement = (CheckNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CheckNode_IfFlow_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExcuteNode_2002ContainedLinks(View view) {
		ExcuteNode modelElement = (ExcuteNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NormalNode_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBeginNode_2003ContainedLinks(View view) {
		BeginNode modelElement = (BeginNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NormalNode_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEndNode_2004ContainedLinks(View view) {
		EndNode modelElement = (EndNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NormalNode_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCheckNode_2001IncomingLinks(View view) {
		CheckNode modelElement = (CheckNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_NormalNode_Next_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CheckNode_IfFlow_4002(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExcuteNode_2002IncomingLinks(View view) {
		ExcuteNode modelElement = (ExcuteNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_NormalNode_Next_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CheckNode_IfFlow_4002(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBeginNode_2003IncomingLinks(View view) {
		BeginNode modelElement = (BeginNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_NormalNode_Next_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CheckNode_IfFlow_4002(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEndNode_2004IncomingLinks(View view) {
		EndNode modelElement = (EndNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_NormalNode_Next_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_CheckNode_IfFlow_4002(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCheckNode_2001OutgoingLinks(View view) {
		CheckNode modelElement = (CheckNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CheckNode_IfFlow_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExcuteNode_2002OutgoingLinks(View view) {
		ExcuteNode modelElement = (ExcuteNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NormalNode_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBeginNode_2003OutgoingLinks(View view) {
		BeginNode modelElement = (BeginNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NormalNode_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEndNode_2004OutgoingLinks(View view) {
		EndNode modelElement = (EndNode) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NormalNode_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_NormalNode_Next_4001(
			INode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FlowPackage.eINSTANCE
					.getNormalNode_Next()) {
				result.add(new FlowLinkDescriptor(setting.getEObject(), target,
						FlowElementTypes.NormalNodeNext_4001,
						NormalNodeNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CheckNode_IfFlow_4002(
			INode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FlowPackage.eINSTANCE
					.getCheckNode_IfFlow()) {
				result.add(new FlowLinkDescriptor(setting.getEObject(), target,
						FlowElementTypes.CheckNodeIfFlow_4002,
						CheckNodeIfFlowEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(
			INode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == FlowPackage.eINSTANCE
					.getCheckNode_ElseFlow()) {
				result.add(new FlowLinkDescriptor(setting.getEObject(), target,
						FlowElementTypes.CheckNodeElseFlow_4003,
						CheckNodeElseFlowEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_NormalNode_Next_4001(
			NormalNode source) {
		Collection result = new LinkedList();
		INode destination = source.getNext();
		if (destination == null) {
			return result;
		}
		result.add(new FlowLinkDescriptor(source, destination,
				FlowElementTypes.NormalNodeNext_4001,
				NormalNodeNextEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CheckNode_IfFlow_4002(
			CheckNode source) {
		Collection result = new LinkedList();
		INode destination = source.getIfFlow();
		if (destination == null) {
			return result;
		}
		result.add(new FlowLinkDescriptor(source, destination,
				FlowElementTypes.CheckNodeIfFlow_4002,
				CheckNodeIfFlowEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_CheckNode_ElseFlow_4003(
			CheckNode source) {
		Collection result = new LinkedList();
		INode destination = source.getElseFlow();
		if (destination == null) {
			return result;
		}
		result.add(new FlowLinkDescriptor(source, destination,
				FlowElementTypes.CheckNodeElseFlow_4003,
				CheckNodeElseFlowEditPart.VISUAL_ID));
		return result;
	}

}
