/**
 * GeneraPdfSingoloBollettinoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class GeneraPdfSingoloBollettinoRequest  implements java.io.Serializable {
    private java.lang.String chiaveTransazione;

    private java.lang.String chiaveBollettino;

    private com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequestTipoBollettino tipoBollettino;

    public GeneraPdfSingoloBollettinoRequest() {
    }

    public GeneraPdfSingoloBollettinoRequest(
           java.lang.String chiaveTransazione,
           java.lang.String chiaveBollettino,
           com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequestTipoBollettino tipoBollettino) {
           this.chiaveTransazione = chiaveTransazione;
           this.chiaveBollettino = chiaveBollettino;
           this.tipoBollettino = tipoBollettino;
    }


    /**
     * Gets the chiaveTransazione value for this GeneraPdfSingoloBollettinoRequest.
     * 
     * @return chiaveTransazione
     */
    public java.lang.String getChiaveTransazione() {
        return chiaveTransazione;
    }


    /**
     * Sets the chiaveTransazione value for this GeneraPdfSingoloBollettinoRequest.
     * 
     * @param chiaveTransazione
     */
    public void setChiaveTransazione(java.lang.String chiaveTransazione) {
        this.chiaveTransazione = chiaveTransazione;
    }


    /**
     * Gets the chiaveBollettino value for this GeneraPdfSingoloBollettinoRequest.
     * 
     * @return chiaveBollettino
     */
    public java.lang.String getChiaveBollettino() {
        return chiaveBollettino;
    }


    /**
     * Sets the chiaveBollettino value for this GeneraPdfSingoloBollettinoRequest.
     * 
     * @param chiaveBollettino
     */
    public void setChiaveBollettino(java.lang.String chiaveBollettino) {
        this.chiaveBollettino = chiaveBollettino;
    }


    /**
     * Gets the tipoBollettino value for this GeneraPdfSingoloBollettinoRequest.
     * 
     * @return tipoBollettino
     */
    public com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequestTipoBollettino getTipoBollettino() {
        return tipoBollettino;
    }


    /**
     * Sets the tipoBollettino value for this GeneraPdfSingoloBollettinoRequest.
     * 
     * @param tipoBollettino
     */
    public void setTipoBollettino(com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequestTipoBollettino tipoBollettino) {
        this.tipoBollettino = tipoBollettino;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneraPdfSingoloBollettinoRequest)) return false;
        GeneraPdfSingoloBollettinoRequest other = (GeneraPdfSingoloBollettinoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTransazione==null && other.getChiaveTransazione()==null) || 
             (this.chiaveTransazione!=null &&
              this.chiaveTransazione.equals(other.getChiaveTransazione()))) &&
            ((this.chiaveBollettino==null && other.getChiaveBollettino()==null) || 
             (this.chiaveBollettino!=null &&
              this.chiaveBollettino.equals(other.getChiaveBollettino()))) &&
            ((this.tipoBollettino==null && other.getTipoBollettino()==null) || 
             (this.tipoBollettino!=null &&
              this.tipoBollettino.equals(other.getTipoBollettino())));
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
        if (getChiaveTransazione() != null) {
            _hashCode += getChiaveTransazione().hashCode();
        }
        if (getChiaveBollettino() != null) {
            _hashCode += getChiaveBollettino().hashCode();
        }
        if (getTipoBollettino() != null) {
            _hashCode += getTipoBollettino().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneraPdfSingoloBollettinoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "GeneraPdfSingoloBollettinoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTransazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "chiaveTransazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "chiaveBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "tipoBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfSingoloBollettinoRequest>tipoBollettino"));
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
