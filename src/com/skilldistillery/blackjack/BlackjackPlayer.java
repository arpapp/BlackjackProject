package com.skilldistillery.blackjack;

import com.skilldistillery.cards.Card;
import com.skilldistillery.players.Hand;

public class BlackjackPlayer {
	
	private Hand playerHand = new BlackjackHand ();
	
	public void addToHand(Card card) {
		playerHand.addCard(card);
	}

	public int getHandValue() {
		return playerHand.getHandValue();
	}
	
	public boolean checkHandBust() {
		int total = getHandValue();
		return ((BlackjackHand) playerHand).isBust(total);
	}
	public boolean checkHandBlackjack() {
		int total = getHandValue();
		return ((BlackjackHand) playerHand).isBlackjack(total);
	}
}
