/**
 * WSDeleteRoutingOrderV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package urn_com_amalto_xtentis_webservice;

public class WSDeleteRoutingOrderV2  implements java.io.Serializable {
    private urn_com_amalto_xtentis_webservice.WSRoutingOrderV2PK wsRoutingOrderPK;

    public WSDeleteRoutingOrderV2() {
    }

    public WSDeleteRoutingOrderV2(
           urn_com_amalto_xtentis_webservice.WSRoutingOrderV2PK wsRoutingOrderPK) {
           this.wsRoutingOrderPK = wsRoutingOrderPK;
    }


    /**
     * Gets the wsRoutingOrderPK value for this WSDeleteRoutingOrderV2.
     * 
     * @return wsRoutingOrderPK
     */
    public urn_com_amalto_xtentis_webservice.WSRoutingOrderV2PK getWsRoutingOrderPK() {
        return wsRoutingOrderPK;
    }


    /**
     * Sets the wsRoutingOrderPK value for this WSDeleteRoutingOrderV2.
     * 
     * @param wsRoutingOrderPK
     */
    public void setWsRoutingOrderPK(urn_com_amalto_xtentis_webservice.WSRoutingOrderV2PK wsRoutingOrderPK) {
        this.wsRoutingOrderPK = wsRoutingOrderPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDeleteRoutingOrderV2)) return false;
        WSDeleteRoutingOrderV2 other = (WSDeleteRoutingOrderV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsRoutingOrderPK==null && other.getWsRoutingOrderPK()==null) || 
             (this.wsRoutingOrderPK!=null &&
              this.wsRoutingOrderPK.equals(other.getWsRoutingOrderPK())));
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
        if (getWsRoutingOrderPK() != null) {
            _hashCode += getWsRoutingOrderPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDeleteRoutingOrderV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRoutingOrderV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsRoutingOrderPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsRoutingOrderPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK"));
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
