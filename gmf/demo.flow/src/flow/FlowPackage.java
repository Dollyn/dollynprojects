/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://demo/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link flow.INode <em>INode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.INode
	 * @see flow.impl.FlowPackageImpl#getINode()
	 * @generated
	 */
	int INODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>INode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link flow.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.FlowImpl
	 * @see flow.impl.FlowPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NODES = 0;

	/**
	 * The feature id for the '<em><b>Begin Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BEGIN_NODE = 1;

	/**
	 * The feature id for the '<em><b>End Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__END_NODE = 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link flow.impl.CheckNodeImpl <em>Check Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.CheckNodeImpl
	 * @see flow.impl.FlowPackageImpl#getCheckNode()
	 * @generated
	 */
	int CHECK_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__NAME = INODE__NAME;

	/**
	 * The feature id for the '<em><b>If Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__IF_FLOW = INODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__ELSE_FLOW = INODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__CONDITION = INODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Check Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE_FEATURE_COUNT = INODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link flow.impl.NormalNodeImpl <em>Normal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.NormalNodeImpl
	 * @see flow.impl.FlowPackageImpl#getNormalNode()
	 * @generated
	 */
	int NORMAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NODE__NAME = INODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NODE__NEXT = INODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NODE_FEATURE_COUNT = INODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flow.impl.BeginNodeImpl <em>Begin Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.BeginNodeImpl
	 * @see flow.impl.FlowPackageImpl#getBeginNode()
	 * @generated
	 */
	int BEGIN_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_NODE__NAME = NORMAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_NODE__NEXT = NORMAL_NODE__NEXT;

	/**
	 * The number of structural features of the '<em>Begin Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_NODE_FEATURE_COUNT = NORMAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.EndNodeImpl <em>End Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.EndNodeImpl
	 * @see flow.impl.FlowPackageImpl#getEndNode()
	 * @generated
	 */
	int END_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE__NAME = NORMAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE__NEXT = NORMAL_NODE__NEXT;

	/**
	 * The number of structural features of the '<em>End Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_NODE_FEATURE_COUNT = NORMAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.ExecuteNodeImpl <em>Execute Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.ExecuteNodeImpl
	 * @see flow.impl.FlowPackageImpl#getExecuteNode()
	 * @generated
	 */
	int EXECUTE_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_NODE__NAME = NORMAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_NODE__NEXT = NORMAL_NODE__NEXT;

	/**
	 * The number of structural features of the '<em>Execute Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_NODE_FEATURE_COUNT = NORMAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.InfoFromUserImpl <em>Info From User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.InfoFromUserImpl
	 * @see flow.impl.FlowPackageImpl#getInfoFromUser()
	 * @generated
	 */
	int INFO_FROM_USER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FROM_USER__NAME = NORMAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FROM_USER__NEXT = NORMAL_NODE__NEXT;

	/**
	 * The number of structural features of the '<em>Info From User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FROM_USER_FEATURE_COUNT = NORMAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.InfoToUserImpl <em>Info To User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.InfoToUserImpl
	 * @see flow.impl.FlowPackageImpl#getInfoToUser()
	 * @generated
	 */
	int INFO_TO_USER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TO_USER__NAME = NORMAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TO_USER__NEXT = NORMAL_NODE__NEXT;

	/**
	 * The number of structural features of the '<em>Info To User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TO_USER_FEATURE_COUNT = NORMAL_NODE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link flow.INode <em>INode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INode</em>'.
	 * @see flow.INode
	 * @generated
	 */
	EClass getINode();

	/**
	 * Returns the meta object for the attribute '{@link flow.INode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flow.INode#getName()
	 * @see #getINode()
	 * @generated
	 */
	EAttribute getINode_Name();

	/**
	 * Returns the meta object for class '{@link flow.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see flow.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.Flow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see flow.Flow#getNodes()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Nodes();

	/**
	 * Returns the meta object for the reference '{@link flow.Flow#getBeginNode <em>Begin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Begin Node</em>'.
	 * @see flow.Flow#getBeginNode()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_BeginNode();

	/**
	 * Returns the meta object for the reference '{@link flow.Flow#getEndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Node</em>'.
	 * @see flow.Flow#getEndNode()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_EndNode();

	/**
	 * Returns the meta object for class '{@link flow.CheckNode <em>Check Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Node</em>'.
	 * @see flow.CheckNode
	 * @generated
	 */
	EClass getCheckNode();

	/**
	 * Returns the meta object for the reference '{@link flow.CheckNode#getIfFlow <em>If Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Flow</em>'.
	 * @see flow.CheckNode#getIfFlow()
	 * @see #getCheckNode()
	 * @generated
	 */
	EReference getCheckNode_IfFlow();

	/**
	 * Returns the meta object for the reference '{@link flow.CheckNode#getElseFlow <em>Else Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Flow</em>'.
	 * @see flow.CheckNode#getElseFlow()
	 * @see #getCheckNode()
	 * @generated
	 */
	EReference getCheckNode_ElseFlow();

	/**
	 * Returns the meta object for the attribute '{@link flow.CheckNode#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see flow.CheckNode#getCondition()
	 * @see #getCheckNode()
	 * @generated
	 */
	EAttribute getCheckNode_Condition();

	/**
	 * Returns the meta object for class '{@link flow.NormalNode <em>Normal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Node</em>'.
	 * @see flow.NormalNode
	 * @generated
	 */
	EClass getNormalNode();

	/**
	 * Returns the meta object for the reference '{@link flow.NormalNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see flow.NormalNode#getNext()
	 * @see #getNormalNode()
	 * @generated
	 */
	EReference getNormalNode_Next();

	/**
	 * Returns the meta object for class '{@link flow.BeginNode <em>Begin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begin Node</em>'.
	 * @see flow.BeginNode
	 * @generated
	 */
	EClass getBeginNode();

	/**
	 * Returns the meta object for class '{@link flow.EndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Node</em>'.
	 * @see flow.EndNode
	 * @generated
	 */
	EClass getEndNode();

	/**
	 * Returns the meta object for class '{@link flow.ExecuteNode <em>Execute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Node</em>'.
	 * @see flow.ExecuteNode
	 * @generated
	 */
	EClass getExecuteNode();

	/**
	 * Returns the meta object for class '{@link flow.InfoFromUser <em>Info From User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info From User</em>'.
	 * @see flow.InfoFromUser
	 * @generated
	 */
	EClass getInfoFromUser();

	/**
	 * Returns the meta object for class '{@link flow.InfoToUser <em>Info To User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info To User</em>'.
	 * @see flow.InfoToUser
	 * @generated
	 */
	EClass getInfoToUser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flow.INode <em>INode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.INode
		 * @see flow.impl.FlowPackageImpl#getINode()
		 * @generated
		 */
		EClass INODE = eINSTANCE.getINode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INODE__NAME = eINSTANCE.getINode_Name();

		/**
		 * The meta object literal for the '{@link flow.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.FlowImpl
		 * @see flow.impl.FlowPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__NODES = eINSTANCE.getFlow_Nodes();

		/**
		 * The meta object literal for the '<em><b>Begin Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BEGIN_NODE = eINSTANCE.getFlow_BeginNode();

		/**
		 * The meta object literal for the '<em><b>End Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__END_NODE = eINSTANCE.getFlow_EndNode();

		/**
		 * The meta object literal for the '{@link flow.impl.CheckNodeImpl <em>Check Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.CheckNodeImpl
		 * @see flow.impl.FlowPackageImpl#getCheckNode()
		 * @generated
		 */
		EClass CHECK_NODE = eINSTANCE.getCheckNode();

		/**
		 * The meta object literal for the '<em><b>If Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_NODE__IF_FLOW = eINSTANCE.getCheckNode_IfFlow();

		/**
		 * The meta object literal for the '<em><b>Else Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_NODE__ELSE_FLOW = eINSTANCE.getCheckNode_ElseFlow();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_NODE__CONDITION = eINSTANCE.getCheckNode_Condition();

		/**
		 * The meta object literal for the '{@link flow.impl.NormalNodeImpl <em>Normal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.NormalNodeImpl
		 * @see flow.impl.FlowPackageImpl#getNormalNode()
		 * @generated
		 */
		EClass NORMAL_NODE = eINSTANCE.getNormalNode();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_NODE__NEXT = eINSTANCE.getNormalNode_Next();

		/**
		 * The meta object literal for the '{@link flow.impl.BeginNodeImpl <em>Begin Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.BeginNodeImpl
		 * @see flow.impl.FlowPackageImpl#getBeginNode()
		 * @generated
		 */
		EClass BEGIN_NODE = eINSTANCE.getBeginNode();

		/**
		 * The meta object literal for the '{@link flow.impl.EndNodeImpl <em>End Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.EndNodeImpl
		 * @see flow.impl.FlowPackageImpl#getEndNode()
		 * @generated
		 */
		EClass END_NODE = eINSTANCE.getEndNode();

		/**
		 * The meta object literal for the '{@link flow.impl.ExecuteNodeImpl <em>Execute Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.ExecuteNodeImpl
		 * @see flow.impl.FlowPackageImpl#getExecuteNode()
		 * @generated
		 */
		EClass EXECUTE_NODE = eINSTANCE.getExecuteNode();

		/**
		 * The meta object literal for the '{@link flow.impl.InfoFromUserImpl <em>Info From User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.InfoFromUserImpl
		 * @see flow.impl.FlowPackageImpl#getInfoFromUser()
		 * @generated
		 */
		EClass INFO_FROM_USER = eINSTANCE.getInfoFromUser();

		/**
		 * The meta object literal for the '{@link flow.impl.InfoToUserImpl <em>Info To User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.InfoToUserImpl
		 * @see flow.impl.FlowPackageImpl#getInfoToUser()
		 * @generated
		 */
		EClass INFO_TO_USER = eINSTANCE.getInfoToUser();

	}

} //FlowPackage
