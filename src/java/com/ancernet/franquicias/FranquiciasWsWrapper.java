/**
 * FranquiciasWsWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ancernet.franquicias;

public interface FranquiciasWsWrapper extends java.rmi.Remote {
    public com.ancernet.franquicias.Cliente[] getAllClientes() throws java.rmi.RemoteException;
    public com.ancernet.franquicias.Producto[] getAllProductos() throws java.rmi.RemoteException;
    public com.ancernet.franquicias.PromocionPorClienteDetalle[] getAllPromocionesPorClienteDetalle() throws java.rmi.RemoteException;
    public com.ancernet.franquicias.PromocionPorTipoCliente[] getAllPromocionesPorTipoCliente() throws java.rmi.RemoteException;
    public com.ancernet.franquicias.PromocionPorTipoClienteRango[] getAllPromocionesPorTipoClienteRango() throws java.rmi.RemoteException;
    public com.ancernet.franquicias.PromocionPorTipoClienteDetalle[] getAllPromocionesPorTipoClienteDetalle() throws java.rmi.RemoteException;
    public long insertFacturaHeader(int codigoBodega, int tipoOperacion, java.util.Calendar fechaEmision, java.lang.String codigoCliente, int anioIngreso, double descuentoGlobal, java.util.Calendar anio, double subTotal, java.lang.String usuario, double valor, java.lang.String direccionCliente, java.util.Calendar fechaDocumento, int tipoCliente, java.lang.String nombreCliente, double totalFActura, double itbms, int numeroDocumentoReferencia, java.lang.String nit, java.lang.String numeroComprobanteFiscalSistema, java.util.Calendar fechaComprobante, java.lang.String serieImpresoraFiscal, double subtotalComprobanteFiscal, double itbmsComprobante, double totalComprobante) throws java.rmi.RemoteException;
    public com.ancernet.franquicias.Existencia[] getExistencia(int codigoBodega) throws java.rmi.RemoteException;
    public com.ancernet.franquicias.Precio[] getAllPrecios() throws java.rmi.RemoteException;
    public com.ancernet.franquicias.PromocionPorCliente[] getAllPromocionesPorCliente() throws java.rmi.RemoteException;
    public com.ancernet.franquicias.PromocionPorClienteRango[] getAllPromocionesPorClienteRango() throws java.rmi.RemoteException;
    public boolean insertFacturaDetalle(int tipoOperacion, double itemItbms, int codBodega, java.lang.String codigoProducto, int pagaImpuesto, java.lang.String codigoProductoPromocion, double cantidad, int tipoCliente, java.lang.String esPromocion, int itemPromocion, int secuencia, int codigoCategoria, java.lang.String codigoCliente, java.lang.String nombreCliente, double porcentajeDescuento, double precioVenta, int numeroDocumento, double cantidadVenta, int numeroPromocion, double precioDescuento) throws java.rmi.RemoteException;
}
