package flow.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import flow.FlowPackage;
import flow.diagram.edit.parts.BeginNodeEditPart;
import flow.diagram.edit.parts.CheckNodeEditPart;
import flow.diagram.edit.parts.CheckNodeElseFlowEditPart;
import flow.diagram.edit.parts.CheckNodeIfFlowEditPart;
import flow.diagram.edit.parts.EndNodeEditPart;
import flow.diagram.edit.parts.ExcuteNodeEditPart;
import flow.diagram.edit.parts.FlowEditPart;
import flow.diagram.edit.parts.NormalNodeNextEditPart;
import flow.diagram.part.FlowDiagramEditorPlugin;

/**
 * @generated
 */
public class FlowElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private FlowElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Flow_1000 = getElementType("demo.flow.diagram.Flow_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CheckNode_2001 = getElementType("demo.flow.diagram.CheckNode_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExcuteNode_2002 = getElementType("demo.flow.diagram.ExcuteNode_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BeginNode_2003 = getElementType("demo.flow.diagram.BeginNode_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndNode_2004 = getElementType("demo.flow.diagram.EndNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NormalNodeNext_4001 = getElementType("demo.flow.diagram.NormalNodeNext_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CheckNodeIfFlow_4002 = getElementType("demo.flow.diagram.CheckNodeIfFlow_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CheckNodeElseFlow_4003 = getElementType("demo.flow.diagram.CheckNodeElseFlow_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return FlowDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Flow_1000, FlowPackage.eINSTANCE.getFlow());

			elements.put(CheckNode_2001, FlowPackage.eINSTANCE.getCheckNode());

			elements
					.put(ExcuteNode_2002, FlowPackage.eINSTANCE.getExcuteNode());

			elements.put(BeginNode_2003, FlowPackage.eINSTANCE.getBeginNode());

			elements.put(EndNode_2004, FlowPackage.eINSTANCE.getEndNode());

			elements.put(NormalNodeNext_4001, FlowPackage.eINSTANCE
					.getNormalNode_Next());

			elements.put(CheckNodeIfFlow_4002, FlowPackage.eINSTANCE
					.getCheckNode_IfFlow());

			elements.put(CheckNodeElseFlow_4003, FlowPackage.eINSTANCE
					.getCheckNode_ElseFlow());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Flow_1000);
			KNOWN_ELEMENT_TYPES.add(CheckNode_2001);
			KNOWN_ELEMENT_TYPES.add(ExcuteNode_2002);
			KNOWN_ELEMENT_TYPES.add(BeginNode_2003);
			KNOWN_ELEMENT_TYPES.add(EndNode_2004);
			KNOWN_ELEMENT_TYPES.add(NormalNodeNext_4001);
			KNOWN_ELEMENT_TYPES.add(CheckNodeIfFlow_4002);
			KNOWN_ELEMENT_TYPES.add(CheckNodeElseFlow_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FlowEditPart.VISUAL_ID:
			return Flow_1000;
		case CheckNodeEditPart.VISUAL_ID:
			return CheckNode_2001;
		case ExcuteNodeEditPart.VISUAL_ID:
			return ExcuteNode_2002;
		case BeginNodeEditPart.VISUAL_ID:
			return BeginNode_2003;
		case EndNodeEditPart.VISUAL_ID:
			return EndNode_2004;
		case NormalNodeNextEditPart.VISUAL_ID:
			return NormalNodeNext_4001;
		case CheckNodeIfFlowEditPart.VISUAL_ID:
			return CheckNodeIfFlow_4002;
		case CheckNodeElseFlowEditPart.VISUAL_ID:
			return CheckNodeElseFlow_4003;
		}
		return null;
	}

}
