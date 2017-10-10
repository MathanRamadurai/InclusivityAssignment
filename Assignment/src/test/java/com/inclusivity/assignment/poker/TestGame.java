/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestGame.
 */
public class TestGame {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(TestGame.class);

	/** The deck. */
	private Deck deck;
	
	/** The players. */
	private ArrayList<Player> players;

	/**
	 * Instantiates a new test game.
	 */
	public TestGame() {
		deck = new Deck();
		players = new ArrayList<Player>();

		Player matt = new Player("matthew");
		Player joe = new Player("joel");
		Player peter = new Player("peter");
		Player amit = new Player("amit");
		Player john = new Player("john");

		ArrayList<Card> fiveOfAKindCards = new ArrayList<Card>();
		ArrayList<Card> straightFlushCards = new ArrayList<Card>();
		ArrayList<Card> fourOfAKindCards = new ArrayList<Card>();
		ArrayList<Card> fullHouseCards = new ArrayList<Card>();
		ArrayList<Card> flushCards = new ArrayList<Card>();

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

		players.add(matt);
		players.add(joe);
		players.add(peter);
		players.add(amit);
		players.add(john);

	}

	/**
	 * Test game.
	 */
	@Test
	public void testGame() {
		logger.info("Deck :::::::::::" + deck.toString());
		logger.info("Players :::::::::::" + players.toString());
	}

}
