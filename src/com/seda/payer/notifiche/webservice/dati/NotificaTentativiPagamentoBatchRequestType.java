/**
 * NotificaTentativiPagamentoBatchRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.dati;

public class NotificaTentativiPagamentoBatchRequestType  implements java.io.Serializable {
    private com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiCF;

    private com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiIP;

    private com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiEmail;

    private com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiBollettini;

    private com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiCanalePagamento;

    public NotificaTentativiPagamentoBatchRequestType() {
    }

    public NotificaTentativiPagamentoBatchRequestType(
           com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiCF,
           com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiIP,
           com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiEmail,
           com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiBollettini,
           com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiCanalePagamento) {
           this.listaAnalisiCF = listaAnalisiCF;
           this.listaAnalisiIP = listaAnalisiIP;
           this.listaAnalisiEmail = listaAnalisiEmail;
           this.listaAnalisiBollettini = listaAnalisiBollettini;
           this.listaAnalisiCanalePagamento = listaAnalisiCanalePagamento;
    }


    /**
     * Gets the listaAnalisiCF value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @return listaAnalisiCF
     */
    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] getListaAnalisiCF() {
        return listaAnalisiCF;
    }


    /**
     * Sets the listaAnalisiCF value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @param listaAnalisiCF
     */
    public void setListaAnalisiCF(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiCF) {
        this.listaAnalisiCF = listaAnalisiCF;
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType getListaAnalisiCF(int i) {
        return this.listaAnalisiCF[i];
    }

    public void setListaAnalisiCF(int i, com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType _value) {
        this.listaAnalisiCF[i] = _value;
    }


    /**
     * Gets the listaAnalisiIP value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @return listaAnalisiIP
     */
    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] getListaAnalisiIP() {
        return listaAnalisiIP;
    }


    /**
     * Sets the listaAnalisiIP value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @param listaAnalisiIP
     */
    public void setListaAnalisiIP(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiIP) {
        this.listaAnalisiIP = listaAnalisiIP;
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType getListaAnalisiIP(int i) {
        return this.listaAnalisiIP[i];
    }

    public void setListaAnalisiIP(int i, com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType _value) {
        this.listaAnalisiIP[i] = _value;
    }


    /**
     * Gets the listaAnalisiEmail value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @return listaAnalisiEmail
     */
    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] getListaAnalisiEmail() {
        return listaAnalisiEmail;
    }


    /**
     * Sets the listaAnalisiEmail value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @param listaAnalisiEmail
     */
    public void setListaAnalisiEmail(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiEmail) {
        this.listaAnalisiEmail = listaAnalisiEmail;
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType getListaAnalisiEmail(int i) {
        return this.listaAnalisiEmail[i];
    }

    public void setListaAnalisiEmail(int i, com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType _value) {
        this.listaAnalisiEmail[i] = _value;
    }


    /**
     * Gets the listaAnalisiBollettini value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @return listaAnalisiBollettini
     */
    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] getListaAnalisiBollettini() {
        return listaAnalisiBollettini;
    }


    /**
     * Sets the listaAnalisiBollettini value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @param listaAnalisiBollettini
     */
    public void setListaAnalisiBollettini(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiBollettini) {
        this.listaAnalisiBollettini = listaAnalisiBollettini;
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType getListaAnalisiBollettini(int i) {
        return this.listaAnalisiBollettini[i];
    }

    public void setListaAnalisiBollettini(int i, com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType _value) {
        this.listaAnalisiBollettini[i] = _value;
    }


    /**
     * Gets the listaAnalisiCanalePagamento value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @return listaAnalisiCanalePagamento
     */
    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] getListaAnalisiCanalePagamento() {
        return listaAnalisiCanalePagamento;
    }


    /**
     * Sets the listaAnalisiCanalePagamento value for this NotificaTentativiPagamentoBatchRequestType.
     * 
     * @param listaAnalisiCanalePagamento
     */
    public void setListaAnalisiCanalePagamento(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType[] listaAnalisiCanalePagamento) {
        this.listaAnalisiCanalePagamento = listaAnalisiCanalePagamento;
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType getListaAnalisiCanalePagamento(int i) {
        return this.listaAnalisiCanalePagamento[i];
    }

    public void setListaAnalisiCanalePagamento(int i, com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType _value) {
        this.listaAnalisiCanalePagamento[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaTentativiPagamentoBatchRequestType)) return false;
        NotificaTentativiPagamentoBatchRequestType other = (NotificaTentativiPagamentoBatchRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaAnalisiCF==null && other.getListaAnalisiCF()==null) || 
             (this.listaAnalisiCF!=null &&
              java.util.Arrays.equals(this.listaAnalisiCF, other.getListaAnalisiCF()))) &&
            ((this.listaAnalisiIP==null && other.getListaAnalisiIP()==null) || 
             (this.listaAnalisiIP!=null &&
              java.util.Arrays.equals(this.listaAnalisiIP, other.getListaAnalisiIP()))) &&
            ((this.listaAnalisiEmail==null && other.getListaAnalisiEmail()==null) || 
             (this.listaAnalisiEmail!=null &&
              java.util.Arrays.equals(this.listaAnalisiEmail, other.getListaAnalisiEmail()))) &&
            ((this.listaAnalisiBollettini==null && other.getListaAnalisiBollettini()==null) || 
             (this.listaAnalisiBollettini!=null &&
              java.util.Arrays.equals(this.listaAnalisiBollettini, other.getListaAnalisiBollettini()))) &&
            ((this.listaAnalisiCanalePagamento==null && other.getListaAnalisiCanalePagamento()==null) || 
             (this.listaAnalisiCanalePagamento!=null &&
              java.util.Arrays.equals(this.listaAnalisiCanalePagamento, other.getListaAnalisiCanalePagamento())));
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
        if (getListaAnalisiCF() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAnalisiCF());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAnalisiCF(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaAnalisiIP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAnalisiIP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAnalisiIP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaAnalisiEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAnalisiEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAnalisiEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaAnalisiBollettini() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAnalisiBollettini());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAnalisiBollettini(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaAnalisiCanalePagamento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAnalisiCanalePagamento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAnalisiCanalePagamento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaTentativiPagamentoBatchRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoBatchRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAnalisiCF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaAnalisiCF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAnalisiIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaAnalisiIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAnalisiEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaAnalisiEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAnalisiBollettini");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaAnalisiBollettini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAnalisiCanalePagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaAnalisiCanalePagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
