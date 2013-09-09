package com.embriq.components.posten;

import com.embriq.pojo.Letter;

public class Clasher {

	public  Letter clash(String originalPayload,  String postalPayload ) {
	
		System.out.println("ORIGINAL: " + originalPayload);
		System.out.println("POSTAL: " + postalPayload);
		Letter letter = new Letter();
		
		return letter;
	}
}
