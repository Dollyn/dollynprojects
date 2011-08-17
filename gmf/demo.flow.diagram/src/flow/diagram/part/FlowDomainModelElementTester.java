package flow.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import flow.FlowPackage;

/**
 * @generated
 */
public class FlowDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == FlowPackage.eINSTANCE.getINode()) {
			return true;
		}
		if (eClass == FlowPackage.eINSTANCE.getFlow()) {
			return true;
		}
		if (eClass == FlowPackage.eINSTANCE.getCheckNode()) {
			return true;
		}
		if (eClass == FlowPackage.eINSTANCE.getNormalNode()) {
			return true;
		}
		if (eClass == FlowPackage.eINSTANCE.getBeginNode()) {
			return true;
		}
		if (eClass == FlowPackage.eINSTANCE.getEndNode()) {
			return true;
		}
		if (eClass == FlowPackage.eINSTANCE.getExcuteNode()) {
			return true;
		}
		return false;
	}

}
