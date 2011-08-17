/**
 * ForumAPISoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class ForumAPISoap12Stub extends org.apache.axis.client.Stub implements net.csdn.www.ForumAPISoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Post");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Identity"), net.csdn.www.Identity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "post"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Post"), net.csdn.www.Post.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "PostResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "error"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "Error"), net.csdn.www.Error.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "topicUrl"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Reply");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Identity"), net.csdn.www.Identity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "reply"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Reply"), net.csdn.www.Reply.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "error"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "Error"), net.csdn.www.Error.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "replyId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "layer"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetForums");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfForum"));
        oper.setReturnClass(net.csdn.www.Forum[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.csdn.net/", "GetForumsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.csdn.net/", "Forum"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckOutTopic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Identity"), net.csdn.www.Identity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "topicUrl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "forumId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "replyPoints"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfReplyPoint"), net.csdn.www.ReplyPoint[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyPoint"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "CheckOutTopicResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "error"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "Error"), net.csdn.www.Error.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTopicsOfUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Identity"), net.csdn.www.Identity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "listType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "UserTopicListType"), net.csdn.www.UserTopicListType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "forumId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "GetTopicsOfUserResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "posts"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfPost"), net.csdn.www.Post[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.csdn.net/", "Post"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "error"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "Error"), net.csdn.www.Error.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PointDonate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Identity"), net.csdn.www.Identity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "toUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "PointDonateResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "error"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "Error"), net.csdn.www.Error.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.csdn.net/", "Identity"), net.csdn.www.Identity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "GetUserProfileResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "profile"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "UserProfile"), net.csdn.www.UserProfile.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.csdn.net/", "error"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.csdn.net/", "Error"), net.csdn.www.Error.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public ForumAPISoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ForumAPISoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ForumAPISoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfForum");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.Forum[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "Forum");
            qName2 = new javax.xml.namespace.QName("http://www.csdn.net/", "Forum");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfPost");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.Post[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "Post");
            qName2 = new javax.xml.namespace.QName("http://www.csdn.net/", "Post");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfReplyPoint");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.ReplyPoint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyPoint");
            qName2 = new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyPoint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.csdn.net/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "ArrayOfTopForum");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.TopForum[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "TopForum");
            qName2 = new javax.xml.namespace.QName("http://www.csdn.net/", "TopForum");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "EditorType");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.EditorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "Error");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "Forum");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.Forum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "Identity");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.Identity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "Post");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.Post.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "Reply");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.Reply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyPoint");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.ReplyPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "TopForum");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.TopForum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "UserProfile");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.UserProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.csdn.net/", "UserTopicListType");
            cachedSerQNames.add(qName);
            cls = net.csdn.www.UserTopicListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void post(net.csdn.www.Identity identity, net.csdn.www.Post post, javax.xml.rpc.holders.BooleanHolder postResult, net.csdn.www.holders.ErrorHolder error, javax.xml.rpc.holders.StringHolder topicUrl) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.csdn.net/Post");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csdn.net/", "Post"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identity, post});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                postResult.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "PostResult"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                postResult.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "PostResult")), boolean.class)).booleanValue();
            }
            try {
                error.value = (net.csdn.www.Error) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error"));
            } catch (java.lang.Exception _exception) {
                error.value = (net.csdn.www.Error) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error")), net.csdn.www.Error.class);
            }
            try {
                topicUrl.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "topicUrl"));
            } catch (java.lang.Exception _exception) {
                topicUrl.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "topicUrl")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reply(net.csdn.www.Identity identity, net.csdn.www.Reply reply, javax.xml.rpc.holders.BooleanHolder replyResult, net.csdn.www.holders.ErrorHolder error, javax.xml.rpc.holders.LongHolder replyId, javax.xml.rpc.holders.IntHolder layer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.csdn.net/Reply");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csdn.net/", "Reply"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identity, reply});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                replyResult.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyResult"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                replyResult.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyResult")), boolean.class)).booleanValue();
            }
            try {
                error.value = (net.csdn.www.Error) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error"));
            } catch (java.lang.Exception _exception) {
                error.value = (net.csdn.www.Error) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error")), net.csdn.www.Error.class);
            }
            try {
                replyId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "replyId"))).longValue();
            } catch (java.lang.Exception _exception) {
                replyId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "replyId")), long.class)).longValue();
            }
            try {
                layer.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "layer"))).intValue();
            } catch (java.lang.Exception _exception) {
                layer.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "layer")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.csdn.www.Forum[] getForums() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.csdn.net/GetForums");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csdn.net/", "GetForums"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.csdn.www.Forum[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.csdn.www.Forum[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.csdn.www.Forum[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void checkOutTopic(net.csdn.www.Identity identity, java.lang.String topicUrl, java.lang.String forumId, net.csdn.www.ReplyPoint[] replyPoints, javax.xml.rpc.holders.BooleanHolder checkOutTopicResult, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.csdn.net/CheckOutTopic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csdn.net/", "CheckOutTopic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identity, topicUrl, forumId, replyPoints});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                checkOutTopicResult.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "CheckOutTopicResult"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                checkOutTopicResult.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "CheckOutTopicResult")), boolean.class)).booleanValue();
            }
            try {
                error.value = (net.csdn.www.Error) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error"));
            } catch (java.lang.Exception _exception) {
                error.value = (net.csdn.www.Error) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error")), net.csdn.www.Error.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getTopicsOfUser(net.csdn.www.Identity identity, net.csdn.www.UserTopicListType listType, java.lang.String forumId, javax.xml.rpc.holders.BooleanHolder getTopicsOfUserResult, net.csdn.www.holders.ArrayOfPostHolder posts, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.csdn.net/GetTopicsOfUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csdn.net/", "GetTopicsOfUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identity, listType, forumId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getTopicsOfUserResult.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "GetTopicsOfUserResult"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                getTopicsOfUserResult.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "GetTopicsOfUserResult")), boolean.class)).booleanValue();
            }
            try {
                posts.value = (net.csdn.www.Post[]) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "posts"));
            } catch (java.lang.Exception _exception) {
                posts.value = (net.csdn.www.Post[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "posts")), net.csdn.www.Post[].class);
            }
            try {
                error.value = (net.csdn.www.Error) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error"));
            } catch (java.lang.Exception _exception) {
                error.value = (net.csdn.www.Error) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error")), net.csdn.www.Error.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void pointDonate(net.csdn.www.Identity identity, java.lang.String toUser, int point, java.lang.String reason, javax.xml.rpc.holders.BooleanHolder pointDonateResult, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.csdn.net/PointDonate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csdn.net/", "PointDonate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identity, toUser, new java.lang.Integer(point), reason});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                pointDonateResult.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "PointDonateResult"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                pointDonateResult.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "PointDonateResult")), boolean.class)).booleanValue();
            }
            try {
                error.value = (net.csdn.www.Error) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error"));
            } catch (java.lang.Exception _exception) {
                error.value = (net.csdn.www.Error) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error")), net.csdn.www.Error.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getUserProfile(net.csdn.www.Identity identity, java.lang.String username, javax.xml.rpc.holders.BooleanHolder getUserProfileResult, net.csdn.www.holders.UserProfileHolder profile, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.csdn.net/GetUserProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.csdn.net/", "GetUserProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identity, username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getUserProfileResult.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "GetUserProfileResult"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                getUserProfileResult.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "GetUserProfileResult")), boolean.class)).booleanValue();
            }
            try {
                profile.value = (net.csdn.www.UserProfile) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "profile"));
            } catch (java.lang.Exception _exception) {
                profile.value = (net.csdn.www.UserProfile) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "profile")), net.csdn.www.UserProfile.class);
            }
            try {
                error.value = (net.csdn.www.Error) _output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error"));
            } catch (java.lang.Exception _exception) {
                error.value = (net.csdn.www.Error) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.csdn.net/", "error")), net.csdn.www.Error.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
