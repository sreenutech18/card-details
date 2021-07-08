package com.citi.membership.card.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;
import com.citi.membership.card.respository.CardsRepository;

@Component
public class CardDetailsServiceImpl implements CardDetailsService {

	@Autowired
	CardsRepository cardsRepository;
	
	
	@Override
	@Cacheable(value= "cardsCache", unless= "#result.size() == 0")
	public CardDetailsResponse getCards(String cardNum) {
		
		CardDetailsResponse  cardDetailsResponse = cardsRepository.findOne(cardNum);
		
		return cardDetailsResponse;
	}

	@Override
	@Cacheable(value= "cardsCache", key= "#cardNum")
	public CardDetailsResponse getCardDetails(String cardNum) {
		
		CardDetailsResponse cardDetailsResponse = cardsRepository.findOne(cardNum);
		
		return cardDetailsResponse;
	}

	@Override
	public CardDetailsResponse getAllCardDetails(CardDetailsRequest cardDetailsRequest) {

		// 1. Get the request from controller
		// 2. prepare the dao request
		// 3. call dao and get the response
		// 4. if the response is success then prepare the service response else throw
		// the exception to controller
		// 5. return service response
		return null;
	}

}
