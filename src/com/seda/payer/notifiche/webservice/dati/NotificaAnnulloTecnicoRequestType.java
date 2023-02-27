/**
 * NotificaAnnulloTecnicoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class NotificaAnnulloTecnicoRequestType  implements java.io.Serializable {
    private java.lang.String chiave_transazione;

    private java.lang.String tipo_notifica;

    private java.lang.String tipo_destinatario;

    private java.lang.String modalita;

    private java.lang.String precedenteRTPositiva;

    public NotificaAnnulloTecnicoRequestType() {
    }

    public NotificaAnnulloTecnicoRequestType(
           java.lang.String chiave_transazione,
           java.lang.String tipo_notifica,
           java.lang.String tipo_destinatario,
           java.lang.String modalita,
           java.lang.String precedenteRTPositiva) {
           this.chiave_transazione = chiave_transazione;
           this.tipo_notifica = tipo_notifica;
           this.tipo_destinatario = tipo_destinatario;
           this.modalita = modalita;
           this.precedenteRTPositiva = precedenteRTPositiva;
    }


    /**
     * Gets the chiave_transazione value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @return chiave_transazione
     */
    public java.lang.String getChiave_transazione() {
        return chiave_transazione;
    }


    /**
     * Sets the chiave_transazione value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @param chiave_transazione
     */
    public void setChiave_transazione(java.lang.String chiave_transazione) {
        this.chiave_transazione = chiave_transazione;
    }


    /**
     * Gets the tipo_notifica value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @return tipo_notifica
     */
    public java.lang.String getTipo_notifica() {
        return tipo_notifica;
    }


    /**
     * Sets the tipo_notifica value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @param tipo_notifica
     */
    public void setTipo_notifica(java.lang.String tipo_notifica) {
        this.tipo_notifica = tipo_notifica;
    }


    /**
     * Gets the tipo_destinatario value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @return tipo_destinatario
     */
    public java.lang.String getTipo_destinatario() {
        return tipo_destinatario;
    }


    /**
     * Sets the tipo_destinatario value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @param tipo_destinatario
     */
    public void setTipo_destinatario(java.lang.String tipo_destinatario) {
        this.tipo_destinatario = tipo_destinatario;
    }


    /**
     * Gets the modalita value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @return modalita
     */
    public java.lang.String getModalita() {
        return modalita;
    }


    /**
     * Sets the modalita value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @param modalita
     */
    public void setModalita(java.lang.String modalita) {
        this.modalita = modalita;
    }


    /**
     * Gets the precedenteRTPositiva value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @return precedenteRTPositiva
     */
    public java.lang.String getPrecedenteRTPositiva() {
        return precedenteRTPositiva;
    }


    /**
     * Sets the precedenteRTPositiva value for this NotificaAnnulloTecnicoRequestType.
     * 
     * @param precedenteRTPositiva
     */
    public void setPrecedenteRTPositiva(java.lang.String precedenteRTPositiva) {
        this.precedenteRTPositiva = precedenteRTPositiva;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaAnnulloTecnicoRequestType)) return false;
        NotificaAnnulloTecnicoRequestType other = (NotificaAnnulloTecnicoRequestType) obj;
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
            ((this.modalita==null && other.getModalita()==null) || 
             (this.modalita!=null &&
              this.modalita.equals(other.getModalita()))) &&
            ((this.precedenteRTPositiva==null && other.getPrecedenteRTPositiva()==null) || 
             (this.precedenteRTPositiva!=null &&
              this.precedenteRTPositiva.equals(other.getPrecedenteRTPositiva())));
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
        if (getModalita() != null) {
            _hashCode += getModalita().hashCode();
        }
        if (getPrecedenteRTPositiva() != null) {
            _hashCode += getPrecedenteRTPositiva().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaAnnulloTecnicoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAnnulloTecnicoRequestType"));
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
        elemField.setFieldName("modalita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "modalita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precedenteRTPositiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "precedenteRTPositiva"));
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
