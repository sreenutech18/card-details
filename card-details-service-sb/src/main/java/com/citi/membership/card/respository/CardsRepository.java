package com.citi.membership.card.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citi.membership.card.model.CardDetailsResponse;

public interface CardsRepository extends JpaRepository<CardDetailsResponse, String>{
	
	

}
