/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inclusivity.assignment.poker.Card;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCard.
 */
public class TestCard {

	/**
	 * Test non-integer value of face card.
	 */
	@Test
	public void testValue() {
		Card c1 = new Card("J", "H");
		assertEquals("J", c1.value());
	}

	/**
	 * Test integer value of face card.
	 */
	@Test
	public void testIntValue() {
		Card c1 = new Card("J", "H");
		assertEquals(11, c1.getValue());
	}

	/**
	 * Test the suit.
	 */
	@Test
	public void testSuit() {
		Card c1 = new Card("A", "S");
		assertEquals("S", c1.getSuit());
	}

	/**
	 * Test stronger card.
	 */
	@Test
	public void testStrongerCard() {
		Card c1 = new Card("A", "S");
		Card c2 = new Card("2", "H");

		assertEquals(1, c1.compareTo(c2));
	}

	/**
	 * Test weaker card.
	 */
	@Test
	public void testWeakerCard() {
		Card c1 = new Card("2", "H");
		Card c2 = new Card("A", "S");

		assertEquals(-1, c1.compareTo(c2));
	}

	/**
	 * Test if equals method works.
	 */
	@Test
	public void testEquals() {
		Card c1 = new Card("2", "H");
		Card c2 = new Card("2", "S");

		assertEquals(true, c1.equals(c2));
	}

	/**
	 * Test equal card.
	 */
	@Test
	public void testEqualCard() {
		Card c1 = new Card("2", "H");
		Card c2 = new Card("2", "C");

		assertEquals(0, c1.compareTo(c2));
	}

	/**
	 * Test toString.
	 */
	@Test
	public void testToString() {
		Card c1 = new Card("2", "H");

		assertEquals("Card [value=2, suit=H]", c1.toString());
	}
}
