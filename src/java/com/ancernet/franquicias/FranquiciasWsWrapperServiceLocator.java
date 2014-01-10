/**
 * FranquiciasWsWrapperServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ancernet.franquicias;

public class FranquiciasWsWrapperServiceLocator extends org.apache.axis.client.Service implements com.ancernet.franquicias.FranquiciasWsWrapperService {

    public FranquiciasWsWrapperServiceLocator() {
    }


    public FranquiciasWsWrapperServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FranquiciasWsWrapperServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FranquiciasWsWrapper
    private java.lang.String FranquiciasWsWrapper_address = "http://localhost:8080/FranquiciasWS/services/FranquiciasWsWrapper";

    public java.lang.String getFranquiciasWsWrapperAddress() {
        return FranquiciasWsWrapper_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FranquiciasWsWrapperWSDDServiceName = "FranquiciasWsWrapper";

    public java.lang.String getFranquiciasWsWrapperWSDDServiceName() {
        return FranquiciasWsWrapperWSDDServiceName;
    }

    public void setFranquiciasWsWrapperWSDDServiceName(java.lang.String name) {
        FranquiciasWsWrapperWSDDServiceName = name;
    }

    public com.ancernet.franquicias.FranquiciasWsWrapper getFranquiciasWsWrapper() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FranquiciasWsWrapper_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFranquiciasWsWrapper(endpoint);
    }

    public com.ancernet.franquicias.FranquiciasWsWrapper getFranquiciasWsWrapper(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ancernet.franquicias.FranquiciasWsWrapperSoapBindingStub _stub = new com.ancernet.franquicias.FranquiciasWsWrapperSoapBindingStub(portAddress, this);
            _stub.setPortName(getFranquiciasWsWrapperWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFranquiciasWsWrapperEndpointAddress(java.lang.String address) {
        FranquiciasWsWrapper_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ancernet.franquicias.FranquiciasWsWrapper.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ancernet.franquicias.FranquiciasWsWrapperSoapBindingStub _stub = new com.ancernet.franquicias.FranquiciasWsWrapperSoapBindingStub(new java.net.URL(FranquiciasWsWrapper_address), this);
                _stub.setPortName(getFranquiciasWsWrapperWSDDServiceName());
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
        if ("FranquiciasWsWrapper".equals(inputPortName)) {
            return getFranquiciasWsWrapper();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://franquicias.ancernet.com", "FranquiciasWsWrapperService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "FranquiciasWsWrapper"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FranquiciasWsWrapper".equals(portName)) {
            setFranquiciasWsWrapperEndpointAddress(address);
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
