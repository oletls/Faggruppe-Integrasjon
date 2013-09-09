package com.embriq.webservice.enricher;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-08-29T15:04:43.755+02:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "DataEnricherLetterService", 
                  wsdlLocation = "file:/C:/Users/Ole/MuleStudio/workspace/webservice/src/main/resources/DataEnricherLetterService.wsdl",
                  targetNamespace = "http://embriq.no/enterprise/dataenricherletterservice_v1") 
public class DataEnricherLetterService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://embriq.no/enterprise/dataenricherletterservice_v1", "DataEnricherLetterService");
    public final static QName DataEnricherLetterService = new QName("http://embriq.no/enterprise/dataenricherletterservice_v1", "DataEnricherLetterService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Ole/MuleStudio/workspace/webservice/src/main/resources/DataEnricherLetterService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DataEnricherLetterService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Ole/MuleStudio/workspace/webservice/src/main/resources/DataEnricherLetterService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DataEnricherLetterService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DataEnricherLetterService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DataEnricherLetterService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DataEnricherLetterService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DataEnricherLetterService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DataEnricherLetterService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns DataEnricherLetterService
     */
    @WebEndpoint(name = "DataEnricherLetterService")
    public DataEnricherLetterService getDataEnricherLetterService() {
        return super.getPort(DataEnricherLetterService, DataEnricherLetterService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataEnricherLetterService
     */
    @WebEndpoint(name = "DataEnricherLetterService")
    public DataEnricherLetterService getDataEnricherLetterService(WebServiceFeature... features) {
        return super.getPort(DataEnricherLetterService, DataEnricherLetterService.class, features);
    }

}
