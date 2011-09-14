/**
 * UserTopicListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class UserTopicListType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserTopicListType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TopicOfUser = "TopicOfUser";
    public static final java.lang.String _TopicUserUnCheckOut = "TopicUserUnCheckOut";
    public static final java.lang.String _ExpireTopicOfUser = "ExpireTopicOfUser";
    public static final java.lang.String _TopicUserJoined = "TopicUserJoined";
    public static final java.lang.String _TopicUserRewarded = "TopicUserRewarded";
    public static final java.lang.String _AllAskExpert = "AllAskExpert";
    public static final UserTopicListType TopicOfUser = new UserTopicListType(_TopicOfUser);
    public static final UserTopicListType TopicUserUnCheckOut = new UserTopicListType(_TopicUserUnCheckOut);
    public static final UserTopicListType ExpireTopicOfUser = new UserTopicListType(_ExpireTopicOfUser);
    public static final UserTopicListType TopicUserJoined = new UserTopicListType(_TopicUserJoined);
    public static final UserTopicListType TopicUserRewarded = new UserTopicListType(_TopicUserRewarded);
    public static final UserTopicListType AllAskExpert = new UserTopicListType(_AllAskExpert);
    public java.lang.String getValue() { return _value_;}
    public static UserTopicListType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserTopicListType enumeration = (UserTopicListType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserTopicListType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTopicListType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "UserTopicListType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
