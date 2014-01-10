/**
 * ICliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ICliente extends java.rmi.Remote {
    public org.datacontract.schemas.Customer[] getAllClientes() throws java.rmi.RemoteException;
    public org.datacontract.schemas.CompositeType getDataUsingDataContract(org.datacontract.schemas.CompositeType composite) throws java.rmi.RemoteException;
}
