/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flow.CheckNode#getIfFlow <em>If Flow</em>}</li>
 *   <li>{@link flow.CheckNode#getElseFlow <em>Else Flow</em>}</li>
 *   <li>{@link flow.CheckNode#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see flow.FlowPackage#getCheckNode()
 * @model
 * @generated
 */
public interface CheckNode extends INode {
	/**
	 * Returns the value of the '<em><b>If Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Flow</em>' reference.
	 * @see #setIfFlow(INode)
	 * @see flow.FlowPackage#getCheckNode_IfFlow()
	 * @model
	 * @generated
	 */
	INode getIfFlow();

	/**
	 * Sets the value of the '{@link flow.CheckNode#getIfFlow <em>If Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Flow</em>' reference.
	 * @see #getIfFlow()
	 * @generated
	 */
	void setIfFlow(INode value);

	/**
	 * Returns the value of the '<em><b>Else Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Flow</em>' reference.
	 * @see #setElseFlow(INode)
	 * @see flow.FlowPackage#getCheckNode_ElseFlow()
	 * @model
	 * @generated
	 */
	INode getElseFlow();

	/**
	 * Sets the value of the '{@link flow.CheckNode#getElseFlow <em>Else Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Flow</em>' reference.
	 * @see #getElseFlow()
	 * @generated
	 */
	void setElseFlow(INode value);

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
	 * @see flow.FlowPackage#getCheckNode_Condition()
	 * @model default=""
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link flow.CheckNode#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // CheckNode
