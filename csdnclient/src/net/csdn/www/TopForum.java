/**
 * TopForum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class TopForum  implements java.io.Serializable {
    private java.lang.String forumId;

    private int expertPoint;

    private java.lang.String rank;

    public TopForum() {
    }

    public TopForum(
           java.lang.String forumId,
           int expertPoint,
           java.lang.String rank) {
           this.forumId = forumId;
           this.expertPoint = expertPoint;
           this.rank = rank;
    }


    /**
     * Gets the forumId value for this TopForum.
     * 
     * @return forumId
     */
    public java.lang.String getForumId() {
        return forumId;
    }


    /**
     * Sets the forumId value for this TopForum.
     * 
     * @param forumId
     */
    public void setForumId(java.lang.String forumId) {
        this.forumId = forumId;
    }


    /**
     * Gets the expertPoint value for this TopForum.
     * 
     * @return expertPoint
     */
    public int getExpertPoint() {
        return expertPoint;
    }


    /**
     * Sets the expertPoint value for this TopForum.
     * 
     * @param expertPoint
     */
    public void setExpertPoint(int expertPoint) {
        this.expertPoint = expertPoint;
    }


    /**
     * Gets the rank value for this TopForum.
     * 
     * @return rank
     */
    public java.lang.String getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this TopForum.
     * 
     * @param rank
     */
    public void setRank(java.lang.String rank) {
        this.rank = rank;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopForum)) return false;
        TopForum other = (TopForum) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forumId==null && other.getForumId()==null) || 
             (this.forumId!=null &&
              this.forumId.equals(other.getForumId()))) &&
            this.expertPoint == other.getExpertPoint() &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank())));
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
        if (getForumId() != null) {
            _hashCode += getForumId().hashCode();
        }
        _hashCode += getExpertPoint();
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopForum.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "TopForum"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "forumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expertPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "expertPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
