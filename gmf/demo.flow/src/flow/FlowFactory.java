/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see flow.FlowPackage
 * @generated
 */
public interface FlowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowFactory eINSTANCE = flow.impl.FlowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Check Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Node</em>'.
	 * @generated
	 */
	CheckNode createCheckNode();

	/**
	 * Returns a new object of class '<em>Normal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Node</em>'.
	 * @generated
	 */
	NormalNode createNormalNode();

	/**
	 * Returns a new object of class '<em>Begin Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Begin Node</em>'.
	 * @generated
	 */
	BeginNode createBeginNode();

	/**
	 * Returns a new object of class '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Node</em>'.
	 * @generated
	 */
	EndNode createEndNode();

	/**
	 * Returns a new object of class '<em>Execute Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Node</em>'.
	 * @generated
	 */
	ExecuteNode createExecuteNode();

	/**
	 * Returns a new object of class '<em>Info From User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info From User</em>'.
	 * @generated
	 */
	InfoFromUser createInfoFromUser();

	/**
	 * Returns a new object of class '<em>Info To User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info To User</em>'.
	 * @generated
	 */
	InfoToUser createInfoToUser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FlowPackage getFlowPackage();

} //FlowFactory
