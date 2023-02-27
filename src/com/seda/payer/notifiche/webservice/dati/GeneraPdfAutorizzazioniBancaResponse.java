/**
 * GeneraPdfAutorizzazioniBancaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class GeneraPdfAutorizzazioniBancaResponse  implements java.io.Serializable {
    private java.lang.String[] listPdfFilePath;

    private com.seda.payer.notifiche.webservice.dati.Response response;

    public GeneraPdfAutorizzazioniBancaResponse() {
    }

    public GeneraPdfAutorizzazioniBancaResponse(
           java.lang.String[] listPdfFilePath,
           com.seda.payer.notifiche.webservice.dati.Response response) {
           this.listPdfFilePath = listPdfFilePath;
           this.response = response;
    }


    /**
     * Gets the listPdfFilePath value for this GeneraPdfAutorizzazioniBancaResponse.
     * 
     * @return listPdfFilePath
     */
    public java.lang.String[] getListPdfFilePath() {
        return listPdfFilePath;
    }


    /**
     * Sets the listPdfFilePath value for this GeneraPdfAutorizzazioniBancaResponse.
     * 
     * @param listPdfFilePath
     */
    public void setListPdfFilePath(java.lang.String[] listPdfFilePath) {
        this.listPdfFilePath = listPdfFilePath;
    }

    public java.lang.String getListPdfFilePath(int i) {
        return this.listPdfFilePath[i];
    }

    public void setListPdfFilePath(int i, java.lang.String _value) {
        this.listPdfFilePath[i] = _value;
    }


    /**
     * Gets the response value for this GeneraPdfAutorizzazioniBancaResponse.
     * 
     * @return response
     */
    public com.seda.payer.notifiche.webservice.dati.Response getResponse() {
        return response;
    }


    /**
     * Sets the response value for this GeneraPdfAutorizzazioniBancaResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.notifiche.webservice.dati.Response response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneraPdfAutorizzazioniBancaResponse)) return false;
        GeneraPdfAutorizzazioniBancaResponse other = (GeneraPdfAutorizzazioniBancaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listPdfFilePath==null && other.getListPdfFilePath()==null) || 
             (this.listPdfFilePath!=null &&
              java.util.Arrays.equals(this.listPdfFilePath, other.getListPdfFilePath()))) &&
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
        if (getListPdfFilePath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListPdfFilePath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListPdfFilePath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneraPdfAutorizzazioniBancaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfAutorizzazioniBancaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPdfFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listPdfFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
