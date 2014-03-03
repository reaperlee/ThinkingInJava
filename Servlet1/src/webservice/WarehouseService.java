/**
 * WarehouseService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface WarehouseService extends javax.xml.rpc.Service {
    public java.lang.String getWarehouseAddress();

    public webservice.Warehouse getWarehouse() throws javax.xml.rpc.ServiceException;

    public webservice.Warehouse getWarehouse(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
