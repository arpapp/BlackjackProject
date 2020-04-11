package com.skilldistillery.blackjack;

import com.skilldistillery.players.Hand;

public class BlackjackHand extends Hand {

	@Override
	public int getHandValue() {
		int totalHand = 0;
		for (int i = 0; i < cards.size(); i++) {
			totalHand = totalHand + cards.get(i).getRank().getValue();
		}
			return totalHand;
	}
	
	public boolean isBlackjack() {
//		int hand = getHandValue();
		if (hand == 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBust() {
//		int hand = getHandValue();
		if (hand > 21) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isPush() {
		return true;
	}
	
	

}
