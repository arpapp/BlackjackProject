package com.skilldistillery.blackjack;

import com.skilldistillery.players.Hand;

public class BlackjackHand extends Hand {

	@Override
	public int getHandValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean isBlackjack() {
		int hand = getHandValue();
		if (hand == 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBust() {
		int hand = getHandValue();
		if (hand > 21) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

}
