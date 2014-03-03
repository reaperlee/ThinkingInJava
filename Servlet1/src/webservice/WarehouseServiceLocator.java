/**
 * WarehouseServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class WarehouseServiceLocator extends org.apache.axis.client.Service implements webservice.WarehouseService {

    public WarehouseServiceLocator() {
    }


    public WarehouseServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WarehouseServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Warehouse
    private java.lang.String Warehouse_address = "http://localhost:8080/TestWebService/services/Warehouse";

    public java.lang.String getWarehouseAddress() {
        return Warehouse_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WarehouseWSDDServiceName = "Warehouse";

    public java.lang.String getWarehouseWSDDServiceName() {
        return WarehouseWSDDServiceName;
    }

    public void setWarehouseWSDDServiceName(java.lang.String name) {
        WarehouseWSDDServiceName = name;
    }

    public webservice.Warehouse getWarehouse() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Warehouse_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWarehouse(endpoint);
    }

    public webservice.Warehouse getWarehouse(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.WarehouseSoapBindingStub _stub = new webservice.WarehouseSoapBindingStub(portAddress, this);
            _stub.setPortName(getWarehouseWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWarehouseEndpointAddress(java.lang.String address) {
        Warehouse_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservice.Warehouse.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.WarehouseSoapBindingStub _stub = new webservice.WarehouseSoapBindingStub(new java.net.URL(Warehouse_address), this);
                _stub.setPortName(getWarehouseWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Warehouse".equals(inputPortName)) {
            return getWarehouse();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice", "WarehouseService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice", "Warehouse"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Warehouse".equals(portName)) {
            setWarehouseEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
