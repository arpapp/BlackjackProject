package com.skilldistillery.blackjack;

import com.skilldistillery.cards.Card;

public class BlackjackApp {
	
	BlackjackDealer dealer = new BlackjackDealer();
	BlackjackPlayer player = new BlackjackPlayer();

	public static void main(String[] args) {
		BlackjackApp appy = new BlackjackApp();
		appy.run();
	}
	
	public void run() {
		System.out.println("\"Welcome to the Salty Spitoon. You here to play Blackjack?\"");
		System.out.println();
		System.out.println("You nod and feel resilient, assured by the fact that you stubbed "
				+ "your toe last week while watering your spice garden\n and only cried for twenty mintues.\n");
		System.out.println("The dealer gestures for you to sit down and begins shuffling the deck.");
		dealer.shuffle();
		System.out.println("He deals two cards to you.");
		
		
		Card card = dealer.getCard();
		player.addToHand(card);
		
		Card card2 = dealer.getCard();
		player.addToHand(card2);
		
		System.out.println("You glance at your cards.");
		System.out.println("You have a(n) " + card + " and a(n) " + card2 + ".");
		
	}

}
