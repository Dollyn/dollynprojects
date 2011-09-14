/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow.impl;

import flow.CheckNode;
import flow.FlowPackage;
import flow.INode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link flow.impl.CheckNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link flow.impl.CheckNodeImpl#getIfFlow <em>If Flow</em>}</li>
 *   <li>{@link flow.impl.CheckNodeImpl#getElseFlow <em>Else Flow</em>}</li>
 *   <li>{@link flow.impl.CheckNodeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckNodeImpl extends EObjectImpl implements CheckNode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIfFlow() <em>If Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFlow()
	 * @generated
	 * @ordered
	 */
	protected INode ifFlow;

	/**
	 * The cached value of the '{@link #getElseFlow() <em>Else Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseFlow()
	 * @generated
	 * @ordered
	 */
	protected INode elseFlow;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.CHECK_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CHECK_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INode getIfFlow() {
		if (ifFlow != null && ifFlow.eIsProxy()) {
			InternalEObject oldIfFlow = (InternalEObject)ifFlow;
			ifFlow = (INode)eResolveProxy(oldIfFlow);
			if (ifFlow != oldIfFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.CHECK_NODE__IF_FLOW, oldIfFlow, ifFlow));
			}
		}
		return ifFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INode basicGetIfFlow() {
		return ifFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfFlow(INode newIfFlow) {
		INode oldIfFlow = ifFlow;
		ifFlow = newIfFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CHECK_NODE__IF_FLOW, oldIfFlow, ifFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INode getElseFlow() {
		if (elseFlow != null && elseFlow.eIsProxy()) {
			InternalEObject oldElseFlow = (InternalEObject)elseFlow;
			elseFlow = (INode)eResolveProxy(oldElseFlow);
			if (elseFlow != oldElseFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.CHECK_NODE__ELSE_FLOW, oldElseFlow, elseFlow));
			}
		}
		return elseFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INode basicGetElseFlow() {
		return elseFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseFlow(INode newElseFlow) {
		INode oldElseFlow = elseFlow;
		elseFlow = newElseFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CHECK_NODE__ELSE_FLOW, oldElseFlow, elseFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CHECK_NODE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.CHECK_NODE__NAME:
				return getName();
			case FlowPackage.CHECK_NODE__IF_FLOW:
				if (resolve) return getIfFlow();
				return basicGetIfFlow();
			case FlowPackage.CHECK_NODE__ELSE_FLOW:
				if (resolve) return getElseFlow();
				return basicGetElseFlow();
			case FlowPackage.CHECK_NODE__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.CHECK_NODE__NAME:
				setName((String)newValue);
				return;
			case FlowPackage.CHECK_NODE__IF_FLOW:
				setIfFlow((INode)newValue);
				return;
			case FlowPackage.CHECK_NODE__ELSE_FLOW:
				setElseFlow((INode)newValue);
				return;
			case FlowPackage.CHECK_NODE__CONDITION:
				setCondition((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FlowPackage.CHECK_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FlowPackage.CHECK_NODE__IF_FLOW:
				setIfFlow((INode)null);
				return;
			case FlowPackage.CHECK_NODE__ELSE_FLOW:
				setElseFlow((INode)null);
				return;
			case FlowPackage.CHECK_NODE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FlowPackage.CHECK_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FlowPackage.CHECK_NODE__IF_FLOW:
				return ifFlow != null;
			case FlowPackage.CHECK_NODE__ELSE_FLOW:
				return elseFlow != null;
			case FlowPackage.CHECK_NODE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //CheckNodeImpl
