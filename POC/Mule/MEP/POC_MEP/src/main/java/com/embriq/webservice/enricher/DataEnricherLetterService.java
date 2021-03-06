package com.embriq.webservice.enricher;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-08-29T15:04:43.749+02:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://embriq.no/enterprise/dataenricherletterservice_v1", name = "DataEnricherLetterService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DataEnricherLetterService {

    @WebResult(name = "SendLetterResponse", targetNamespace = "http://embriq.no/enterprise/dataenricherletterservice/sendletter_v1", partName = "OutputParameters")
    @WebMethod(operationName = "SendLetter", action = "SendLetter")
    public SendLetterResponse sendLetter(
        @WebParam(partName = "InputParameters", name = "SendLetterRequest", targetNamespace = "http://embriq.no/enterprise/dataenricherletterservice/sendletter_v1")
        SendLetterRequest inputParameters
    ) throws Bug_Exception;
}
