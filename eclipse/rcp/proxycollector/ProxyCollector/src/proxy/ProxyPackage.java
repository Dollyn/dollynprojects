/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package proxy;

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
 * @see proxy.ProxyFactory
 * @model kind="package"
 * @generated
 */
public interface ProxyPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "proxy";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "https://proxycollector/proxy";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "proxy";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ProxyPackage eINSTANCE = proxy.impl.ProxyPackageImpl.init();

    /**
	 * The meta object id for the '{@link proxy.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see proxy.impl.ProxyImpl
	 * @see proxy.impl.ProxyPackageImpl#getProxy()
	 * @generated
	 */
    int PROXY = 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY__NAME = 0;

    /**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY__IP = 1;

    /**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY__PORT = 2;

    /**
	 * The feature id for the '<em><b>Contry</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY__CONTRY = 3;

    /**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY__LOCATION = 4;

    /**
	 * The feature id for the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY__CREATE_DATE = 5;

    /**
	 * The feature id for the '<em><b>Last Validate Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY__LAST_VALIDATE_DATE = 6;

    /**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__DELAY = 7;

				/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROXY_FEATURE_COUNT = 8;


    /**
	 * The meta object id for the '{@link proxy.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see proxy.impl.ResultImpl
	 * @see proxy.impl.ProxyPackageImpl#getResult()
	 * @generated
	 */
    int RESULT = 1;

    /**
	 * The feature id for the '<em><b>Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESULT__PROXIES = 0;

    /**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESULT_FEATURE_COUNT = 1;


    /**
	 * Returns the meta object for class '{@link proxy.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see proxy.Proxy
	 * @generated
	 */
    EClass getProxy();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see proxy.Proxy#getName()
	 * @see #getProxy()
	 * @generated
	 */
    EAttribute getProxy_Name();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see proxy.Proxy#getIp()
	 * @see #getProxy()
	 * @generated
	 */
    EAttribute getProxy_Ip();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see proxy.Proxy#getPort()
	 * @see #getProxy()
	 * @generated
	 */
    EAttribute getProxy_Port();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getContry <em>Contry</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contry</em>'.
	 * @see proxy.Proxy#getContry()
	 * @see #getProxy()
	 * @generated
	 */
    EAttribute getProxy_Contry();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see proxy.Proxy#getLocation()
	 * @see #getProxy()
	 * @generated
	 */
    EAttribute getProxy_Location();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getCreateDate <em>Create Date</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Date</em>'.
	 * @see proxy.Proxy#getCreateDate()
	 * @see #getProxy()
	 * @generated
	 */
    EAttribute getProxy_CreateDate();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getLastValidateDate <em>Last Validate Date</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Validate Date</em>'.
	 * @see proxy.Proxy#getLastValidateDate()
	 * @see #getProxy()
	 * @generated
	 */
    EAttribute getProxy_LastValidateDate();

    /**
	 * Returns the meta object for the attribute '{@link proxy.Proxy#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see proxy.Proxy#getDelay()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Delay();

				/**
	 * Returns the meta object for class '{@link proxy.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see proxy.Result
	 * @generated
	 */
    EClass getResult();

    /**
	 * Returns the meta object for the containment reference list '{@link proxy.Result#getProxies <em>Proxies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxies</em>'.
	 * @see proxy.Result#getProxies()
	 * @see #getResult()
	 * @generated
	 */
    EReference getResult_Proxies();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    ProxyFactory getProxyFactory();

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
		 * The meta object literal for the '{@link proxy.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see proxy.impl.ProxyImpl
		 * @see proxy.impl.ProxyPackageImpl#getProxy()
		 * @generated
		 */
        EClass PROXY = eINSTANCE.getProxy();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROXY__NAME = eINSTANCE.getProxy_Name();

        /**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROXY__IP = eINSTANCE.getProxy_Ip();

        /**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROXY__PORT = eINSTANCE.getProxy_Port();

        /**
		 * The meta object literal for the '<em><b>Contry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROXY__CONTRY = eINSTANCE.getProxy_Contry();

        /**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROXY__LOCATION = eINSTANCE.getProxy_Location();

        /**
		 * The meta object literal for the '<em><b>Create Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROXY__CREATE_DATE = eINSTANCE.getProxy_CreateDate();

        /**
		 * The meta object literal for the '<em><b>Last Validate Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROXY__LAST_VALIDATE_DATE = eINSTANCE.getProxy_LastValidateDate();

        /**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__DELAY = eINSTANCE.getProxy_Delay();

								/**
		 * The meta object literal for the '{@link proxy.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see proxy.impl.ResultImpl
		 * @see proxy.impl.ProxyPackageImpl#getResult()
		 * @generated
		 */
        EClass RESULT = eINSTANCE.getResult();

        /**
		 * The meta object literal for the '<em><b>Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RESULT__PROXIES = eINSTANCE.getResult_Proxies();

    }

} //ProxyPackage
