/**
 * Existencia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ancernet.franquicias;

public class Existencia  implements java.io.Serializable {
    private java.lang.String bodega;

    private java.lang.String codBodega;

    private java.lang.String codProducto;

    private double existencia;

    private java.lang.String producto;

    public Existencia() {
    }

    public Existencia(
           java.lang.String bodega,
           java.lang.String codBodega,
           java.lang.String codProducto,
           double existencia,
           java.lang.String producto) {
           this.bodega = bodega;
           this.codBodega = codBodega;
           this.codProducto = codProducto;
           this.existencia = existencia;
           this.producto = producto;
    }


    /**
     * Gets the bodega value for this Existencia.
     * 
     * @return bodega
     */
    public java.lang.String getBodega() {
        return bodega;
    }


    /**
     * Sets the bodega value for this Existencia.
     * 
     * @param bodega
     */
    public void setBodega(java.lang.String bodega) {
        this.bodega = bodega;
    }


    /**
     * Gets the codBodega value for this Existencia.
     * 
     * @return codBodega
     */
    public java.lang.String getCodBodega() {
        return codBodega;
    }


    /**
     * Sets the codBodega value for this Existencia.
     * 
     * @param codBodega
     */
    public void setCodBodega(java.lang.String codBodega) {
        this.codBodega = codBodega;
    }


    /**
     * Gets the codProducto value for this Existencia.
     * 
     * @return codProducto
     */
    public java.lang.String getCodProducto() {
        return codProducto;
    }


    /**
     * Sets the codProducto value for this Existencia.
     * 
     * @param codProducto
     */
    public void setCodProducto(java.lang.String codProducto) {
        this.codProducto = codProducto;
    }


    /**
     * Gets the existencia value for this Existencia.
     * 
     * @return existencia
     */
    public double getExistencia() {
        return existencia;
    }


    /**
     * Sets the existencia value for this Existencia.
     * 
     * @param existencia
     */
    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }


    /**
     * Gets the producto value for this Existencia.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this Existencia.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Existencia)) return false;
        Existencia other = (Existencia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bodega==null && other.getBodega()==null) || 
             (this.bodega!=null &&
              this.bodega.equals(other.getBodega()))) &&
            ((this.codBodega==null && other.getCodBodega()==null) || 
             (this.codBodega!=null &&
              this.codBodega.equals(other.getCodBodega()))) &&
            ((this.codProducto==null && other.getCodProducto()==null) || 
             (this.codProducto!=null &&
              this.codProducto.equals(other.getCodProducto()))) &&
            this.existencia == other.getExistencia() &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto())));
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
        if (getBodega() != null) {
            _hashCode += getBodega().hashCode();
        }
        if (getCodBodega() != null) {
            _hashCode += getCodBodega().hashCode();
        }
        if (getCodProducto() != null) {
            _hashCode += getCodProducto().hashCode();
        }
        _hashCode += new Double(getExistencia()).hashCode();
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Existencia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "Existencia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "bodega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codBodega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "codBodega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "codProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "existencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://franquicias.ancernet.com", "producto"));
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
