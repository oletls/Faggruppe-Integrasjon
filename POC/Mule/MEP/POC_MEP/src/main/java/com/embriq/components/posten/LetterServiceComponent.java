package com.embriq.components.posten;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.embriq.webservice.posten.LetterService;
import com.embriq.webservice.posten.LetterService_Service;
import com.embriq.webservice.posten.SendLetterRequest;
import com.embriq.webservice.posten.SendLetterResponse;

public class LetterServiceComponent  implements Callable  {


	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		LetterService_Service service = new LetterService_Service();
		LetterService port = service.getLetterService();

		
		SendLetterRequest letterRequest = new SendLetterRequest();

		
		SendLetterResponse letterResponse =  port.sendLetter(letterRequest);
		
		eventContext.getMessage();

		return letterResponse;
	}

}
