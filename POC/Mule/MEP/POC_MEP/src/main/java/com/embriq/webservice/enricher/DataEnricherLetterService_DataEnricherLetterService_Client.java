
package com.embriq.webservice.enricher;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-08-29T15:04:43.736+02:00
 * Generated source version: 2.5.1
 * 
 */
public final class DataEnricherLetterService_DataEnricherLetterService_Client {

    private static final QName SERVICE_NAME = new QName("http://embriq.no/enterprise/dataenricherletterservice_v1", "DataEnricherLetterService");

    private DataEnricherLetterService_DataEnricherLetterService_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DataEnricherLetterService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DataEnricherLetterService_Service ss = new DataEnricherLetterService_Service(wsdlURL, SERVICE_NAME);
        DataEnricherLetterService port = ss.getDataEnricherLetterService();  
        
        {
        System.out.println("Invoking sendLetter...");
        com.embriq.webservice.enricher.SendLetterRequest _sendLetter_inputParameters = null;
        try {
            com.embriq.webservice.enricher.SendLetterResponse _sendLetter__return = port.sendLetter(_sendLetter_inputParameters);
            System.out.println("sendLetter.result=" + _sendLetter__return);

        } catch (Bug_Exception e) { 
            System.out.println("Expected exception: Bug has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}