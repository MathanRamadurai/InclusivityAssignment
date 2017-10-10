/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.apache.log4j.Logger;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestDeck.
 */
public class TestDeck {
	
	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(TestDeck.class);

	/**
	 * Test the shuffling.
	 */
	@Test
	public void testShuffle() {
		Deck d1 = new Deck();
		
		String initial = d1.toString();
		logger.info("Before deck shuffle :: " + initial);
		d1.shuffle();
		String result = d1.toString();
		logger.info("After deck shuffle :: " + result);
		
		
		assertNotSame(initial, result);
	}

	/**
	 * Test the drawing of a card.
	 */
	@Test
	public void testDraw() {
		Deck d1 = new Deck();
		
		Card c1 = d1.draw();
		logger.info(c1.toString() +" removed from Deck");
	
		assertEquals(51, d1.cards().size());
	}
	
	/**
	 * Test equivalent decks.
	 */
	@Test
	public void testEquals() {
		Deck d1 = new Deck();
		Deck d2 = new Deck();
		
		assertEquals(true, d1.equals(d2));
	}
}
