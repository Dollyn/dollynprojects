/**
 * Reply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class Reply  implements java.io.Serializable {
    private java.lang.String forumId;

    private java.lang.String topicUrl;

    private java.lang.String body;

    private net.csdn.www.EditorType editor;

    public Reply() {
    }

    public Reply(
           java.lang.String forumId,
           java.lang.String topicUrl,
           java.lang.String body,
           net.csdn.www.EditorType editor) {
           this.forumId = forumId;
           this.topicUrl = topicUrl;
           this.body = body;
           this.editor = editor;
    }


    /**
     * Gets the forumId value for this Reply.
     * 
     * @return forumId
     */
    public java.lang.String getForumId() {
        return forumId;
    }


    /**
     * Sets the forumId value for this Reply.
     * 
     * @param forumId
     */
    public void setForumId(java.lang.String forumId) {
        this.forumId = forumId;
    }


    /**
     * Gets the topicUrl value for this Reply.
     * 
     * @return topicUrl
     */
    public java.lang.String getTopicUrl() {
        return topicUrl;
    }


    /**
     * Sets the topicUrl value for this Reply.
     * 
     * @param topicUrl
     */
    public void setTopicUrl(java.lang.String topicUrl) {
        this.topicUrl = topicUrl;
    }


    /**
     * Gets the body value for this Reply.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this Reply.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the editor value for this Reply.
     * 
     * @return editor
     */
    public net.csdn.www.EditorType getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this Reply.
     * 
     * @param editor
     */
    public void setEditor(net.csdn.www.EditorType editor) {
        this.editor = editor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reply)) return false;
        Reply other = (Reply) obj;
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
            ((this.topicUrl==null && other.getTopicUrl()==null) || 
             (this.topicUrl!=null &&
              this.topicUrl.equals(other.getTopicUrl()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.editor==null && other.getEditor()==null) || 
             (this.editor!=null &&
              this.editor.equals(other.getEditor())));
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
        if (getTopicUrl() != null) {
            _hashCode += getTopicUrl().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getEditor() != null) {
            _hashCode += getEditor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "Reply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "forumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topicUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "topicUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "EditorType"));
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
