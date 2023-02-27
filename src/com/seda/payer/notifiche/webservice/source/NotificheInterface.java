/**
 * NotificheInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.source;

public interface NotificheInterface extends java.rmi.Remote {
    public com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType notificaAutorizzazioneBanca(com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType notificaQuietanzaBollettini(com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.NotificaScartoResponseType notificaScarto(com.seda.payer.notifiche.webservice.dati.NotificaScartoRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.NotificaMAVResponseType notificaMAV(com.seda.payer.notifiche.webservice.dati.NotificaMAVRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType downloadQuietanzaBollettini(com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.NotificaRIDResponseType notificaRID(com.seda.payer.notifiche.webservice.dati.NotificaRIDRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDResponseType recuperaPdfRID(com.seda.payer.notifiche.webservice.dati.RecuperaPdfRIDRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.GeneraPdfBollettiniResponse generaPdfBollettini(com.seda.payer.notifiche.webservice.dati.GeneraPdfSingoloBollettinoRequest[] in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.GeneraPdfAutorizzazioniBancaResponse generaPdfAutorizzazioniBanca(java.lang.String[] in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType notificaTentativiPagamento(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    public com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType notificaTentativiPagamentoBatch(com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    //inizio LP PG190220
    public com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoResponseType notificaAnnulloTecnico(com.seda.payer.notifiche.webservice.dati.NotificaAnnulloTecnicoRequestType in) throws java.rmi.RemoteException, com.seda.payer.notifiche.webservice.srv.FaultType;
    //fine LP PG190220
}
