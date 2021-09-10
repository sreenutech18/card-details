package com.citi.membership.card.exception;

import lombok.Data;

@Data
public class CardDetailsReqValidationExcep extends Exception {
	
	private String respCode;
	private String respMsg; 
	
	public CardDetailsReqValidationExcep(String respCode, String respMsg) {
		
		this.respCode = respCode;
		this.respMsg  = respMsg;


	}

}
