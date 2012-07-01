
/*
 * 
 */

package com.mulesoft.wcfconsumer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.1.3
 * Sat Jun 30 22:59:12 BRT 2012
 * Generated source version: 2.1.3
 * 
 */


@WebServiceClient(name = "WCFRetailService", 
                  wsdlLocation = "http://localhost:49676/WCFRetailService.svc?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class WCFRetailService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://tempuri.org/", "WCFRetailService");
    public final static QName BasicHttpBindingIWCFRetailService = new QName("http://tempuri.org/", "BasicHttpBinding_IWCFRetailService");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:49676/WCFRetailService.svc?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:49676/WCFRetailService.svc?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public WCFRetailService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WCFRetailService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WCFRetailService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns IWCFRetailService
     */
    @WebEndpoint(name = "BasicHttpBinding_IWCFRetailService")
    public IWCFRetailService getBasicHttpBindingIWCFRetailService() {
        return super.getPort(BasicHttpBindingIWCFRetailService, IWCFRetailService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWCFRetailService
     */
    @WebEndpoint(name = "BasicHttpBinding_IWCFRetailService")
    public IWCFRetailService getBasicHttpBindingIWCFRetailService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIWCFRetailService, IWCFRetailService.class, features);
    }

}
