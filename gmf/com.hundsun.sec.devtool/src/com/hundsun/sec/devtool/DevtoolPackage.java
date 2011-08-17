/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hundsun.sec.devtool;

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
 * @see com.hundsun.sec.devtool.DevtoolFactory
 * @model kind="package"
 * @generated
 */
public interface DevtoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devtool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sec.hundsun.com/devtool";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devtool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevtoolPackage eINSTANCE = com.hundsun.sec.devtool.impl.DevtoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.hundsun.sec.devtool.IComponent <em>IComponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hundsun.sec.devtool.IComponent
	 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getIComponent()
	 * @generated
	 */
	int ICOMPONENT = 0;

	/**
	 * The number of structural features of the '<em>IComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hundsun.sec.devtool.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hundsun.sec.devtool.impl.ControlImpl
	 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONDITION = ICOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__IF_FLOW = ICOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ELSE_FLOW = ICOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = ICOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.hundsun.sec.devtool.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hundsun.sec.devtool.impl.FunctionImpl
	 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Componets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMPONETS = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__START = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link com.hundsun.sec.devtool.impl.GeneralComponetImpl <em>General Componet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hundsun.sec.devtool.impl.GeneralComponetImpl
	 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getGeneralComponet()
	 * @generated
	 */
	int GENERAL_COMPONET = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_COMPONET__NEXT = ICOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>General Componet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_COMPONET_FEATURE_COUNT = ICOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.hundsun.sec.devtool.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hundsun.sec.devtool.impl.FunctionCallImpl
	 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NEXT = GENERAL_COMPONET__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NAME = GENERAL_COMPONET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = GENERAL_COMPONET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.hundsun.sec.devtool.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hundsun.sec.devtool.impl.StartImpl
	 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getStart()
	 * @generated
	 */
	int START = 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NEXT = GENERAL_COMPONET__NEXT;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = GENERAL_COMPONET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.hundsun.sec.devtool.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hundsun.sec.devtool.impl.EndImpl
	 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getEnd()
	 * @generated
	 */
	int END = 6;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NEXT = GENERAL_COMPONET__NEXT;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = GENERAL_COMPONET_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.hundsun.sec.devtool.IComponent <em>IComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IComponent</em>'.
	 * @see com.hundsun.sec.devtool.IComponent
	 * @generated
	 */
	EClass getIComponent();

	/**
	 * Returns the meta object for class '{@link com.hundsun.sec.devtool.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see com.hundsun.sec.devtool.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link com.hundsun.sec.devtool.Control#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see com.hundsun.sec.devtool.Control#getCondition()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Condition();

	/**
	 * Returns the meta object for the reference '{@link com.hundsun.sec.devtool.Control#getIfFlow <em>If Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Flow</em>'.
	 * @see com.hundsun.sec.devtool.Control#getIfFlow()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_IfFlow();

	/**
	 * Returns the meta object for the reference '{@link com.hundsun.sec.devtool.Control#getElseFlow <em>Else Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Flow</em>'.
	 * @see com.hundsun.sec.devtool.Control#getElseFlow()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_ElseFlow();

	/**
	 * Returns the meta object for class '{@link com.hundsun.sec.devtool.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see com.hundsun.sec.devtool.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link com.hundsun.sec.devtool.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hundsun.sec.devtool.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hundsun.sec.devtool.Function#getComponets <em>Componets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componets</em>'.
	 * @see com.hundsun.sec.devtool.Function#getComponets()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Componets();

	/**
	 * Returns the meta object for the containment reference '{@link com.hundsun.sec.devtool.Function#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see com.hundsun.sec.devtool.Function#getStart()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Start();

	/**
	 * Returns the meta object for class '{@link com.hundsun.sec.devtool.GeneralComponet <em>General Componet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Componet</em>'.
	 * @see com.hundsun.sec.devtool.GeneralComponet
	 * @generated
	 */
	EClass getGeneralComponet();

	/**
	 * Returns the meta object for the reference '{@link com.hundsun.sec.devtool.GeneralComponet#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see com.hundsun.sec.devtool.GeneralComponet#getNext()
	 * @see #getGeneralComponet()
	 * @generated
	 */
	EReference getGeneralComponet_Next();

	/**
	 * Returns the meta object for class '{@link com.hundsun.sec.devtool.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see com.hundsun.sec.devtool.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link com.hundsun.sec.devtool.FunctionCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hundsun.sec.devtool.FunctionCall#getName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_Name();

	/**
	 * Returns the meta object for class '{@link com.hundsun.sec.devtool.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see com.hundsun.sec.devtool.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link com.hundsun.sec.devtool.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see com.hundsun.sec.devtool.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevtoolFactory getDevtoolFactory();

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
		 * The meta object literal for the '{@link com.hundsun.sec.devtool.IComponent <em>IComponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hundsun.sec.devtool.IComponent
		 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getIComponent()
		 * @generated
		 */
		EClass ICOMPONENT = eINSTANCE.getIComponent();

		/**
		 * The meta object literal for the '{@link com.hundsun.sec.devtool.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hundsun.sec.devtool.impl.ControlImpl
		 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__CONDITION = eINSTANCE.getControl_Condition();

		/**
		 * The meta object literal for the '<em><b>If Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__IF_FLOW = eINSTANCE.getControl_IfFlow();

		/**
		 * The meta object literal for the '<em><b>Else Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__ELSE_FLOW = eINSTANCE.getControl_ElseFlow();

		/**
		 * The meta object literal for the '{@link com.hundsun.sec.devtool.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hundsun.sec.devtool.impl.FunctionImpl
		 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Componets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__COMPONETS = eINSTANCE.getFunction_Componets();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__START = eINSTANCE.getFunction_Start();

		/**
		 * The meta object literal for the '{@link com.hundsun.sec.devtool.impl.GeneralComponetImpl <em>General Componet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hundsun.sec.devtool.impl.GeneralComponetImpl
		 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getGeneralComponet()
		 * @generated
		 */
		EClass GENERAL_COMPONET = eINSTANCE.getGeneralComponet();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_COMPONET__NEXT = eINSTANCE.getGeneralComponet_Next();

		/**
		 * The meta object literal for the '{@link com.hundsun.sec.devtool.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hundsun.sec.devtool.impl.FunctionCallImpl
		 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

		/**
		 * The meta object literal for the '{@link com.hundsun.sec.devtool.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hundsun.sec.devtool.impl.StartImpl
		 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link com.hundsun.sec.devtool.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hundsun.sec.devtool.impl.EndImpl
		 * @see com.hundsun.sec.devtool.impl.DevtoolPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

	}

} //DevtoolPackage
