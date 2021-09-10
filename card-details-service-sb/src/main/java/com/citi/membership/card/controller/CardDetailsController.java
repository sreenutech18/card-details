package com.citi.membership.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;
import com.citi.membership.card.service.CardDetailsService;

@RestController
@RequestMapping(value = "/v1")
public class CardDetailsController {

	@Autowired
	CardDetailsService cardDetailsService;

	@RequestMapping(value = "/cards/{cardNum}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public CardDetailsResponse getCards(@PathVariable("cardNum") String cardNum,
			@RequestHeader(name = "clientId", required = true) String clientId,
			@RequestHeader(name = "requestId", required = true) String requestId,
			@RequestHeader(name = "msgTs", required = true) String msgTs) {

		CardDetailsResponse cardDetailsResponse = cardDetailsService.getCardDetails(cardNum);

		return cardDetailsResponse;

	}

	@RequestMapping(value = "/carddetails/{cardNum}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public CardDetailsResponse getCardDetails(@PathVariable("cardNum") String cardNum,
			@RequestHeader(name = "clientId", required = true) String clientId,
			@RequestHeader(name = "requestId", required = true) String requestId,
			@RequestHeader(name = "msgTs", required = true) String msgTs) {

		CardDetailsResponse cardDetailsResponse = cardDetailsService.getCardDetails(cardNum);

		return cardDetailsResponse;

	}

	@RequestMapping(value = "/allcards/{cardNum}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public CardDetailsResponse getAllCardDetails(@RequestBody CardDetailsRequest cardDetailsRequest,
			@RequestHeader(name = "clientId", required = true) String clientId,
			@RequestHeader(name = "requestId", required = true) String requestId,
			@RequestHeader(name = "msgTs", required = true) String msgTs) {

		CardDetailsResponse cardDetailsResponse = cardDetailsService.getAllCardDetails(cardDetailsRequest);

		return cardDetailsResponse;

	}

	

}
