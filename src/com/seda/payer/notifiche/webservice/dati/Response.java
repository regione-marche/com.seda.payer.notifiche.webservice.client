/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class Response  implements java.io.Serializable {
    private com.seda.payer.notifiche.webservice.dati.ResponseRetcode retcode;

    private java.lang.String retmessage;

    public Response() {
    }

    public Response(
           com.seda.payer.notifiche.webservice.dati.ResponseRetcode retcode,
           java.lang.String retmessage) {
           this.retcode = retcode;
           this.retmessage = retmessage;
    }


    /**
     * Gets the retcode value for this Response.
     * 
     * @return retcode
     */
    public com.seda.payer.notifiche.webservice.dati.ResponseRetcode getRetcode() {
        return retcode;
    }


    /**
     * Sets the retcode value for this Response.
     * 
     * @param retcode
     */
    public void setRetcode(com.seda.payer.notifiche.webservice.dati.ResponseRetcode retcode) {
        this.retcode = retcode;
    }


    /**
     * Gets the retmessage value for this Response.
     * 
     * @return retmessage
     */
    public java.lang.String getRetmessage() {
        return retmessage;
    }


    /**
     * Sets the retmessage value for this Response.
     * 
     * @param retmessage
     */
    public void setRetmessage(java.lang.String retmessage) {
        this.retmessage = retmessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retcode==null && other.getRetcode()==null) || 
             (this.retcode!=null &&
              this.retcode.equals(other.getRetcode()))) &&
            ((this.retmessage==null && other.getRetmessage()==null) || 
             (this.retmessage!=null &&
              this.retmessage.equals(other.getRetmessage())));
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
        if (getRetcode() != null) {
            _hashCode += getRetcode().hashCode();
        }
        if (getRetmessage() != null) {
            _hashCode += getRetmessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "retcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">Response>retcode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retmessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "retmessage"));
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
