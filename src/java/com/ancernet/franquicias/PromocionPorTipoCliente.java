/**
 * PromocionPorTipoCliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ancernet.franquicias;

public class PromocionPorTipoCliente  implements java.io.Serializable {
    private java.lang.String descripcion;

    private java.util.Calendar fechaDesde;

    private java.util.Calendar fechaHasta;

    private int numPromocion;

    private java.lang.String producto;

    private java.lang.String tipoCliente;

    public PromocionPorTipoCliente() {
    }

    public PromocionPorTipoCliente(
           java.lang.String descripcion,
           java.util.Calendar fechaDesde,
           java.util.Calendar fechaHasta,
           int numPromocion,
           java.lang.String producto,
           java.lang.String tipoCliente) {
           this.descripcion = descripcion;
           this.fechaDesde = fechaDesde;
           this.fechaHasta = fechaHasta;
           this.numPromocion = numPromocion;
           this.producto = producto;
           this.tipoCliente = tipoCliente;
    }


    /**
     * Gets the descripcion value for this PromocionPorTipoCliente.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this PromocionPorTipoCliente.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the fechaDesde value for this PromocionPorTipoCliente.
     * 
     * @return fechaDesde
     */
    public java.util.Calendar getFechaDesde() {
        return fechaDesde;
    }


    /**
     * Sets the fechaDesde value for this PromocionPorTipoCliente.
     * 
     * @param fechaDesde
     */
    public void setFechaDesde(java.util.Calendar fechaDesde) {
        this.fechaDesde = fechaDesde;
    }


    /**
     * Gets the fechaHasta value for this PromocionPorTipoCliente.
     * 
     * @return fechaHasta
     */
    public java.util.Calendar getFechaHasta() {
        return fechaHasta;
    }


    /**
     * Sets the fechaHasta value for this PromocionPorTipoCliente.
     * 
     * @param fechaHasta
     */
    public void setFechaHasta(java.util.Calendar fechaHasta) {
        this.fechaHasta = fechaHasta;
    }


    /**
     * Gets the numPromocion value for this PromocionPorTipoCliente.
     * 
     * @return numPromocion
     */
    public int getNumPromocion() {
        return numPromocion;
    }


    /**
     * Sets the numPromocion value for this PromocionPorTipoCliente.
     * 
     * @param numPromocion
     */
    public void setNumPromocion(int numPromocion) {
        this.numPromocion = numPromocion;
    }


    /**
     * Gets the producto value for this PromocionPorTipoCliente.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this PromocionPorTipoCliente.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }


    /**
     * Gets the tipoCliente value for this PromocionPorTipoCliente.
     * 
     * @return tipoCliente
     */
    public java.lang.String getTipoCliente() {
        return tipoCliente;
    }


    /**
     * Sets the tipoCliente value for this PromocionPorTipoCliente.
     * 
     * @param tipoCliente
     */
    public void setTipoCliente(java.lang.String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromocionPorTipoCliente)) return false;
        PromocionPorTipoCliente other = (PromocionPorTipoCliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.fechaDesde==null && other.getFechaDesde()==null) || 
             (this.fechaDesde!=null &&
              this.fechaDesde.equals(other.getFechaDesde()))) &&
            ((this.fechaHasta==null && other.getFechaHasta()==null) || 
             (this.fechaHasta!=null &&
              this.fechaHasta.equals(other.getFechaHasta()))) &&
            this.numPromocion == other.getNumPromocion() &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto()))) &&
            ((this.tipoCliente==null && other.getTipoCliente()==null) || 
             (this.tipoCliente!=null &&
              this.tipoCliente.equals(other.getTipoCliente())));
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
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getFechaDesde() != null) {
            _hashCode += getFechaDesde().hashCode();
        }
        if (getFechaHasta() != null) {
            _hashCode += getFechaHasta().hashCode();
        }
        _hashCode += getNumPromocion();
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        if (getTipoCliente() != null) {
            _hashCode += getTipoCliente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromocionPorTipoCliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "PromocionPorTipoCliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "fechaDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "fechaHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("tipoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "tipoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
