package com.skilldistillery.blackjack;

import com.skilldistillery.cards.Card;
import com.skilldistillery.players.Hand;

public class BlackjackPlayer {
	
	private Hand playerHand = new BlackjackHand ();
	
	public void addToHand(Card card) {
		playerHand.addCard(card);
	}

}
