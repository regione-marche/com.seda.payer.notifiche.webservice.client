/**
 * NotificaRIDResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class NotificaRIDResponseType  implements java.io.Serializable {
    private java.lang.String pdfFilePath;

    private com.seda.payer.notifiche.webservice.dati.Response response;

    public NotificaRIDResponseType() {
    }

    public NotificaRIDResponseType(
           java.lang.String pdfFilePath,
           com.seda.payer.notifiche.webservice.dati.Response response) {
           this.pdfFilePath = pdfFilePath;
           this.response = response;
    }


    /**
     * Gets the pdfFilePath value for this NotificaRIDResponseType.
     * 
     * @return pdfFilePath
     */
    public java.lang.String getPdfFilePath() {
        return pdfFilePath;
    }


    /**
     * Sets the pdfFilePath value for this NotificaRIDResponseType.
     * 
     * @param pdfFilePath
     */
    public void setPdfFilePath(java.lang.String pdfFilePath) {
        this.pdfFilePath = pdfFilePath;
    }


    /**
     * Gets the response value for this NotificaRIDResponseType.
     * 
     * @return response
     */
    public com.seda.payer.notifiche.webservice.dati.Response getResponse() {
        return response;
    }


    /**
     * Sets the response value for this NotificaRIDResponseType.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.notifiche.webservice.dati.Response response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaRIDResponseType)) return false;
        NotificaRIDResponseType other = (NotificaRIDResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pdfFilePath==null && other.getPdfFilePath()==null) || 
             (this.pdfFilePath!=null &&
              this.pdfFilePath.equals(other.getPdfFilePath()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getPdfFilePath() != null) {
            _hashCode += getPdfFilePath().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaRIDResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaRIDResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdfFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "pdfFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "Response"));
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
