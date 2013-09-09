package com.embriq.components.posten;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.embriq.webservice.posten.GetPostalPlaceByPostalCodeRequest;
import com.embriq.webservice.posten.GetPostalPlaceByPostalCodeResponse;
import com.embriq.webservice.posten.LetterService;
import com.embriq.webservice.posten.LetterService_Service;

public class PostalServiceComponent  implements Callable  {


	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		LetterService_Service service = new LetterService_Service();
		LetterService port = service.getLetterService();

		GetPostalPlaceByPostalCodeRequest postalRequest = new GetPostalPlaceByPostalCodeRequest();
		postalRequest.setPostalCode("0191");
		GetPostalPlaceByPostalCodeResponse postalResponse = port
				.getPostalPlaceByPostalCode(postalRequest);

		System.out.println("Stedet er " + postalResponse.getPostalPlace());

		return postalResponse;
	}

}
