/**
 * DownloadQuietanzaBollettiniRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class DownloadQuietanzaBollettiniRequestType  implements java.io.Serializable {
    private java.lang.String chiave_transazione;

    public DownloadQuietanzaBollettiniRequestType() {
    }

    public DownloadQuietanzaBollettiniRequestType(
           java.lang.String chiave_transazione) {
           this.chiave_transazione = chiave_transazione;
    }


    /**
     * Gets the chiave_transazione value for this DownloadQuietanzaBollettiniRequestType.
     * 
     * @return chiave_transazione
     */
    public java.lang.String getChiave_transazione() {
        return chiave_transazione;
    }


    /**
     * Sets the chiave_transazione value for this DownloadQuietanzaBollettiniRequestType.
     * 
     * @param chiave_transazione
     */
    public void setChiave_transazione(java.lang.String chiave_transazione) {
        this.chiave_transazione = chiave_transazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DownloadQuietanzaBollettiniRequestType)) return false;
        DownloadQuietanzaBollettiniRequestType other = (DownloadQuietanzaBollettiniRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiave_transazione==null && other.getChiave_transazione()==null) || 
             (this.chiave_transazione!=null &&
              this.chiave_transazione.equals(other.getChiave_transazione())));
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
        if (getChiave_transazione() != null) {
            _hashCode += getChiave_transazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DownloadQuietanzaBollettiniRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "downloadQuietanzaBollettiniRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiave_transazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "chiave_transazione"));
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
