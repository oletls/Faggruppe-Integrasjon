package com.embriq.webservice.enricher;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

public class DataEnricherLetterServiceImpl implements DataEnricherLetterService {

	@Override
	@WebResult(name = "SendLetterResponse", targetNamespace = "http://embriq.no/enterprise/dataenricherletterservice/sendletter_v1", partName = "OutputParameters")
	@WebMethod(operationName = "SendLetter", action = "SendLetter")
	public SendLetterResponse sendLetter(
			@WebParam(partName = "InputParameters", name = "SendLetterRequest", targetNamespace = "http://embriq.no/enterprise/dataenricherletterservice/sendletter_v1") SendLetterRequest inputParameters)
			throws Bug_Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
