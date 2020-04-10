package com.skilldistillery.players;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.Card;

public abstract class Hand {

	protected List<Card> cards = new ArrayList<>();
	
	public Hand () {
		//default constructor
	}
	
	public void addCard (card Card) {
		//take a card from the deck and add to hand
		//lol whut
	}
	
	public void clear() {
		//idk what this is supposed to do
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [card=" + card + "]";
	}
	
	
	
}
