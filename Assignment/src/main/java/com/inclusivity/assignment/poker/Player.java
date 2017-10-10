/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player implements Comparable<Player> {

	/** The name. */
	private String name;

	/** The hand. */
	private Hand hand;

	/**
	 * The default Player, Mathan Ramadurai.
	 */
	public Player() {
		name = "Mathan Ramadurai";
	}

	/**
	 * A Player with a name you choose.
	 *
	 * @param player
	 *            the player
	 */
	public Player(String player) {
		name = player;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Player other) {
		if (this == other) {
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 * Gets the hand.
	 *
	 * @return the hand
	 */
	public Hand getHand() {
		return hand;
	}

	/**
	 * Give hand.
	 *
	 * @param cards
	 *            the cards
	 */
	public void giveHand(ArrayList<Card> cards) {
		hand = new Hand(cards);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name + " has " + hand;
	}

	/**
	 * Adds the card to hand.
	 *
	 * @param card the card
	 */
	public void addCardToHand(Card card) {
		// placeholder for extension
	}
}