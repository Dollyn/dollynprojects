/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flow.UserInfo#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see flow.FlowPackage#getUserInfo()
 * @model
 * @generated
 */
public interface UserInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(NormalNode)
	 * @see flow.FlowPackage#getUserInfo_EReference0()
	 * @model
	 * @generated
	 */
	NormalNode getEReference0();

	/**
	 * Sets the value of the '{@link flow.UserInfo#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(NormalNode value);

} // UserInfo
