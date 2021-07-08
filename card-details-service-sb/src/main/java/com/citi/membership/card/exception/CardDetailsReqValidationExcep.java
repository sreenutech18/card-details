package com.citi.membership.card.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CardDetailsReqValidationExcep extends Exception{
	
	private String errorMsg; 
	
	public CardDetailsReqValidationExcep(String errorMsg) {
		
		this.errorMsg = errorMsg;
	}

}
