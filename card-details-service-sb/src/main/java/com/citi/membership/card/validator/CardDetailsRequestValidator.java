package com.citi.membership.card.validator;

import com.citi.membership.card.exception.CardDetailsReqValidationExcep;

public class CardDetailsRequestValidator {
	
	
	
	public void validateRequest(String cardNum) throws CardDetailsReqValidationExcep {
		
		
		if( null == cardNum && cardNum.length() != 15 ) {
			
			throw new CardDetailsReqValidationExcep("invalid cardnumer");
		}
		
	}

}
