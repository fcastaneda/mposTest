package org.tempuri;

public class IClienteProxy implements org.tempuri.ICliente {
  private String _endpoint = null;
  private org.tempuri.ICliente iCliente = null;
  
  public IClienteProxy() {
    _initIClienteProxy();
  }
  
  public IClienteProxy(String endpoint) {
    _endpoint = endpoint;
    _initIClienteProxy();
  }
  
  private void _initIClienteProxy() {
    try {
      iCliente = (new org.tempuri.ClienteLocator()).getBasicHttpBinding_ICliente();
      if (iCliente != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCliente)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCliente)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCliente != null)
      ((javax.xml.rpc.Stub)iCliente)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ICliente getICliente() {
    if (iCliente == null)
      _initIClienteProxy();
    return iCliente;
  }
  
  public org.datacontract.schemas.Customer[] getAllClientes() throws java.rmi.RemoteException{
    if (iCliente == null)
      _initIClienteProxy();
    return iCliente.getAllClientes();
  }
  
  public org.datacontract.schemas.CompositeType getDataUsingDataContract(org.datacontract.schemas.CompositeType composite) throws java.rmi.RemoteException{
    if (iCliente == null)
      _initIClienteProxy();
    return iCliente.getDataUsingDataContract(composite);
  }
  
  
}