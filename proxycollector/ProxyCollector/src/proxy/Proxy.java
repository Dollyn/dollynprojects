/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package proxy;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proxy.Proxy#getName <em>Name</em>}</li>
 *   <li>{@link proxy.Proxy#getIp <em>Ip</em>}</li>
 *   <li>{@link proxy.Proxy#getPort <em>Port</em>}</li>
 *   <li>{@link proxy.Proxy#getContry <em>Contry</em>}</li>
 *   <li>{@link proxy.Proxy#getLocation <em>Location</em>}</li>
 *   <li>{@link proxy.Proxy#getCreateDate <em>Create Date</em>}</li>
 *   <li>{@link proxy.Proxy#getLastValidateDate <em>Last Validate Date</em>}</li>
 *   <li>{@link proxy.Proxy#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see proxy.ProxyPackage#getProxy()
 * @model
 * @generated
 */
public interface Proxy extends EObject {
    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see proxy.ProxyPackage#getProxy_Name()
	 * @model
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link proxy.Proxy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ip</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see proxy.ProxyPackage#getProxy_Ip()
	 * @model
	 * @generated
	 */
    String getIp();

    /**
	 * Sets the value of the '{@link proxy.Proxy#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
    void setIp(String value);

    /**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see proxy.ProxyPackage#getProxy_Port()
	 * @model
	 * @generated
	 */
    String getPort();

    /**
	 * Sets the value of the '{@link proxy.Proxy#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
    void setPort(String value);

    /**
	 * Returns the value of the '<em><b>Contry</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contry</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Contry</em>' attribute.
	 * @see #setContry(String)
	 * @see proxy.ProxyPackage#getProxy_Contry()
	 * @model
	 * @generated
	 */
    String getContry();

    /**
	 * Sets the value of the '{@link proxy.Proxy#getContry <em>Contry</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contry</em>' attribute.
	 * @see #getContry()
	 * @generated
	 */
    void setContry(String value);

    /**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see proxy.ProxyPackage#getProxy_Location()
	 * @model
	 * @generated
	 */
    String getLocation();

    /**
	 * Sets the value of the '{@link proxy.Proxy#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
    void setLocation(String value);

    /**
	 * Returns the value of the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Create Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Date</em>' attribute.
	 * @see #setCreateDate(Date)
	 * @see proxy.ProxyPackage#getProxy_CreateDate()
	 * @model
	 * @generated
	 */
    Date getCreateDate();

    /**
	 * Sets the value of the '{@link proxy.Proxy#getCreateDate <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Date</em>' attribute.
	 * @see #getCreateDate()
	 * @generated
	 */
    void setCreateDate(Date value);

    /**
	 * Returns the value of the '<em><b>Last Validate Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Validate Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Validate Date</em>' attribute.
	 * @see #setLastValidateDate(Date)
	 * @see proxy.ProxyPackage#getProxy_LastValidateDate()
	 * @model
	 * @generated
	 */
    Date getLastValidateDate();

    /**
	 * Sets the value of the '{@link proxy.Proxy#getLastValidateDate <em>Last Validate Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Validate Date</em>' attribute.
	 * @see #getLastValidateDate()
	 * @generated
	 */
    void setLastValidateDate(Date value);

				/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see proxy.ProxyPackage#getProxy_Delay()
	 * @model
	 * @generated
	 */
	int getDelay();

				/**
	 * Sets the value of the '{@link proxy.Proxy#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void test();

} // Proxy
