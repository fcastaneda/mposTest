/**
 * PromocionPorClienteDetalle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ancernet.franquicias;

public class PromocionPorClienteDetalle  implements java.io.Serializable {
    private java.lang.String cantidadPromocion;

    private java.lang.String cliente;

    private java.lang.String formaPago;

    private int numPromocion;

    private int numeroPromocion;

    private java.lang.String producto;

    private java.lang.String productoPromocion;

    private int rangoHasta;

    private int secuencia;

    private int unidad;

    public PromocionPorClienteDetalle() {
    }

    public PromocionPorClienteDetalle(
           java.lang.String cantidadPromocion,
           java.lang.String cliente,
           java.lang.String formaPago,
           int numPromocion,
           int numeroPromocion,
           java.lang.String producto,
           java.lang.String productoPromocion,
           int rangoHasta,
           int secuencia,
           int unidad) {
           this.cantidadPromocion = cantidadPromocion;
           this.cliente = cliente;
           this.formaPago = formaPago;
           this.numPromocion = numPromocion;
           this.numeroPromocion = numeroPromocion;
           this.producto = producto;
           this.productoPromocion = productoPromocion;
           this.rangoHasta = rangoHasta;
           this.secuencia = secuencia;
           this.unidad = unidad;
    }


    /**
     * Gets the cantidadPromocion value for this PromocionPorClienteDetalle.
     * 
     * @return cantidadPromocion
     */
    public java.lang.String getCantidadPromocion() {
        return cantidadPromocion;
    }


    /**
     * Sets the cantidadPromocion value for this PromocionPorClienteDetalle.
     * 
     * @param cantidadPromocion
     */
    public void setCantidadPromocion(java.lang.String cantidadPromocion) {
        this.cantidadPromocion = cantidadPromocion;
    }


    /**
     * Gets the cliente value for this PromocionPorClienteDetalle.
     * 
     * @return cliente
     */
    public java.lang.String getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this PromocionPorClienteDetalle.
     * 
     * @param cliente
     */
    public void setCliente(java.lang.String cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the formaPago value for this PromocionPorClienteDetalle.
     * 
     * @return formaPago
     */
    public java.lang.String getFormaPago() {
        return formaPago;
    }


    /**
     * Sets the formaPago value for this PromocionPorClienteDetalle.
     * 
     * @param formaPago
     */
    public void setFormaPago(java.lang.String formaPago) {
        this.formaPago = formaPago;
    }


    /**
     * Gets the numPromocion value for this PromocionPorClienteDetalle.
     * 
     * @return numPromocion
     */
    public int getNumPromocion() {
        return numPromocion;
    }


    /**
     * Sets the numPromocion value for this PromocionPorClienteDetalle.
     * 
     * @param numPromocion
     */
    public void setNumPromocion(int numPromocion) {
        this.numPromocion = numPromocion;
    }


    /**
     * Gets the numeroPromocion value for this PromocionPorClienteDetalle.
     * 
     * @return numeroPromocion
     */
    public int getNumeroPromocion() {
        return numeroPromocion;
    }


    /**
     * Sets the numeroPromocion value for this PromocionPorClienteDetalle.
     * 
     * @param numeroPromocion
     */
    public void setNumeroPromocion(int numeroPromocion) {
        this.numeroPromocion = numeroPromocion;
    }


    /**
     * Gets the producto value for this PromocionPorClienteDetalle.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this PromocionPorClienteDetalle.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }


    /**
     * Gets the productoPromocion value for this PromocionPorClienteDetalle.
     * 
     * @return productoPromocion
     */
    public java.lang.String getProductoPromocion() {
        return productoPromocion;
    }


    /**
     * Sets the productoPromocion value for this PromocionPorClienteDetalle.
     * 
     * @param productoPromocion
     */
    public void setProductoPromocion(java.lang.String productoPromocion) {
        this.productoPromocion = productoPromocion;
    }


    /**
     * Gets the rangoHasta value for this PromocionPorClienteDetalle.
     * 
     * @return rangoHasta
     */
    public int getRangoHasta() {
        return rangoHasta;
    }


    /**
     * Sets the rangoHasta value for this PromocionPorClienteDetalle.
     * 
     * @param rangoHasta
     */
    public void setRangoHasta(int rangoHasta) {
        this.rangoHasta = rangoHasta;
    }


    /**
     * Gets the secuencia value for this PromocionPorClienteDetalle.
     * 
     * @return secuencia
     */
    public int getSecuencia() {
        return secuencia;
    }


    /**
     * Sets the secuencia value for this PromocionPorClienteDetalle.
     * 
     * @param secuencia
     */
    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }


    /**
     * Gets the unidad value for this PromocionPorClienteDetalle.
     * 
     * @return unidad
     */
    public int getUnidad() {
        return unidad;
    }


    /**
     * Sets the unidad value for this PromocionPorClienteDetalle.
     * 
     * @param unidad
     */
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromocionPorClienteDetalle)) return false;
        PromocionPorClienteDetalle other = (PromocionPorClienteDetalle) obj;
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
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.formaPago==null && other.getFormaPago()==null) || 
             (this.formaPago!=null &&
              this.formaPago.equals(other.getFormaPago()))) &&
            this.numPromocion == other.getNumPromocion() &&
            this.numeroPromocion == other.getNumeroPromocion() &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto()))) &&
            ((this.productoPromocion==null && other.getProductoPromocion()==null) || 
             (this.productoPromocion!=null &&
              this.productoPromocion.equals(other.getProductoPromocion()))) &&
            this.rangoHasta == other.getRangoHasta() &&
            this.secuencia == other.getSecuencia() &&
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
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getFormaPago() != null) {
            _hashCode += getFormaPago().hashCode();
        }
        _hashCode += getNumPromocion();
        _hashCode += getNumeroPromocion();
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        if (getProductoPromocion() != null) {
            _hashCode += getProductoPromocion().hashCode();
        }
        _hashCode += getRangoHasta();
        _hashCode += getSecuencia();
        _hashCode += getUnidad();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromocionPorClienteDetalle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "PromocionPorClienteDetalle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadPromocion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "cantidadPromocion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "formaPago"));
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
        elemField.setFieldName("numeroPromocion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "numeroPromocion"));
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
