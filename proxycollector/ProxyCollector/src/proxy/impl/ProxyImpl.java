/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package proxy.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import proxy.Proxy;
import proxy.ProxyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proxy.impl.ProxyImpl#getName <em>Name</em>}</li>
 *   <li>{@link proxy.impl.ProxyImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link proxy.impl.ProxyImpl#getPort <em>Port</em>}</li>
 *   <li>{@link proxy.impl.ProxyImpl#getContry <em>Contry</em>}</li>
 *   <li>{@link proxy.impl.ProxyImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link proxy.impl.ProxyImpl#getCreateDate <em>Create Date</em>}</li>
 *   <li>{@link proxy.impl.ProxyImpl#getLastValidateDate <em>Last Validate Date</em>}</li>
 *   <li>{@link proxy.impl.ProxyImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProxyImpl extends EObjectImpl implements Proxy {
    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
    protected static final String IP_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
    protected String ip = IP_EDEFAULT;

    /**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
    protected static final String PORT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
    protected String port = PORT_EDEFAULT;

    /**
	 * The default value of the '{@link #getContry() <em>Contry</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContry()
	 * @generated
	 * @ordered
	 */
    protected static final String CONTRY_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getContry() <em>Contry</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContry()
	 * @generated
	 * @ordered
	 */
    protected String contry = CONTRY_EDEFAULT;

    /**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
    protected static final String LOCATION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
    protected String location = LOCATION_EDEFAULT;

    /**
	 * The default value of the '{@link #getCreateDate() <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCreateDate()
	 * @generated
	 * @ordered
	 */
    protected static final Date CREATE_DATE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getCreateDate() <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCreateDate()
	 * @generated
	 * @ordered
	 */
    protected Date createDate = CREATE_DATE_EDEFAULT;

    /**
	 * The default value of the '{@link #getLastValidateDate() <em>Last Validate Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLastValidateDate()
	 * @generated
	 * @ordered
	 */
    protected static final Date LAST_VALIDATE_DATE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLastValidateDate() <em>Last Validate Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLastValidateDate()
	 * @generated
	 * @ordered
	 */
    protected Date lastValidateDate = LAST_VALIDATE_DATE_EDEFAULT;

    /**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_EDEFAULT = 0;

				/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected int delay = DELAY_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ProxyImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ProxyPackage.Literals.PROXY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getIp() {
		return ip;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__IP, oldIp, ip));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getPort() {
		return port;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__PORT, oldPort, port));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getContry() {
		return contry;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContry(String newContry) {
		String oldContry = contry;
		contry = newContry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__CONTRY, oldContry, contry));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLocation() {
		return location;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__LOCATION, oldLocation, location));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Date getCreateDate() {
		return createDate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCreateDate(Date newCreateDate) {
		Date oldCreateDate = createDate;
		createDate = newCreateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__CREATE_DATE, oldCreateDate, createDate));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Date getLastValidateDate() {
		return lastValidateDate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLastValidateDate(Date newLastValidateDate) {
		Date oldLastValidateDate = lastValidateDate;
		lastValidateDate = newLastValidateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__LAST_VALIDATE_DATE, oldLastValidateDate, lastValidateDate));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelay() {
		return delay;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(int newDelay) {
		int oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProxyPackage.PROXY__DELAY, oldDelay, delay));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void test() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProxyPackage.PROXY__NAME:
				return getName();
			case ProxyPackage.PROXY__IP:
				return getIp();
			case ProxyPackage.PROXY__PORT:
				return getPort();
			case ProxyPackage.PROXY__CONTRY:
				return getContry();
			case ProxyPackage.PROXY__LOCATION:
				return getLocation();
			case ProxyPackage.PROXY__CREATE_DATE:
				return getCreateDate();
			case ProxyPackage.PROXY__LAST_VALIDATE_DATE:
				return getLastValidateDate();
			case ProxyPackage.PROXY__DELAY:
				return getDelay();
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
			case ProxyPackage.PROXY__NAME:
				setName((String)newValue);
				return;
			case ProxyPackage.PROXY__IP:
				setIp((String)newValue);
				return;
			case ProxyPackage.PROXY__PORT:
				setPort((String)newValue);
				return;
			case ProxyPackage.PROXY__CONTRY:
				setContry((String)newValue);
				return;
			case ProxyPackage.PROXY__LOCATION:
				setLocation((String)newValue);
				return;
			case ProxyPackage.PROXY__CREATE_DATE:
				setCreateDate((Date)newValue);
				return;
			case ProxyPackage.PROXY__LAST_VALIDATE_DATE:
				setLastValidateDate((Date)newValue);
				return;
			case ProxyPackage.PROXY__DELAY:
				setDelay((Integer)newValue);
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
			case ProxyPackage.PROXY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProxyPackage.PROXY__IP:
				setIp(IP_EDEFAULT);
				return;
			case ProxyPackage.PROXY__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ProxyPackage.PROXY__CONTRY:
				setContry(CONTRY_EDEFAULT);
				return;
			case ProxyPackage.PROXY__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ProxyPackage.PROXY__CREATE_DATE:
				setCreateDate(CREATE_DATE_EDEFAULT);
				return;
			case ProxyPackage.PROXY__LAST_VALIDATE_DATE:
				setLastValidateDate(LAST_VALIDATE_DATE_EDEFAULT);
				return;
			case ProxyPackage.PROXY__DELAY:
				setDelay(DELAY_EDEFAULT);
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
			case ProxyPackage.PROXY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProxyPackage.PROXY__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case ProxyPackage.PROXY__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ProxyPackage.PROXY__CONTRY:
				return CONTRY_EDEFAULT == null ? contry != null : !CONTRY_EDEFAULT.equals(contry);
			case ProxyPackage.PROXY__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ProxyPackage.PROXY__CREATE_DATE:
				return CREATE_DATE_EDEFAULT == null ? createDate != null : !CREATE_DATE_EDEFAULT.equals(createDate);
			case ProxyPackage.PROXY__LAST_VALIDATE_DATE:
				return LAST_VALIDATE_DATE_EDEFAULT == null ? lastValidateDate != null : !LAST_VALIDATE_DATE_EDEFAULT.equals(lastValidateDate);
			case ProxyPackage.PROXY__DELAY:
				return delay != DELAY_EDEFAULT;
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
		result.append(", ip: ");
		result.append(ip);
		result.append(", port: ");
		result.append(port);
		result.append(", contry: ");
		result.append(contry);
		result.append(", location: ");
		result.append(location);
		result.append(", createDate: ");
		result.append(createDate);
		result.append(", lastValidateDate: ");
		result.append(lastValidateDate);
		result.append(", delay: ");
		result.append(delay);
		result.append(')');
		return result.toString();
	}

} //ProxyImpl
