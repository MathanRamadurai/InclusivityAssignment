/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestPlayer.
 */
public class TestPlayer {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(TestPlayer.class);
	
	/** The matt. */
	private Player matt;
	
	/** The joe. */
	private Player joe;
	
	/** The peter. */
	private Player peter;
	
	/** The amit. */
	private Player amit;
	
	/** The john. */
	private Player john;
	
	/** The five of A kind cards. */
	private ArrayList<Card> fiveOfAKindCards;
	
	/** The straight flush cards. */
	private ArrayList<Card> straightFlushCards;

	/** The four of A kind cards. */
	private ArrayList<Card> fourOfAKindCards;

	/** The full house cards. */
	private ArrayList<Card> fullHouseCards;

	/** The flush cards. */
	private ArrayList<Card> flushCards;
	
	
	/**
	 * Instantiates a new test player.
	 */
	public TestPlayer(){
		matt = new Player("matthew");
		joe = new Player("joel");
		peter = new Player("peter");
		amit = new Player("amit");
		john = new Player("john");
		
		fiveOfAKindCards = new ArrayList<Card>();
		straightFlushCards = new ArrayList<Card>();
		fourOfAKindCards = new ArrayList<Card>();
		fullHouseCards = new ArrayList<Card>();
		flushCards = new ArrayList<Card>();
		

		fiveOfAKindCards.add(new Card("A", "C"));
		fiveOfAKindCards.add(new Card("A", "S"));
		fiveOfAKindCards.add(new Card("A", "H"));
		fiveOfAKindCards.add(new Card("A", "D"));
		fiveOfAKindCards.add(new Card("JKR", "JKR"));
		
		straightFlushCards.add(new Card("7", "C"));
		straightFlushCards.add(new Card("8", "C"));
		straightFlushCards.add(new Card("9", "C"));
		straightFlushCards.add(new Card("10", "C"));
		straightFlushCards.add(new Card("J", "C"));

		fourOfAKindCards.add(new Card("3", "C"));
		fourOfAKindCards.add(new Card("3", "D"));
		fourOfAKindCards.add(new Card("3", "S"));
		fourOfAKindCards.add(new Card("3", "C"));
		fourOfAKindCards.add(new Card("6", "H"));

		fullHouseCards.add(new Card("3", "C"));
		fullHouseCards.add(new Card("3", "D"));
		fullHouseCards.add(new Card("3", "S"));
		fullHouseCards.add(new Card("6", "C"));
		fullHouseCards.add(new Card("6", "H"));

		flushCards.add(new Card("2", "C"));
		flushCards.add(new Card("4", "C"));
		flushCards.add(new Card("7", "C"));
		flushCards.add(new Card("8", "C"));
		flushCards.add(new Card("10", "C"));

		
		matt.giveHand(fiveOfAKindCards);
		joe.giveHand(straightFlushCards);
		peter.giveHand(fourOfAKindCards);
		amit.giveHand(fullHouseCards);
		john.giveHand(flushCards);
	}
	
	/**
	 * Test compare to.
	 */
	@Test
	public void testCompareTo() {
		assertEquals(0, matt.compareTo(matt));
		assertEquals(-1, matt.compareTo(joe));
		assertEquals(-1, joe.compareTo(peter));
		assertEquals(-1, peter.compareTo(amit));
	}
	
	/**
	 * Test players.
	 */
	@Test
	public void testPlayers() {
		logger.info("Player ::: " + matt.toString());
		logger.info("Player ::: " + joe.toString());
		logger.info("Player ::: " + peter.toString());
		logger.info("Player ::: " + amit.toString());
		logger.info("Player ::: " + john.toString());
	}
	
}
