/**
 * PromocionPorTipoClienteDetalle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ancernet.franquicias;

public class PromocionPorTipoClienteDetalle  implements java.io.Serializable {
    private java.lang.String cantidadPromocion;

    private int numPromocion;

    private java.lang.String producto;

    private java.lang.String productoPromocion;

    private int rangoHasta;

    private int secuencia;

    private java.lang.String tipoCliente;

    private int unidad;

    public PromocionPorTipoClienteDetalle() {
    }

    public PromocionPorTipoClienteDetalle(
           java.lang.String cantidadPromocion,
           int numPromocion,
           java.lang.String producto,
           java.lang.String productoPromocion,
           int rangoHasta,
           int secuencia,
           java.lang.String tipoCliente,
           int unidad) {
           this.cantidadPromocion = cantidadPromocion;
           this.numPromocion = numPromocion;
           this.producto = producto;
           this.productoPromocion = productoPromocion;
           this.rangoHasta = rangoHasta;
           this.secuencia = secuencia;
           this.tipoCliente = tipoCliente;
           this.unidad = unidad;
    }


    /**
     * Gets the cantidadPromocion value for this PromocionPorTipoClienteDetalle.
     * 
     * @return cantidadPromocion
     */
    public java.lang.String getCantidadPromocion() {
        return cantidadPromocion;
    }


    /**
     * Sets the cantidadPromocion value for this PromocionPorTipoClienteDetalle.
     * 
     * @param cantidadPromocion
     */
    public void setCantidadPromocion(java.lang.String cantidadPromocion) {
        this.cantidadPromocion = cantidadPromocion;
    }


    /**
     * Gets the numPromocion value for this PromocionPorTipoClienteDetalle.
     * 
     * @return numPromocion
     */
    public int getNumPromocion() {
        return numPromocion;
    }


    /**
     * Sets the numPromocion value for this PromocionPorTipoClienteDetalle.
     * 
     * @param numPromocion
     */
    public void setNumPromocion(int numPromocion) {
        this.numPromocion = numPromocion;
    }


    /**
     * Gets the producto value for this PromocionPorTipoClienteDetalle.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this PromocionPorTipoClienteDetalle.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }


    /**
     * Gets the productoPromocion value for this PromocionPorTipoClienteDetalle.
     * 
     * @return productoPromocion
     */
    public java.lang.String getProductoPromocion() {
        return productoPromocion;
    }


    /**
     * Sets the productoPromocion value for this PromocionPorTipoClienteDetalle.
     * 
     * @param productoPromocion
     */
    public void setProductoPromocion(java.lang.String productoPromocion) {
        this.productoPromocion = productoPromocion;
    }


    /**
     * Gets the rangoHasta value for this PromocionPorTipoClienteDetalle.
     * 
     * @return rangoHasta
     */
    public int getRangoHasta() {
        return rangoHasta;
    }


    /**
     * Sets the rangoHasta value for this PromocionPorTipoClienteDetalle.
     * 
     * @param rangoHasta
     */
    public void setRangoHasta(int rangoHasta) {
        this.rangoHasta = rangoHasta;
    }


    /**
     * Gets the secuencia value for this PromocionPorTipoClienteDetalle.
     * 
     * @return secuencia
     */
    public int getSecuencia() {
        return secuencia;
    }


    /**
     * Sets the secuencia value for this PromocionPorTipoClienteDetalle.
     * 
     * @param secuencia
     */
    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }


    /**
     * Gets the tipoCliente value for this PromocionPorTipoClienteDetalle.
     * 
     * @return tipoCliente
     */
    public java.lang.String getTipoCliente() {
        return tipoCliente;
    }


    /**
     * Sets the tipoCliente value for this PromocionPorTipoClienteDetalle.
     * 
     * @param tipoCliente
     */
    public void setTipoCliente(java.lang.String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    /**
     * Gets the unidad value for this PromocionPorTipoClienteDetalle.
     * 
     * @return unidad
     */
    public int getUnidad() {
        return unidad;
    }


    /**
     * Sets the unidad value for this PromocionPorTipoClienteDetalle.
     * 
     * @param unidad
     */
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromocionPorTipoClienteDetalle)) return false;
        PromocionPorTipoClienteDetalle other = (PromocionPorTipoClienteDetalle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cantidadPromocion==null && other.getCantidadPromocion()==null) || 
             (this.cantidadPromocion!=null &&
              this.cantidadPromocion.equals(other.getCantidadPromocion()))) &&
            this.numPromocion == other.getNumPromocion() &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto()))) &&
            ((this.productoPromocion==null && other.getProductoPromocion()==null) || 
             (this.productoPromocion!=null &&
              this.productoPromocion.equals(other.getProductoPromocion()))) &&
            this.rangoHasta == other.getRangoHasta() &&
            this.secuencia == other.getSecuencia() &&
            ((this.tipoCliente==null && other.getTipoCliente()==null) || 
             (this.tipoCliente!=null &&
              this.tipoCliente.equals(other.getTipoCliente()))) &&
            this.unidad == other.getUnidad();
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
        if (getCantidadPromocion() != null) {
            _hashCode += getCantidadPromocion().hashCode();
        }
        _hashCode += getNumPromocion();
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        if (getProductoPromocion() != null) {
            _hashCode += getProductoPromocion().hashCode();
        }
        _hashCode += getRangoHasta();
        _hashCode += getSecuencia();
        if (getTipoCliente() != null) {
            _hashCode += getTipoCliente().hashCode();
        }
        _hashCode += getUnidad();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromocionPorTipoClienteDetalle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "PromocionPorTipoClienteDetalle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadPromocion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "cantidadPromocion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPromocion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "numPromocion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "producto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoPromocion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "productoPromocion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "rangoHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secuencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "secuencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "tipoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "unidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
