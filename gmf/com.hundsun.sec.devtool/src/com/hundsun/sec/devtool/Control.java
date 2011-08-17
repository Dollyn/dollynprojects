/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hundsun.sec.devtool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hundsun.sec.devtool.Control#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.hundsun.sec.devtool.Control#getIfFlow <em>If Flow</em>}</li>
 *   <li>{@link com.hundsun.sec.devtool.Control#getElseFlow <em>Else Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hundsun.sec.devtool.DevtoolPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends IComponent {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getControl_Condition()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link com.hundsun.sec.devtool.Control#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>If Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Flow</em>' reference.
	 * @see #setIfFlow(IComponent)
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getControl_IfFlow()
	 * @model
	 * @generated
	 */
	IComponent getIfFlow();

	/**
	 * Sets the value of the '{@link com.hundsun.sec.devtool.Control#getIfFlow <em>If Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Flow</em>' reference.
	 * @see #getIfFlow()
	 * @generated
	 */
	void setIfFlow(IComponent value);

	/**
	 * Returns the value of the '<em><b>Else Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Flow</em>' reference.
	 * @see #setElseFlow(IComponent)
	 * @see com.hundsun.sec.devtool.DevtoolPackage#getControl_ElseFlow()
	 * @model
	 * @generated
	 */
	IComponent getElseFlow();

	/**
	 * Sets the value of the '{@link com.hundsun.sec.devtool.Control#getElseFlow <em>Else Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Flow</em>' reference.
	 * @see #getElseFlow()
	 * @generated
	 */
	void setElseFlow(IComponent value);

} // Control
