/**
 * NotificheSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.source;

public class NotificheSOAPBindingStub extends org.apache.axis.client.Stub implements com.seda.payer.notifiche.webservice.source.NotificheInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12]; //LP PG190220
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaAutorizzazioneBanca");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAutorizzazioneBancaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAutorizzazioneBancaRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAutorizzazioneBancaResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAutorizzazioneBancaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaQuietanzaBollettini");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaQuietanzaBollettiniRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaQuietanzaBollettiniRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaQuietanzaBollettiniResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaQuietanzaBollettiniResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaScarto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaScartoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaScartoRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaScartoRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaScartoResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaScartoResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaScartoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaMAV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaMAVRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaMAVRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaMAVRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaMAVResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaMAVResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaMAVResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("downloadQuietanzaBollettini");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "downloadQuietanzaBollettiniRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "downloadQuietanzaBollettiniRequestType"), com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "downloadQuietanzaBollettiniResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "downloadQuietanzaBollettiniResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaRID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaRIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaRIDRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaRIDRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaRIDResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaRIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaRIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaPdfRID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "RecuperaPdfRIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "RecuperaPdfRIDRequestType"), com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "RecuperaPdfRIDResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "RecuperaPdfRIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generaPdfBollettini");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "GeneraPdfBollettiniRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfBollettiniRequest"), com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaBollettini"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfBollettiniResponse"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.GeneraPdfBollettiniResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "GeneraPdfBollettiniResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generaPdfAutorizzazioniBanca");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "GeneraPdfAutorizzazioniBancaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfAutorizzazioniBancaRequest"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaChiaveTransazione"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfAutorizzazioniBancaResponse"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.GeneraPdfAutorizzazioniBancaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "GeneraPdfAutorizzazioniBancaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaTentativiPagamento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaTentativiPagamentoBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoBatchRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoBatchResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoBatchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[10] = oper;
        //inizio LP PG190220
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("notificaAnnulloTecnico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAnnulloTecnicoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAnnulloTecnicoRequestType"), com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAnnulloTecnicoResponseType"));
        oper.setReturnClass(com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAnnulloTecnicoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "Fault"),
                      "com.seda.payer.notifiche.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[11] = oper;
        //fine LP PG190220
    }

    public NotificheSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NotificheSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NotificheSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfAutorizzazioniBancaRequest");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaChiaveTransazione");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfAutorizzazioniBancaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.GeneraPdfAutorizzazioniBancaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfBollettiniRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "GeneraPdfSingoloBollettinoRequest");
            qName2 = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "listaBollettini");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfBollettiniResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.GeneraPdfBollettiniResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">GeneraPdfSingoloBollettinoRequest>tipoBollettino");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequestTipoBollettino.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">NotificaTentativiPagamentoRequestType>chiave_transazione");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">Response>retcode");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.ResponseRetcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", ">Response>retmessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "downloadQuietanzaBollettiniRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "downloadQuietanzaBollettiniResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "GeneraPdfSingoloBollettinoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            //inizio LP PG190220
            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAnnulloTecnicoRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAnnulloTecnicoResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            //fine LP PG190220

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAutorizzazioneBancaRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaAutorizzazioneBancaResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaMAVRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaMAVRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaMAVResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaMAVResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaQuietanzaBollettiniRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaQuietanzaBollettiniResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaRIDRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaRIDRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaRIDResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaRIDResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaScartoRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaScartoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaScartoResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaScartoResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoBatchRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoBatchResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "NotificaTentativiPagamentoResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "RecuperaPdfRIDRequestType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "RecuperaPdfRIDResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.notifiche.payer.seda.com", "Response");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.dati.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://srv.webservice.notifiche.payer.seda.com", "FaultType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.notifiche.webservice.srv.FaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType notificaAutorizzazioneBanca(com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaAutorizzazioneBanca"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType notificaQuietanzaBollettini(com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaQuietanzaBollettini"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaScartoResponseType notificaScarto(com.seda.payer.notifiche.webservice.dati.NotificaScartoRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaScarto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaScartoResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaScartoResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaScartoResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaMAVResponseType notificaMAV(com.seda.payer.notifiche.webservice.dati.NotificaMAVRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaMAV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaMAVResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaMAVResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaMAVResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType downloadQuietanzaBollettini(com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "downloadQuietanzaBollettini"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaRIDResponseType notificaRID(com.seda.payer.notifiche.webservice.dati.NotificaRIDRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaRID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaRIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaRIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaRIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDResponseType recuperaPdfRID(com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaPdfRID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.GeneraPdfBollettiniResponse generaPdfBollettini(com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequest[] in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generaPdfBollettini"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.GeneraPdfBollettiniResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.GeneraPdfBollettiniResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.GeneraPdfBollettiniResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.GeneraPdfAutorizzazioniBancaResponse generaPdfAutorizzazioniBanca(java.lang.String[] in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generaPdfAutorizzazioniBanca"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.GeneraPdfAutorizzazioniBancaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.GeneraPdfAutorizzazioniBancaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.GeneraPdfAutorizzazioniBancaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType notificaTentativiPagamento(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaTentativiPagamento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType notificaTentativiPagamentoBatch(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaTentativiPagamentoBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    //inizio LP PG190220
    public com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoResponseType notificaAnnulloTecnico(com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "notificaAnnulloTecnico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.notifiche.webservice.srv.FaultType) {
              throw (com.seda.payer.notifiche.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }
    //fine LP PG190220

}
