package com.citi.membership.card.exception;

import lombok.Data;

@Data
public class CardDetailsReqValidationExcep extends Exception{
	
	private String errorMsg; 
	
	public CardDetailsReqValidationExcep(String errorMsg) {
		
		this.errorMsg = errorMsg;
	}

}
