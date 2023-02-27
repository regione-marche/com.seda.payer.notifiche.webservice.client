/**
 * NotificheServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.notifiche.webservice.source;

public class NotificheServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.notifiche.webservice.source.NotificheService {

    public NotificheServiceLocator() {
    }


    public NotificheServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NotificheServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NotifichePort
    private java.lang.String NotifichePort_address = "http://10.10.80.6:8862/NotificheService/notifiche";

    public java.lang.String getNotifichePortAddress() {
        return NotifichePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NotifichePortWSDDServiceName = "NotifichePort";

    public java.lang.String getNotifichePortWSDDServiceName() {
        return NotifichePortWSDDServiceName;
    }

    public void setNotifichePortWSDDServiceName(java.lang.String name) {
        NotifichePortWSDDServiceName = name;
    }

    public com.seda.payer.notifiche.webservice.source.NotificheInterface getNotifichePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NotifichePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNotifichePort(endpoint);
    }

    public com.seda.payer.notifiche.webservice.source.NotificheInterface getNotifichePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.notifiche.webservice.source.NotificheSOAPBindingStub _stub = new com.seda.payer.notifiche.webservice.source.NotificheSOAPBindingStub(portAddress, this);
            _stub.setPortName(getNotifichePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNotifichePortEndpointAddress(java.lang.String address) {
        NotifichePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.notifiche.webservice.source.NotificheInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.notifiche.webservice.source.NotificheSOAPBindingStub _stub = new com.seda.payer.notifiche.webservice.source.NotificheSOAPBindingStub(new java.net.URL(NotifichePort_address), this);
                _stub.setPortName(getNotifichePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NotifichePort".equals(inputPortName)) {
            return getNotifichePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.notifiche.payer.seda.com", "NotificheService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.notifiche.payer.seda.com", "NotifichePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NotifichePort".equals(portName)) {
            setNotifichePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
