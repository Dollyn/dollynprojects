/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flow.NormalNode#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see flow.FlowPackage#getNormalNode()
 * @model
 * @generated
 */
public interface NormalNode extends INode {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(INode)
	 * @see flow.FlowPackage#getNormalNode_Next()
	 * @model
	 * @generated
	 */
	INode getNext();

	/**
	 * Sets the value of the '{@link flow.NormalNode#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(INode value);

} // NormalNode
