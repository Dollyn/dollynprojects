/**
 * ForumAPILocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class ForumAPILocator extends org.apache.axis.client.Service implements net.csdn.www.ForumAPI {

    public ForumAPILocator() {
    }


    public ForumAPILocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ForumAPILocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ForumAPISoap
    private java.lang.String ForumAPISoap_address = "http://forum.csdn.net/OpenApi/forumapi.asmx";

    public java.lang.String getForumAPISoapAddress() {
        return ForumAPISoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ForumAPISoapWSDDServiceName = "ForumAPISoap";

    public java.lang.String getForumAPISoapWSDDServiceName() {
        return ForumAPISoapWSDDServiceName;
    }

    public void setForumAPISoapWSDDServiceName(java.lang.String name) {
        ForumAPISoapWSDDServiceName = name;
    }

    public net.csdn.www.ForumAPISoap getForumAPISoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ForumAPISoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getForumAPISoap(endpoint);
    }

    public net.csdn.www.ForumAPISoap getForumAPISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.csdn.www.ForumAPISoapStub _stub = new net.csdn.www.ForumAPISoapStub(portAddress, this);
            _stub.setPortName(getForumAPISoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setForumAPISoapEndpointAddress(java.lang.String address) {
        ForumAPISoap_address = address;
    }


    // Use to get a proxy class for ForumAPISoap12
    private java.lang.String ForumAPISoap12_address = "http://forum.csdn.net/OpenApi/forumapi.asmx";

    public java.lang.String getForumAPISoap12Address() {
        return ForumAPISoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ForumAPISoap12WSDDServiceName = "ForumAPISoap12";

    public java.lang.String getForumAPISoap12WSDDServiceName() {
        return ForumAPISoap12WSDDServiceName;
    }

    public void setForumAPISoap12WSDDServiceName(java.lang.String name) {
        ForumAPISoap12WSDDServiceName = name;
    }

    public net.csdn.www.ForumAPISoap getForumAPISoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ForumAPISoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getForumAPISoap12(endpoint);
    }

    public net.csdn.www.ForumAPISoap getForumAPISoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.csdn.www.ForumAPISoap12Stub _stub = new net.csdn.www.ForumAPISoap12Stub(portAddress, this);
            _stub.setPortName(getForumAPISoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setForumAPISoap12EndpointAddress(java.lang.String address) {
        ForumAPISoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.csdn.www.ForumAPISoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.csdn.www.ForumAPISoapStub _stub = new net.csdn.www.ForumAPISoapStub(new java.net.URL(ForumAPISoap_address), this);
                _stub.setPortName(getForumAPISoapWSDDServiceName());
                return _stub;
            }
            if (net.csdn.www.ForumAPISoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.csdn.www.ForumAPISoap12Stub _stub = new net.csdn.www.ForumAPISoap12Stub(new java.net.URL(ForumAPISoap12_address), this);
                _stub.setPortName(getForumAPISoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ForumAPISoap".equals(inputPortName)) {
            return getForumAPISoap();
        }
        else if ("ForumAPISoap12".equals(inputPortName)) {
            return getForumAPISoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.csdn.net/", "ForumAPI");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.csdn.net/", "ForumAPISoap"));
            ports.add(new javax.xml.namespace.QName("http://www.csdn.net/", "ForumAPISoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ForumAPISoap".equals(portName)) {
            setForumAPISoapEndpointAddress(address);
        }
        else 
if ("ForumAPISoap12".equals(portName)) {
            setForumAPISoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
