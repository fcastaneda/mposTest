/**
 * Precio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ancernet.franquicias;

public class Precio  implements java.io.Serializable {
    private java.lang.String cliente;

    private int codigoDesde;

    private int codigoHasta;

    private double precioVenta;

    private java.lang.String producto;

    private int tipoCliente;

    private java.lang.String tipoLista;

    public Precio() {
    }

    public Precio(
           java.lang.String cliente,
           int codigoDesde,
           int codigoHasta,
           double precioVenta,
           java.lang.String producto,
           int tipoCliente,
           java.lang.String tipoLista) {
           this.cliente = cliente;
           this.codigoDesde = codigoDesde;
           this.codigoHasta = codigoHasta;
           this.precioVenta = precioVenta;
           this.producto = producto;
           this.tipoCliente = tipoCliente;
           this.tipoLista = tipoLista;
    }


    /**
     * Gets the cliente value for this Precio.
     * 
     * @return cliente
     */
    public java.lang.String getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this Precio.
     * 
     * @param cliente
     */
    public void setCliente(java.lang.String cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the codigoDesde value for this Precio.
     * 
     * @return codigoDesde
     */
    public int getCodigoDesde() {
        return codigoDesde;
    }


    /**
     * Sets the codigoDesde value for this Precio.
     * 
     * @param codigoDesde
     */
    public void setCodigoDesde(int codigoDesde) {
        this.codigoDesde = codigoDesde;
    }


    /**
     * Gets the codigoHasta value for this Precio.
     * 
     * @return codigoHasta
     */
    public int getCodigoHasta() {
        return codigoHasta;
    }


    /**
     * Sets the codigoHasta value for this Precio.
     * 
     * @param codigoHasta
     */
    public void setCodigoHasta(int codigoHasta) {
        this.codigoHasta = codigoHasta;
    }


    /**
     * Gets the precioVenta value for this Precio.
     * 
     * @return precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }


    /**
     * Sets the precioVenta value for this Precio.
     * 
     * @param precioVenta
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }


    /**
     * Gets the producto value for this Precio.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this Precio.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }


    /**
     * Gets the tipoCliente value for this Precio.
     * 
     * @return tipoCliente
     */
    public int getTipoCliente() {
        return tipoCliente;
    }


    /**
     * Sets the tipoCliente value for this Precio.
     * 
     * @param tipoCliente
     */
    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    /**
     * Gets the tipoLista value for this Precio.
     * 
     * @return tipoLista
     */
    public java.lang.String getTipoLista() {
        return tipoLista;
    }


    /**
     * Sets the tipoLista value for this Precio.
     * 
     * @param tipoLista
     */
    public void setTipoLista(java.lang.String tipoLista) {
        this.tipoLista = tipoLista;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Precio)) return false;
        Precio other = (Precio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            this.codigoDesde == other.getCodigoDesde() &&
            this.codigoHasta == other.getCodigoHasta() &&
            this.precioVenta == other.getPrecioVenta() &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto()))) &&
            this.tipoCliente == other.getTipoCliente() &&
            ((this.tipoLista==null && other.getTipoLista()==null) || 
             (this.tipoLista!=null &&
              this.tipoLista.equals(other.getTipoLista())));
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
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        _hashCode += getCodigoDesde();
        _hashCode += getCodigoHasta();
        _hashCode += new Double(getPrecioVenta()).hashCode();
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        _hashCode += getTipoCliente();
        if (getTipoLista() != null) {
            _hashCode += getTipoLista().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Precio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "Precio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoDesde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "codigoDesde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoHasta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "codigoHasta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precioVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "precioVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoLista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "tipoLista"));
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
