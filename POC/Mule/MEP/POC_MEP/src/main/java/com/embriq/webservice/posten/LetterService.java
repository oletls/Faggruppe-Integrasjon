package com.embriq.webservice.posten;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-09-02T21:20:55.307+02:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://posten.no/enterprise/letterservice_v1", name = "LetterService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LetterService {

    @WebResult(name = "GetPostalPlaceByPostalCodeResponse", targetNamespace = "http://posten.no/enterprise/letterservice/getpostalplacebypostalcode_v1", partName = "OutputParameters")
    @WebMethod(operationName = "GetPostalPlaceByPostalCode", action = "GetPostalPlaceByPostalCode")
    public GetPostalPlaceByPostalCodeResponse getPostalPlaceByPostalCode(
        @WebParam(partName = "InputParameters", name = "GetPostalPlaceByPostalCodeRequest", targetNamespace = "http://posten.no/enterprise/letterservice/getpostalplacebypostalcode_v1")
        GetPostalPlaceByPostalCodeRequest inputParameters
    ) throws Bug_Exception;

    @WebResult(name = "SendLetterResponse", targetNamespace = "http://posten.no/enterprise/letterservice/sendletter_v1", partName = "OutputParameters")
    @WebMethod(operationName = "SendLetter", action = "SendLetter")
    public SendLetterResponse sendLetter(
        @WebParam(partName = "InputParameters", name = "SendLetterRequest", targetNamespace = "http://posten.no/enterprise/letterservice/sendletter_v1")
        SendLetterRequest inputParameters
    ) throws Bug_Exception;
}
