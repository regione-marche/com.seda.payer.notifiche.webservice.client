/**
 * NotificaMAVRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class NotificaMAVRequestType  implements java.io.Serializable {
    private java.lang.String chiave_transazione;

    private java.lang.String tipo_notifica;

    private java.lang.String modalita;

    private java.lang.String numMAV;

    private java.lang.String pdfBinario;

    private java.lang.String codiceFiscale;

    public NotificaMAVRequestType() {
    }

    public NotificaMAVRequestType(
           java.lang.String chiave_transazione,
           java.lang.String tipo_notifica,
           java.lang.String modalita,
           java.lang.String numMAV,
           java.lang.String pdfBinario,
           java.lang.String codiceFiscale) {
           this.chiave_transazione = chiave_transazione;
           this.tipo_notifica = tipo_notifica;
           this.modalita = modalita;
           this.numMAV = numMAV;
           this.pdfBinario = pdfBinario;
           this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the chiave_transazione value for this NotificaMAVRequestType.
     * 
     * @return chiave_transazione
     */
    public java.lang.String getChiave_transazione() {
        return chiave_transazione;
    }


    /**
     * Sets the chiave_transazione value for this NotificaMAVRequestType.
     * 
     * @param chiave_transazione
     */
    public void setChiave_transazione(java.lang.String chiave_transazione) {
        this.chiave_transazione = chiave_transazione;
    }


    /**
     * Gets the tipo_notifica value for this NotificaMAVRequestType.
     * 
     * @return tipo_notifica
     */
    public java.lang.String getTipo_notifica() {
        return tipo_notifica;
    }


    /**
     * Sets the tipo_notifica value for this NotificaMAVRequestType.
     * 
     * @param tipo_notifica
     */
    public void setTipo_notifica(java.lang.String tipo_notifica) {
        this.tipo_notifica = tipo_notifica;
    }


    /**
     * Gets the modalita value for this NotificaMAVRequestType.
     * 
     * @return modalita
     */
    public java.lang.String getModalita() {
        return modalita;
    }


    /**
     * Sets the modalita value for this NotificaMAVRequestType.
     * 
     * @param modalita
     */
    public void setModalita(java.lang.String modalita) {
        this.modalita = modalita;
    }


    /**
     * Gets the numMAV value for this NotificaMAVRequestType.
     * 
     * @return numMAV
     */
    public java.lang.String getNumMAV() {
        return numMAV;
    }


    /**
     * Sets the numMAV value for this NotificaMAVRequestType.
     * 
     * @param numMAV
     */
    public void setNumMAV(java.lang.String numMAV) {
        this.numMAV = numMAV;
    }


    /**
     * Gets the pdfBinario value for this NotificaMAVRequestType.
     * 
     * @return pdfBinario
     */
    public java.lang.String getPdfBinario() {
        return pdfBinario;
    }


    /**
     * Sets the pdfBinario value for this NotificaMAVRequestType.
     * 
     * @param pdfBinario
     */
    public void setPdfBinario(java.lang.String pdfBinario) {
        this.pdfBinario = pdfBinario;
    }


    /**
     * Gets the codiceFiscale value for this NotificaMAVRequestType.
     * 
     * @return codiceFiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this NotificaMAVRequestType.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaMAVRequestType)) return false;
        NotificaMAVRequestType other = (NotificaMAVRequestType) obj;
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
              this.chiave_transazione.equals(other.getChiave_transazione()))) &&
            ((this.tipo_notifica==null && other.getTipo_notifica()==null) || 
             (this.tipo_notifica!=null &&
              this.tipo_notifica.equals(other.getTipo_notifica()))) &&
            ((this.modalita==null && other.getModalita()==null) || 
             (this.modalita!=null &&
              this.modalita.equals(other.getModalita()))) &&
            ((this.numMAV==null && other.getNumMAV()==null) || 
             (this.numMAV!=null &&
              this.numMAV.equals(other.getNumMAV()))) &&
            ((this.pdfBinario==null && other.getPdfBinario()==null) || 
             (this.pdfBinario!=null &&
              this.pdfBinario.equals(other.getPdfBinario()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale())));
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
        if (getTipo_notifica() != null) {
            _hashCode += getTipo_notifica().hashCode();
        }
        if (getModalita() != null) {
            _hashCode += getModalita().hashCode();
        }
        if (getNumMAV() != null) {
            _hashCode += getNumMAV().hashCode();
        }
        if (getPdfBinario() != null) {
            _hashCode += getPdfBinario().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaMAVRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaMAVRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiave_transazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "chiave_transazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_notifica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "tipo_notifica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "modalita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numMAV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "numMAV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdfBinario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "pdfBinario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
