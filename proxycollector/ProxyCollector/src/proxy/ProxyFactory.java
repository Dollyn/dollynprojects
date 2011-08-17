/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package proxy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see proxy.ProxyPackage
 * @generated
 */
public interface ProxyFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ProxyFactory eINSTANCE = proxy.impl.ProxyFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Proxy</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proxy</em>'.
	 * @generated
	 */
    Proxy createProxy();

    /**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
    Result createResult();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    ProxyPackage getProxyPackage();

} //ProxyFactory
