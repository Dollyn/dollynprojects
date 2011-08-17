/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package flow.impl;

import flow.BeginNode;
import flow.EndNode;
import flow.Flow;
import flow.FlowPackage;
import flow.INode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link flow.impl.FlowImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link flow.impl.FlowImpl#getBeginNode <em>Begin Node</em>}</li>
 *   <li>{@link flow.impl.FlowImpl#getEndNode <em>End Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends EObjectImpl implements Flow {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<INode> nodes;

	/**
	 * The cached value of the '{@link #getBeginNode() <em>Begin Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginNode()
	 * @generated
	 * @ordered
	 */
	protected BeginNode beginNode;

	/**
	 * The cached value of the '{@link #getEndNode() <em>End Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndNode()
	 * @generated
	 * @ordered
	 */
	protected EndNode endNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<INode>(INode.class, this, FlowPackage.FLOW__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginNode getBeginNode() {
		if (beginNode != null && beginNode.eIsProxy()) {
			InternalEObject oldBeginNode = (InternalEObject)beginNode;
			beginNode = (BeginNode)eResolveProxy(oldBeginNode);
			if (beginNode != oldBeginNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.FLOW__BEGIN_NODE, oldBeginNode, beginNode));
			}
		}
		return beginNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginNode basicGetBeginNode() {
		return beginNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndNode getEndNode() {
		if (endNode != null && endNode.eIsProxy()) {
			InternalEObject oldEndNode = (InternalEObject)endNode;
			endNode = (EndNode)eResolveProxy(oldEndNode);
			if (endNode != oldEndNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.FLOW__END_NODE, oldEndNode, endNode));
			}
		}
		return endNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndNode basicGetEndNode() {
		return endNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndNode(EndNode newEndNode) {
		EndNode oldEndNode = endNode;
		endNode = newEndNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FLOW__END_NODE, oldEndNode, endNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.FLOW__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.FLOW__NODES:
				return getNodes();
			case FlowPackage.FLOW__BEGIN_NODE:
				if (resolve) return getBeginNode();
				return basicGetBeginNode();
			case FlowPackage.FLOW__END_NODE:
				if (resolve) return getEndNode();
				return basicGetEndNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.FLOW__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends INode>)newValue);
				return;
			case FlowPackage.FLOW__END_NODE:
				setEndNode((EndNode)newValue);
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
			case FlowPackage.FLOW__NODES:
				getNodes().clear();
				return;
			case FlowPackage.FLOW__END_NODE:
				setEndNode((EndNode)null);
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
			case FlowPackage.FLOW__NODES:
				return nodes != null && !nodes.isEmpty();
			case FlowPackage.FLOW__BEGIN_NODE:
				return beginNode != null;
			case FlowPackage.FLOW__END_NODE:
				return endNode != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
