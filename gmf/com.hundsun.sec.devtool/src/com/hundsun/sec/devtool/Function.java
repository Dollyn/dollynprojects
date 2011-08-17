/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hundsun.sec.devtool;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hundsun.sec.devtool.Function#getName <em>Name</em>}</li>
 *   <li>{@link com.hundsun.sec.devtool.Function#getComponets <em>Componets</em>}</li>
 *   <li>{@link com.hundsun.sec.devtool.Function#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hundsun.sec.devtool.DevtoolPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getFunction_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hundsun.sec.devtool.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Componets</b></em>' containment reference list.
	 * The list contents are of type {@link com.hundsun.sec.devtool.IComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componets</em>' containment reference list.
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getFunction_Componets()
	 * @model containment="true"
	 * @generated
	 */
	EList<IComponent> getComponets();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getFunction_Start()
	 * @model containment="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link com.hundsun.sec.devtool.Function#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

} // Function
