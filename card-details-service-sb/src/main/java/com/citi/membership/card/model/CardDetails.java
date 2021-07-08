package com.citi.membership.card.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(value=Include.NON_NULL)
public class CardDetails {
	
	private String cardNum;
	private boolean primary; 
	private String productType;
	private String status;
	private String fname;
	private String lname;
	private boolean pastDue;
	private String expDate;
	
	

}
