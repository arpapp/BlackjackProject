package com.skilldistillery.blackjack;

import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;
import com.skilldistillery.players.Hand;

public class BlackjackDealer {
	
	private Deck deck = new Deck();
	private Hand dealerHand = new BlackjackHand();
	
	public void shuffle() {
		deck.shuffle();
	}
	
	public Card getCard() {
		Card card = deck.dealCard();
		return card;
	}


}
