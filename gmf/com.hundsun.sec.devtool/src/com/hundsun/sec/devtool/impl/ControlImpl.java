/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hundsun.sec.devtool.impl;

import com.hundsun.sec.devtool.Control;
import com.hundsun.sec.devtool.DevtoolPackage;
import com.hundsun.sec.devtool.IComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hundsun.sec.devtool.impl.ControlImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.hundsun.sec.devtool.impl.ControlImpl#getIfFlow <em>If Flow</em>}</li>
 *   <li>{@link com.hundsun.sec.devtool.impl.ControlImpl#getElseFlow <em>Else Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlImpl extends EObjectImpl implements Control {
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
	 * The cached value of the '{@link #getIfFlow() <em>If Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFlow()
	 * @generated
	 * @ordered
	 */
	protected IComponent ifFlow;

	/**
	 * The cached value of the '{@link #getElseFlow() <em>Else Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseFlow()
	 * @generated
	 * @ordered
	 */
	protected IComponent elseFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevtoolPackage.Literals.CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DevtoolPackage.CONTROL__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComponent getIfFlow() {
		if (ifFlow != null && ifFlow.eIsProxy()) {
			InternalEObject oldIfFlow = (InternalEObject)ifFlow;
			ifFlow = (IComponent)eResolveProxy(oldIfFlow);
			if (ifFlow != oldIfFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevtoolPackage.CONTROL__IF_FLOW, oldIfFlow, ifFlow));
			}
		}
		return ifFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComponent basicGetIfFlow() {
		return ifFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfFlow(IComponent newIfFlow) {
		IComponent oldIfFlow = ifFlow;
		ifFlow = newIfFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevtoolPackage.CONTROL__IF_FLOW, oldIfFlow, ifFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComponent getElseFlow() {
		if (elseFlow != null && elseFlow.eIsProxy()) {
			InternalEObject oldElseFlow = (InternalEObject)elseFlow;
			elseFlow = (IComponent)eResolveProxy(oldElseFlow);
			if (elseFlow != oldElseFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevtoolPackage.CONTROL__ELSE_FLOW, oldElseFlow, elseFlow));
			}
		}
		return elseFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComponent basicGetElseFlow() {
		return elseFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseFlow(IComponent newElseFlow) {
		IComponent oldElseFlow = elseFlow;
		elseFlow = newElseFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevtoolPackage.CONTROL__ELSE_FLOW, oldElseFlow, elseFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevtoolPackage.CONTROL__CONDITION:
				return getCondition();
			case DevtoolPackage.CONTROL__IF_FLOW:
				if (resolve) return getIfFlow();
				return basicGetIfFlow();
			case DevtoolPackage.CONTROL__ELSE_FLOW:
				if (resolve) return getElseFlow();
				return basicGetElseFlow();
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
			case DevtoolPackage.CONTROL__CONDITION:
				setCondition((String)newValue);
				return;
			case DevtoolPackage.CONTROL__IF_FLOW:
				setIfFlow((IComponent)newValue);
				return;
			case DevtoolPackage.CONTROL__ELSE_FLOW:
				setElseFlow((IComponent)newValue);
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
			case DevtoolPackage.CONTROL__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DevtoolPackage.CONTROL__IF_FLOW:
				setIfFlow((IComponent)null);
				return;
			case DevtoolPackage.CONTROL__ELSE_FLOW:
				setElseFlow((IComponent)null);
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
			case DevtoolPackage.CONTROL__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DevtoolPackage.CONTROL__IF_FLOW:
				return ifFlow != null;
			case DevtoolPackage.CONTROL__ELSE_FLOW:
				return elseFlow != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
