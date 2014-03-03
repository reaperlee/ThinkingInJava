package webservice;

public class WarehouseProxy implements webservice.Warehouse {
  private String _endpoint = null;
  private webservice.Warehouse warehouse = null;
  
  public WarehouseProxy() {
    _initWarehouseProxy();
  }
  
  public WarehouseProxy(String endpoint) {
    _endpoint = endpoint;
    _initWarehouseProxy();
  }
  
  private void _initWarehouseProxy() {
    try {
      warehouse = (new webservice.WarehouseServiceLocator()).getWarehouse();
      if (warehouse != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)warehouse)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)warehouse)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (warehouse != null)
      ((javax.xml.rpc.Stub)warehouse)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.Warehouse getWarehouse() {
    if (warehouse == null)
      _initWarehouseProxy();
    return warehouse;
  }
  
  public double getPrice(java.lang.String description) throws java.rmi.RemoteException{
    if (warehouse == null)
      _initWarehouseProxy();
    return warehouse.getPrice(description);
  }
  
  
}