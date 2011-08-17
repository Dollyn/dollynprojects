/**
 * Post.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public class Post  implements java.io.Serializable {
    private java.lang.String forumId;

    private java.lang.String subject;

    private java.lang.String body;

    private java.lang.String tag;

    private int point;

    private boolean isAskExpert;

    private java.lang.String expertUserName;

    private net.csdn.www.EditorType editor;

    private java.lang.String url;

    public Post() {
    }

    public Post(
           java.lang.String forumId,
           java.lang.String subject,
           java.lang.String body,
           java.lang.String tag,
           int point,
           boolean isAskExpert,
           java.lang.String expertUserName,
           net.csdn.www.EditorType editor,
           java.lang.String url) {
           this.forumId = forumId;
           this.subject = subject;
           this.body = body;
           this.tag = tag;
           this.point = point;
           this.isAskExpert = isAskExpert;
           this.expertUserName = expertUserName;
           this.editor = editor;
           this.url = url;
    }


    /**
     * Gets the forumId value for this Post.
     * 
     * @return forumId
     */
    public java.lang.String getForumId() {
        return forumId;
    }


    /**
     * Sets the forumId value for this Post.
     * 
     * @param forumId
     */
    public void setForumId(java.lang.String forumId) {
        this.forumId = forumId;
    }


    /**
     * Gets the subject value for this Post.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Post.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the body value for this Post.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this Post.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the tag value for this Post.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this Post.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }


    /**
     * Gets the point value for this Post.
     * 
     * @return point
     */
    public int getPoint() {
        return point;
    }


    /**
     * Sets the point value for this Post.
     * 
     * @param point
     */
    public void setPoint(int point) {
        this.point = point;
    }


    /**
     * Gets the isAskExpert value for this Post.
     * 
     * @return isAskExpert
     */
    public boolean isIsAskExpert() {
        return isAskExpert;
    }


    /**
     * Sets the isAskExpert value for this Post.
     * 
     * @param isAskExpert
     */
    public void setIsAskExpert(boolean isAskExpert) {
        this.isAskExpert = isAskExpert;
    }


    /**
     * Gets the expertUserName value for this Post.
     * 
     * @return expertUserName
     */
    public java.lang.String getExpertUserName() {
        return expertUserName;
    }


    /**
     * Sets the expertUserName value for this Post.
     * 
     * @param expertUserName
     */
    public void setExpertUserName(java.lang.String expertUserName) {
        this.expertUserName = expertUserName;
    }


    /**
     * Gets the editor value for this Post.
     * 
     * @return editor
     */
    public net.csdn.www.EditorType getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this Post.
     * 
     * @param editor
     */
    public void setEditor(net.csdn.www.EditorType editor) {
        this.editor = editor;
    }


    /**
     * Gets the url value for this Post.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Post.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Post)) return false;
        Post other = (Post) obj;
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
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            this.point == other.getPoint() &&
            this.isAskExpert == other.isIsAskExpert() &&
            ((this.expertUserName==null && other.getExpertUserName()==null) || 
             (this.expertUserName!=null &&
              this.expertUserName.equals(other.getExpertUserName()))) &&
            ((this.editor==null && other.getEditor()==null) || 
             (this.editor!=null &&
              this.editor.equals(other.getEditor()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        _hashCode += getPoint();
        _hashCode += (isIsAskExpert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExpertUserName() != null) {
            _hashCode += getExpertUserName().hashCode();
        }
        if (getEditor() != null) {
            _hashCode += getEditor().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Post.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csdn.net/", "Post"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "forumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "subject"));
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
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAskExpert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "isAskExpert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expertUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "expertUserName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.csdn.net/", "url"));
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
