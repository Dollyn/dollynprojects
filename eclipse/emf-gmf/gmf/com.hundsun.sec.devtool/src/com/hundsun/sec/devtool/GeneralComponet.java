/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hundsun.sec.devtool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Componet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hundsun.sec.devtool.GeneralComponet#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hundsun.sec.devtool.DevtoolPackage#getGeneralComponet()
 * @model abstract="true"
 * @generated
 */
public interface GeneralComponet extends IComponent {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(IComponent)
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getGeneralComponet_Next()
	 * @model
	 * @generated
	 */
	IComponent getNext();

	/**
	 * Sets the value of the '{@link com.hundsun.sec.devtool.GeneralComponet#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(IComponent value);

} // GeneralComponet
