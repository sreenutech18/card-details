package com.citi.membership.card.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CardDetailsControllerAdvice {
	
	
	@ExceptionHandler(value=BusinessException.class)
	public ResponseEntity handleException(BusinessException exception){
		
		 //todo : handle userdefined exception
	  	
	}
	
	
}
