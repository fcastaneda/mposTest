package com.ancernet.franquicias;

public class FranquiciasWsWrapperProxy implements com.ancernet.franquicias.FranquiciasWsWrapper {
  private String _endpoint = null;
  private com.ancernet.franquicias.FranquiciasWsWrapper franquiciasWsWrapper = null;
  
  public FranquiciasWsWrapperProxy() {
    _initFranquiciasWsWrapperProxy();
  }
  
  public FranquiciasWsWrapperProxy(String endpoint) {
    _endpoint = endpoint;
    _initFranquiciasWsWrapperProxy();
  }
  
  private void _initFranquiciasWsWrapperProxy() {
    try {
      franquiciasWsWrapper = (new com.ancernet.franquicias.FranquiciasWsWrapperServiceLocator()).getFranquiciasWsWrapper();
      if (franquiciasWsWrapper != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)franquiciasWsWrapper)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)franquiciasWsWrapper)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (franquiciasWsWrapper != null)
      ((javax.xml.rpc.Stub)franquiciasWsWrapper)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ancernet.franquicias.FranquiciasWsWrapper getFranquiciasWsWrapper() {
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper;
  }
  
  public com.ancernet.franquicias.Cliente[] getAllClientes() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllClientes();
  }
  
  public com.ancernet.franquicias.Producto[] getAllProductos() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllProductos();
  }
  
  public com.ancernet.franquicias.PromocionPorClienteDetalle[] getAllPromocionesPorClienteDetalle() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllPromocionesPorClienteDetalle();
  }
  
  public com.ancernet.franquicias.PromocionPorTipoCliente[] getAllPromocionesPorTipoCliente() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllPromocionesPorTipoCliente();
  }
  
  public com.ancernet.franquicias.PromocionPorTipoClienteRango[] getAllPromocionesPorTipoClienteRango() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllPromocionesPorTipoClienteRango();
  }
  
  public com.ancernet.franquicias.PromocionPorTipoClienteDetalle[] getAllPromocionesPorTipoClienteDetalle() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllPromocionesPorTipoClienteDetalle();
  }
  
  public long insertFacturaHeader(int codigoBodega, int tipoOperacion, java.util.Calendar fechaEmision, java.lang.String codigoCliente, int anioIngreso, double descuentoGlobal, java.util.Calendar anio, double subTotal, java.lang.String usuario, double valor, java.lang.String direccionCliente, java.util.Calendar fechaDocumento, int tipoCliente, java.lang.String nombreCliente, double totalFActura, double itbms, int numeroDocumentoReferencia, java.lang.String nit, java.lang.String numeroComprobanteFiscalSistema, java.util.Calendar fechaComprobante, java.lang.String serieImpresoraFiscal, double subtotalComprobanteFiscal, double itbmsComprobante, double totalComprobante) throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.insertFacturaHeader(codigoBodega, tipoOperacion, fechaEmision, codigoCliente, anioIngreso, descuentoGlobal, anio, subTotal, usuario, valor, direccionCliente, fechaDocumento, tipoCliente, nombreCliente, totalFActura, itbms, numeroDocumentoReferencia, nit, numeroComprobanteFiscalSistema, fechaComprobante, serieImpresoraFiscal, subtotalComprobanteFiscal, itbmsComprobante, totalComprobante);
  }
  
  public com.ancernet.franquicias.Existencia[] getExistencia(int codigoBodega) throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getExistencia(codigoBodega);
  }
  
  public com.ancernet.franquicias.Precio[] getAllPrecios() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllPrecios();
  }
  
  public com.ancernet.franquicias.PromocionPorCliente[] getAllPromocionesPorCliente() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllPromocionesPorCliente();
  }
  
  public com.ancernet.franquicias.PromocionPorClienteRango[] getAllPromocionesPorClienteRango() throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.getAllPromocionesPorClienteRango();
  }
  
  public boolean insertFacturaDetalle(int tipoOperacion, double itemItbms, int codBodega, java.lang.String codigoProducto, int pagaImpuesto, java.lang.String codigoProductoPromocion, double cantidad, int tipoCliente, java.lang.String esPromocion, int itemPromocion, int secuencia, int codigoCategoria, java.lang.String codigoCliente, java.lang.String nombreCliente, double porcentajeDescuento, double precioVenta, int numeroDocumento, double cantidadVenta, int numeroPromocion, double precioDescuento) throws java.rmi.RemoteException{
    if (franquiciasWsWrapper == null)
      _initFranquiciasWsWrapperProxy();
    return franquiciasWsWrapper.insertFacturaDetalle(tipoOperacion, itemItbms, codBodega, codigoProducto, pagaImpuesto, codigoProductoPromocion, cantidad, tipoCliente, esPromocion, itemPromocion, secuencia, codigoCategoria, codigoCliente, nombreCliente, porcentajeDescuento, precioVenta, numeroDocumento, cantidadVenta, numeroPromocion, precioDescuento);
  }
  
  
}