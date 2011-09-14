/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link flow.Flow#getNodes <em>Nodes</em>}</li>
 *   <li>{@link flow.Flow#getBeginNode <em>Begin Node</em>}</li>
 *   <li>{@link flow.Flow#getEndNode <em>End Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see flow.FlowPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link flow.INode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see flow.FlowPackage#getFlow_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<INode> getNodes();

	/**
	 * Returns the value of the '<em><b>Begin Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Node</em>' reference.
	 * @see flow.FlowPackage#getFlow_BeginNode()
	 * @model changeable="false"
	 * @generated
	 */
	BeginNode getBeginNode();

	/**
	 * Returns the value of the '<em><b>End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Node</em>' reference.
	 * @see #setEndNode(EndNode)
	 * @see flow.FlowPackage#getFlow_EndNode()
	 * @model
	 * @generated
	 */
	EndNode getEndNode();

	/**
	 * Sets the value of the '{@link flow.Flow#getEndNode <em>End Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Node</em>' reference.
	 * @see #getEndNode()
	 * @generated
	 */
	void setEndNode(EndNode value);

} // Flow
