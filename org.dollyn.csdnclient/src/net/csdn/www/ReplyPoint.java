/**
 * ReplyPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class ReplyPoint  implements java.io.Serializable {
    private long replyId;

    private int point;

    public ReplyPoint() {
    }

    public ReplyPoint(
           long replyId,
           int point) {
           this.replyId = replyId;
           this.point = point;
    }


    /**
     * Gets the replyId value for this ReplyPoint.
     * 
     * @return replyId
     */
    public long getReplyId() {
        return replyId;
    }


    /**
     * Sets the replyId value for this ReplyPoint.
     * 
     * @param replyId
     */
    public void setReplyId(long replyId) {
        this.replyId = replyId;
    }


    /**
     * Gets the point value for this ReplyPoint.
     * 
     * @return point
     */
    public int getPoint() {
        return point;
    }


    /**
     * Sets the point value for this ReplyPoint.
     * 
     * @param point
     */
    public void setPoint(int point) {
        this.point = point;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplyPoint)) return false;
        ReplyPoint other = (ReplyPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.replyId == other.getReplyId() &&
            this.point == other.getPoint();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getReplyId()).hashCode();
        _hashCode += getPoint();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplyPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "ReplyPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "replyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
