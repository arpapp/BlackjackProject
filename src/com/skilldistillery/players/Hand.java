package com.skilldistillery.players;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.Card;

public abstract class Hand {

	protected List<Card> cards = new ArrayList<>();
	
	public Hand () {
		//default constructor
	}
	
	public void addCard (Card card) {
		cards.add(card);
	}
	
	public void clear() {
		//idk what this is supposed to do
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}

	
	
	
	
}
