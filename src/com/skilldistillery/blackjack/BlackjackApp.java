package com.skilldistillery.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.Card;

public class BlackjackApp {
	Scanner kb = new Scanner(System.in);
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
		System.out.println();
		System.out.println("You sponge sweat off your brow. The dealer sees this but says nothing.");
		System.out.println("The dealer starts talking about how he had nails for breakfast.");
		System.out.println("You can barely pay attention to his story as he deals two cards to himself.");
		
		Card card3 = dealer.getCard();
		dealer.addToHand(card3);
		Card card4 = dealer.getCard();
		dealer.addToHand(card4);
		
		System.out.println("The dealer has one card showing. It's a(n) " + card3 + ".");
		System.out.println();
		System.out.println("You are brought back to reality when you realize the dealer is looking at you expectantly.");
		System.out.println("\"What was that? S-sorry,\" you say,\"... I had one too many Kelp shakes.\"");
		System.out.println("You cringe internally at your feeble attempt at humor.");
		System.out.println("A muscle in the dealer's neck twitches.");
		System.out.println("\"I said, \'Do you wanna hit or stay?\'\"");
		System.out.println("\"O-Oh! Uhhhhh......\"");
		System.out.println();
		menu(card, card2);
		
	}
	
	public void menu(Card card, Card card2) {
		System.out.println("So, would you like to 1. HIT or 2. STAY?");
		System.out.print("\"1\" for hit, \"2\" for stay: ");
		int choice = kb.nextInt();
		
		do {
			if (choice == 1) {
				System.out.println("The dealer turns over the top card and places it in your hand.");
				Card hitCard = dealer.getCard();
				player.addToHand(hitCard);
				System.out.println("It's a(n) " + hitCard + ".");
				
				boolean bust = player.checkHandBust();
				boolean blackjack = player.checkHandBlackjack();
				if (bust == true) {
					System.out.println("\"BARNACLES,\" you yell. \" I've bust! No new jellyfishing net for me!\"" );
					System.out.println("GAME OVER");
					break;
				}
				else if (blackjack == true) {
					System.out.println("You look down at your cards and can hardly believe it.");
					System.out.println("\"JUMPIN' JELLYFISH! I GOT A BLACKJACK! PACK YOUR BAGS GARY, WE'RE GOING ON VACATION!\"");
					System.out.println("CONGRATULATIONS, YOU WIN!");
				}
				else {
				System.out.print("1. Hit or 2. Stay:  ");
				choice = kb.nextInt();
				}
			}
			else {
				System.out.print("Invalid selection. Please type \"1\" for hit or \"2\" for stay: ");
				choice = kb.nextInt();
			}
		}while(choice != 2);
		System.out.println("The dealer nods and flips over his second card.");
		
		
		
	}
}

//		boolean menuChecker = true;
//		while(menuChecker) {
//			switch(choice){
//				case 1:
//					System.out.println("The dealer turns over the top card and places it in your hand.");
//					Card hitCard = dealer.getCard();
//					player.addToHand(hitCard);
//					System.out.println("It's a(n) " + hitCard + ".");
//					
//					boolean bust = player.checkHandBust();
//					boolean blackjack = player.checkHandBlackjack();
//					if (bust == true) {
//						System.out.println("\"BARNACLES,\" you yell. \" I've bust! No new jellyfishing net for me!\"" );
//						System.out.println("GAME OVER");
//						menuChecker = false;
//					}
//					else if (blackjack == true) {
//						System.out.println("You look down at your cards and can hardly believe it.");
//						System.out.println("\"JUMPIN' JELLYFISH! I GOT A BLACKJACK! PACK YOUR BAGS GARY, WE'RE GOING ON VACATION!\"");
//						System.out.println("CONGRATULATIONS, YOU WIN!");
//						menuChecker = false;
//					}
//					
//					
//			}
//		}