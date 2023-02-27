/**
 * NotificaScartoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

//inizio LP PG190220
//il codice della classe e' stato sostituito con quello
//prodotto dalla procedura AXIS
//fine LP PG190220

public class NotificaScartoRequestType  implements java.io.Serializable {
    private java.lang.String chiave_transazione;

    private java.lang.String tipo_notifica;

    private java.lang.String tipo_destinatario;

    private java.lang.String descrizioneTipologiaServizio;

    private java.lang.String descrizioneEnte;

    private java.lang.String descrizioneUfficio;

    public NotificaScartoRequestType() {
    }

    public NotificaScartoRequestType(
           java.lang.String chiave_transazione,
           java.lang.String tipo_notifica,
           java.lang.String tipo_destinatario,
           java.lang.String descrizioneTipologiaServizio,
           java.lang.String descrizioneEnte,
           java.lang.String descrizioneUfficio) {
           this.chiave_transazione = chiave_transazione;
           this.tipo_notifica = tipo_notifica;
           this.tipo_destinatario = tipo_destinatario;
           this.descrizioneTipologiaServizio = descrizioneTipologiaServizio;
           this.descrizioneEnte = descrizioneEnte;
           this.descrizioneUfficio = descrizioneUfficio;
    }


    /**
     * Gets the chiave_transazione value for this NotificaScartoRequestType.
     * 
     * @return chiave_transazione
     */
    public java.lang.String getChiave_transazione() {
        return chiave_transazione;
    }


    /**
     * Sets the chiave_transazione value for this NotificaScartoRequestType.
     * 
     * @param chiave_transazione
     */
    public void setChiave_transazione(java.lang.String chiave_transazione) {
        this.chiave_transazione = chiave_transazione;
    }


    /**
     * Gets the tipo_notifica value for this NotificaScartoRequestType.
     * 
     * @return tipo_notifica
     */
    public java.lang.String getTipo_notifica() {
        return tipo_notifica;
    }


    /**
     * Sets the tipo_notifica value for this NotificaScartoRequestType.
     * 
     * @param tipo_notifica
     */
    public void setTipo_notifica(java.lang.String tipo_notifica) {
        this.tipo_notifica = tipo_notifica;
    }


    /**
     * Gets the tipo_destinatario value for this NotificaScartoRequestType.
     * 
     * @return tipo_destinatario
     */
    public java.lang.String getTipo_destinatario() {
        return tipo_destinatario;
    }


    /**
     * Sets the tipo_destinatario value for this NotificaScartoRequestType.
     * 
     * @param tipo_destinatario
     */
    public void setTipo_destinatario(java.lang.String tipo_destinatario) {
        this.tipo_destinatario = tipo_destinatario;
    }


    /**
     * Gets the descrizioneTipologiaServizio value for this NotificaScartoRequestType.
     * 
     * @return descrizioneTipologiaServizio
     */
    public java.lang.String getDescrizioneTipologiaServizio() {
        return descrizioneTipologiaServizio;
    }


    /**
     * Sets the descrizioneTipologiaServizio value for this NotificaScartoRequestType.
     * 
     * @param descrizioneTipologiaServizio
     */
    public void setDescrizioneTipologiaServizio(java.lang.String descrizioneTipologiaServizio) {
        this.descrizioneTipologiaServizio = descrizioneTipologiaServizio;
    }


    /**
     * Gets the descrizioneEnte value for this NotificaScartoRequestType.
     * 
     * @return descrizioneEnte
     */
    public java.lang.String getDescrizioneEnte() {
        return descrizioneEnte;
    }


    /**
     * Sets the descrizioneEnte value for this NotificaScartoRequestType.
     * 
     * @param descrizioneEnte
     */
    public void setDescrizioneEnte(java.lang.String descrizioneEnte) {
        this.descrizioneEnte = descrizioneEnte;
    }


    /**
     * Gets the descrizioneUfficio value for this NotificaScartoRequestType.
     * 
     * @return descrizioneUfficio
     */
    public java.lang.String getDescrizioneUfficio() {
        return descrizioneUfficio;
    }


    /**
     * Sets the descrizioneUfficio value for this NotificaScartoRequestType.
     * 
     * @param descrizioneUfficio
     */
    public void setDescrizioneUfficio(java.lang.String descrizioneUfficio) {
        this.descrizioneUfficio = descrizioneUfficio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaScartoRequestType)) return false;
        NotificaScartoRequestType other = (NotificaScartoRequestType) obj;
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
            ((this.tipo_destinatario==null && other.getTipo_destinatario()==null) || 
             (this.tipo_destinatario!=null &&
              this.tipo_destinatario.equals(other.getTipo_destinatario()))) &&
            ((this.descrizioneTipologiaServizio==null && other.getDescrizioneTipologiaServizio()==null) || 
             (this.descrizioneTipologiaServizio!=null &&
              this.descrizioneTipologiaServizio.equals(other.getDescrizioneTipologiaServizio()))) &&
            ((this.descrizioneEnte==null && other.getDescrizioneEnte()==null) || 
             (this.descrizioneEnte!=null &&
              this.descrizioneEnte.equals(other.getDescrizioneEnte()))) &&
            ((this.descrizioneUfficio==null && other.getDescrizioneUfficio()==null) || 
             (this.descrizioneUfficio!=null &&
              this.descrizioneUfficio.equals(other.getDescrizioneUfficio())));
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
        if (getTipo_destinatario() != null) {
            _hashCode += getTipo_destinatario().hashCode();
        }
        if (getDescrizioneTipologiaServizio() != null) {
            _hashCode += getDescrizioneTipologiaServizio().hashCode();
        }
        if (getDescrizioneEnte() != null) {
            _hashCode += getDescrizioneEnte().hashCode();
        }
        if (getDescrizioneUfficio() != null) {
            _hashCode += getDescrizioneUfficio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaScartoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaScartoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiave_transazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "chiave_transazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_notifica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "tipo_notifica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_destinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "tipo_destinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "descrizioneTipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "descrizioneEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "descrizioneUfficio"));
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
