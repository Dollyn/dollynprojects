/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package proxy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proxy.Result#getProxies <em>Proxies</em>}</li>
 * </ul>
 * </p>
 *
 * @see proxy.ProxyPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
    /**
	 * Returns the value of the '<em><b>Proxies</b></em>' containment reference list.
	 * The list contents are of type {@link proxy.Proxy}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proxies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxies</em>' containment reference list.
	 * @see proxy.ProxyPackage#getResult_Proxies()
	 * @model containment="true"
	 * @generated
	 */
    EList<Proxy> getProxies();

} // Result
