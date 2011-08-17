/**
 * UserProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class UserProfile  implements java.io.Serializable {
    private int point;

    private int techExpertPoint;

    private net.csdn.www.TopForum[] topForums;

    private int nonTechExpertPoint;

    private java.lang.String nickName;

    private java.lang.String username;

    public UserProfile() {
    }

    public UserProfile(
           int point,
           int techExpertPoint,
           net.csdn.www.TopForum[] topForums,
           int nonTechExpertPoint,
           java.lang.String nickName,
           java.lang.String username) {
           this.point = point;
           this.techExpertPoint = techExpertPoint;
           this.topForums = topForums;
           this.nonTechExpertPoint = nonTechExpertPoint;
           this.nickName = nickName;
           this.username = username;
    }


    /**
     * Gets the point value for this UserProfile.
     * 
     * @return point
     */
    public int getPoint() {
        return point;
    }


    /**
     * Sets the point value for this UserProfile.
     * 
     * @param point
     */
    public void setPoint(int point) {
        this.point = point;
    }


    /**
     * Gets the techExpertPoint value for this UserProfile.
     * 
     * @return techExpertPoint
     */
    public int getTechExpertPoint() {
        return techExpertPoint;
    }


    /**
     * Sets the techExpertPoint value for this UserProfile.
     * 
     * @param techExpertPoint
     */
    public void setTechExpertPoint(int techExpertPoint) {
        this.techExpertPoint = techExpertPoint;
    }


    /**
     * Gets the topForums value for this UserProfile.
     * 
     * @return topForums
     */
    public net.csdn.www.TopForum[] getTopForums() {
        return topForums;
    }


    /**
     * Sets the topForums value for this UserProfile.
     * 
     * @param topForums
     */
    public void setTopForums(net.csdn.www.TopForum[] topForums) {
        this.topForums = topForums;
    }


    /**
     * Gets the nonTechExpertPoint value for this UserProfile.
     * 
     * @return nonTechExpertPoint
     */
    public int getNonTechExpertPoint() {
        return nonTechExpertPoint;
    }


    /**
     * Sets the nonTechExpertPoint value for this UserProfile.
     * 
     * @param nonTechExpertPoint
     */
    public void setNonTechExpertPoint(int nonTechExpertPoint) {
        this.nonTechExpertPoint = nonTechExpertPoint;
    }


    /**
     * Gets the nickName value for this UserProfile.
     * 
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this UserProfile.
     * 
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the username value for this UserProfile.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserProfile.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProfile)) return false;
        UserProfile other = (UserProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.point == other.getPoint() &&
            this.techExpertPoint == other.getTechExpertPoint() &&
            ((this.topForums==null && other.getTopForums()==null) || 
             (this.topForums!=null &&
              java.util.Arrays.equals(this.topForums, other.getTopForums()))) &&
            this.nonTechExpertPoint == other.getNonTechExpertPoint() &&
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        _hashCode += getPoint();
        _hashCode += getTechExpertPoint();
        if (getTopForums() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopForums());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopForums(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNonTechExpertPoint();
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "UserProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("techExpertPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "techExpertPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topForums");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "topForums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "TopForum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.csdn.net/", "TopForum"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonTechExpertPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "nonTechExpertPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "nickName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "username"));
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
