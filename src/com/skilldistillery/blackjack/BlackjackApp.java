package com.skilldistillery.blackjack;

import com.skilldistillery.cards.Deck;

public class BlackjackApp {
	
	Deck deck = new Deck();

	public static void main(String[] args) {
		BlackjackApp appy = new BlackjackApp();
		appy.run();
	}
	
	public void run() {
		System.out.println("\"Welcome to the Salty Spitoon. You here to play Blackjack?\"");
		System.out.println();
		System.out.println("You nod and feel resilient, assured by the fact that you stubbed your toe last week while watering your spice garden\n and only cried for twenty mintues.\n");
		System.out.println("The dealer gestures for you to sit down and begins shuffling the deck.");
		deck.shuffle();
	}

}
