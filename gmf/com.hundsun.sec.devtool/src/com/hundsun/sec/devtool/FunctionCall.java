/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hundsun.sec.devtool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hundsun.sec.devtool.FunctionCall#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hundsun.sec.devtool.DevtoolPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends GeneralComponet {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getFunctionCall_Name()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hundsun.sec.devtool.FunctionCall#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FunctionCall
