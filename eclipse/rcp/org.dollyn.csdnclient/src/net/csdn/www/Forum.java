/**
 * Forum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class Forum  implements java.io.Serializable {
    private java.lang.String forumId;

    private java.lang.String parentForumId;

    private java.lang.String name;

    private java.lang.String alias;

    private boolean isTech;

    private java.lang.String[] morderators;

    private java.lang.String pointBelongsToForumId;

    public Forum() {
    }

    public Forum(
           java.lang.String forumId,
           java.lang.String parentForumId,
           java.lang.String name,
           java.lang.String alias,
           boolean isTech,
           java.lang.String[] morderators,
           java.lang.String pointBelongsToForumId) {
           this.forumId = forumId;
           this.parentForumId = parentForumId;
           this.name = name;
           this.alias = alias;
           this.isTech = isTech;
           this.morderators = morderators;
           this.pointBelongsToForumId = pointBelongsToForumId;
    }


    /**
     * Gets the forumId value for this Forum.
     * 
     * @return forumId
     */
    public java.lang.String getForumId() {
        return forumId;
    }


    /**
     * Sets the forumId value for this Forum.
     * 
     * @param forumId
     */
    public void setForumId(java.lang.String forumId) {
        this.forumId = forumId;
    }


    /**
     * Gets the parentForumId value for this Forum.
     * 
     * @return parentForumId
     */
    public java.lang.String getParentForumId() {
        return parentForumId;
    }


    /**
     * Sets the parentForumId value for this Forum.
     * 
     * @param parentForumId
     */
    public void setParentForumId(java.lang.String parentForumId) {
        this.parentForumId = parentForumId;
    }


    /**
     * Gets the name value for this Forum.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Forum.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the alias value for this Forum.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this Forum.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the isTech value for this Forum.
     * 
     * @return isTech
     */
    public boolean isIsTech() {
        return isTech;
    }


    /**
     * Sets the isTech value for this Forum.
     * 
     * @param isTech
     */
    public void setIsTech(boolean isTech) {
        this.isTech = isTech;
    }


    /**
     * Gets the morderators value for this Forum.
     * 
     * @return morderators
     */
    public java.lang.String[] getMorderators() {
        return morderators;
    }


    /**
     * Sets the morderators value for this Forum.
     * 
     * @param morderators
     */
    public void setMorderators(java.lang.String[] morderators) {
        this.morderators = morderators;
    }


    /**
     * Gets the pointBelongsToForumId value for this Forum.
     * 
     * @return pointBelongsToForumId
     */
    public java.lang.String getPointBelongsToForumId() {
        return pointBelongsToForumId;
    }


    /**
     * Sets the pointBelongsToForumId value for this Forum.
     * 
     * @param pointBelongsToForumId
     */
    public void setPointBelongsToForumId(java.lang.String pointBelongsToForumId) {
        this.pointBelongsToForumId = pointBelongsToForumId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Forum)) return false;
        Forum other = (Forum) obj;
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
            ((this.parentForumId==null && other.getParentForumId()==null) || 
             (this.parentForumId!=null &&
              this.parentForumId.equals(other.getParentForumId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            this.isTech == other.isIsTech() &&
            ((this.morderators==null && other.getMorderators()==null) || 
             (this.morderators!=null &&
              java.util.Arrays.equals(this.morderators, other.getMorderators()))) &&
            ((this.pointBelongsToForumId==null && other.getPointBelongsToForumId()==null) || 
             (this.pointBelongsToForumId!=null &&
              this.pointBelongsToForumId.equals(other.getPointBelongsToForumId())));
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
        if (getParentForumId() != null) {
            _hashCode += getParentForumId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        _hashCode += (isIsTech() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMorderators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMorderators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMorderators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPointBelongsToForumId() != null) {
            _hashCode += getPointBelongsToForumId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Forum.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "Forum"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "forumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentForumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "parentForumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTech");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "IsTech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("morderators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "morderators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.csdn.net/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointBelongsToForumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "pointBelongsToForumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
