package com.citi.membership.card.service;

import java.util.List;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

public interface CardDetailsService {

	CardDetailsResponse getCards(String cardNum);

	CardDetailsResponse getCardDetails(String cardNum);

	CardDetailsResponse getAllCardDetails(CardDetailsRequest cardDetailsRequest);

}
