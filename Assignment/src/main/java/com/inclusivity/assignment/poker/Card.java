/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

// TODO: Auto-generated Javadoc
/**
 * The Class Card.
 */
public class Card {

	/** The value. */
	private int value;
	
	/** The suit. */
	private String suit;

	/**
	 * The Constructor for Card. Value (v) is a number from 2-10, J, Q, K, A or JKR.
	 * Suit (s) are H for hearts, S for spades, C for clubs, or D diamonds.
	 *
	 * @param v the v
	 * @param s the s
	 */
	public Card(String v, String s) {
		if (v.equals("2") || v.equals("3") || v.equals("4") || v.equals("5") || v.equals("6") || v.equals("7")
				|| v.equals("8") || v.equals("9") || v.equals("10") || v.equals("11") || v.equals("12")
				|| v.equals("13") || v.equals("14")) {
			this.value = Integer.parseInt(v);
		} else {
			if (v.equalsIgnoreCase("J")) {
				this.value = 11;
			} else if (v.equalsIgnoreCase("Q")) {
				this.value = 12;
			} else if (v.equalsIgnoreCase("K")) {
				this.value = 13;
			} else if (v.equalsIgnoreCase("A")) {
				this.value = 14;
			}else if (v.equalsIgnoreCase("JKR")) {
				this.value = 15;
			}
		}

		suit = s;
	}

	/**
	 * Get the value of the card (2-10, J, Q, K, A,JKR).
	 * 
	 * @return The value.
	 */
	public String value() {
		String result = "";

		// If a number card.
		if (value >= 2 && value <= 10) {
			result = Integer.toString(value);
		}

		// If a face card.
		else if (value >= 11 && value <= 14) {
			if (value == 11) {
				result = "J";
			} else if (value == 12) {
				result = "Q";
			} else if (value == 13) {
				result = "K";
			} else if (value == 14) {
				result = "A";
			} else if (value == 15) {
				result = "JKR";
			} else {
				result = "NA";
			}
		}

		return result;
	}

	/**
	 * Get the raw numerical value of the value.
	 * 
	 * @return The value in numerical form (2-10, jack is 11, queen is 12, king
	 *         is 13, ace is 14,JKR is 0).
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Gets the suit.
	 *
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * Sets the suit.
	 *
	 * @param suit the new suit
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	 * Check if two cards are equal.
	 * 
	 * @param c
	 *            Another card.
	 * @return A boolean value.
	 */
	public boolean equals(Card c) {
		boolean result = false;

		if (this.getValue() == c.getValue()) {
			result = true;
		}

		return result;
	}

	/**
	 * Compare two cards.
	 * 
	 * @param c
	 *            Another card.
	 * @return An integer. If 0, then they are equal, -1 if the current card
	 *         (the one calling the method) is weaker than the other, and 1 if
	 *         the card calling the method is better.
	 */
	public int compareTo(Card c) {
		int result = 0;

		if (this.getValue() > c.getValue()) {
			result = 1;
		} else if (c.getValue() > this.getValue()) {
			result = -1;
		} else {
			// Let it be.
		}

		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [value=" + value() + ", suit=" + suit + "]";
	}

}
