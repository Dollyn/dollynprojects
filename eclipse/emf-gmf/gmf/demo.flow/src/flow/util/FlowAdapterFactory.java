/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow.util;

import flow.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see flow.FlowPackage
 * @generated
 */
public class FlowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSwitch<Adapter> modelSwitch =
		new FlowSwitch<Adapter>() {
			@Override
			public Adapter caseINode(INode object) {
				return createINodeAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseCheckNode(CheckNode object) {
				return createCheckNodeAdapter();
			}
			@Override
			public Adapter caseNormalNode(NormalNode object) {
				return createNormalNodeAdapter();
			}
			@Override
			public Adapter caseBeginNode(BeginNode object) {
				return createBeginNodeAdapter();
			}
			@Override
			public Adapter caseEndNode(EndNode object) {
				return createEndNodeAdapter();
			}
			@Override
			public Adapter caseExecuteNode(ExecuteNode object) {
				return createExecuteNodeAdapter();
			}
			@Override
			public Adapter caseInfoFromUser(InfoFromUser object) {
				return createInfoFromUserAdapter();
			}
			@Override
			public Adapter caseInfoToUser(InfoToUser object) {
				return createInfoToUserAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link flow.INode <em>INode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.INode
	 * @generated
	 */
	public Adapter createINodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.CheckNode <em>Check Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.CheckNode
	 * @generated
	 */
	public Adapter createCheckNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.NormalNode <em>Normal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.NormalNode
	 * @generated
	 */
	public Adapter createNormalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.BeginNode <em>Begin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.BeginNode
	 * @generated
	 */
	public Adapter createBeginNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.EndNode <em>End Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.EndNode
	 * @generated
	 */
	public Adapter createEndNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.ExecuteNode <em>Execute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.ExecuteNode
	 * @generated
	 */
	public Adapter createExecuteNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.InfoFromUser <em>Info From User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.InfoFromUser
	 * @generated
	 */
	public Adapter createInfoFromUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.InfoToUser <em>Info To User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.InfoToUser
	 * @generated
	 */
	public Adapter createInfoToUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FlowAdapterFactory
