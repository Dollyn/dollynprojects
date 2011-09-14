/**
 * ForumAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public interface ForumAPI extends javax.xml.rpc.Service {
    public java.lang.String getForumAPISoapAddress();

    public net.csdn.www.ForumAPISoap getForumAPISoap() throws javax.xml.rpc.ServiceException;

    public net.csdn.www.ForumAPISoap getForumAPISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getForumAPISoap12Address();

    public net.csdn.www.ForumAPISoap getForumAPISoap12() throws javax.xml.rpc.ServiceException;

    public net.csdn.www.ForumAPISoap getForumAPISoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
