/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestHand.
 */
public class TestHand {

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

	/** The straight cards. */
	private ArrayList<Card> straightCards;

	/** The three of A kind cards. */
	private ArrayList<Card> threeOfAKindCards;

	/** The two pair cards. */
	private ArrayList<Card> twoPairCards;

	/** The one pair cards. */
	private ArrayList<Card> onePairCards;

	/** The no pair cards. */
	private ArrayList<Card> noPairCards;
	
	/** The five of A kind. */
	private Hand fiveOfAKind;

	/** The straight flush. */
	private Hand straightFlush;

	/** The four of A kind. */
	private Hand fourOfAKind;

	/** The full house. */
	private Hand fullHouse;

	/** The flush. */
	private Hand flush;

	/** The straight. */
	private Hand straight;

	/** The three of A kind. */
	private Hand threeOfAKind;

	/** The two pair. */
	private Hand twoPair;

	/** The one pair. */
	private Hand onePair;

	/** The no pair. */
	private Hand noPair;

	/**
	 * Instantiates a new test hand.
	 */
	public TestHand() {
		
		fiveOfAKindCards = new ArrayList<Card>();
		straightFlushCards = new ArrayList<Card>();
		fourOfAKindCards = new ArrayList<Card>();
		fullHouseCards = new ArrayList<Card>();
		flushCards = new ArrayList<Card>();
		straightCards = new ArrayList<Card>();
		threeOfAKindCards = new ArrayList<Card>();
		twoPairCards = new ArrayList<Card>();
		onePairCards = new ArrayList<Card>();
		noPairCards = new ArrayList<Card>();

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

		straightCards.add(new Card("3", "C"));
		straightCards.add(new Card("4", "S"));
		straightCards.add(new Card("5", "H"));
		straightCards.add(new Card("6", "S"));
		straightCards.add(new Card("7", "D"));

		threeOfAKindCards.add(new Card("3", "C"));
		threeOfAKindCards.add(new Card("3", "S"));
		threeOfAKindCards.add(new Card("3", "H"));
		threeOfAKindCards.add(new Card("6", "S"));
		threeOfAKindCards.add(new Card("10", "D"));

		twoPairCards.add(new Card("3", "C"));
		twoPairCards.add(new Card("3", "S"));
		twoPairCards.add(new Card("6", "H"));
		twoPairCards.add(new Card("6", "S"));
		twoPairCards.add(new Card("10", "D"));

		onePairCards.add(new Card("3", "C"));
		onePairCards.add(new Card("3", "S"));
		onePairCards.add(new Card("5", "H"));
		onePairCards.add(new Card("6", "S"));
		onePairCards.add(new Card("10", "D"));

		noPairCards.add(new Card("4", "C"));
		noPairCards.add(new Card("7", "S"));
		noPairCards.add(new Card("3", "H"));
		noPairCards.add(new Card("Q", "S"));
		noPairCards.add(new Card("10", "D"));

		fiveOfAKind = new Hand(fiveOfAKindCards);
		straightFlush = new Hand(straightFlushCards);
		fourOfAKind = new Hand(fourOfAKindCards);
		fullHouse = new Hand(fullHouseCards);
		flush = new Hand(flushCards);
		straight = new Hand(straightCards);
		threeOfAKind = new Hand(threeOfAKindCards);
		twoPair = new Hand(twoPairCards);
		onePair = new Hand(onePairCards);
		noPair = new Hand(noPairCards);

	}

	
	/**
	 * Test five of A kind.
	 */
	@Test
	public void testFiveOfAKind() {
		assertEquals(0.14, fiveOfAKind.isFiveOfAKind(), 0);
	}
	
	/**
	 * Test straight flush.
	 */
	@Test
	public void testStraightFlush() {
		assertEquals(1.1100000000000003, straightFlush.isStraightFlush(), 0);
	}

	/**
	 * Test four of A kind.
	 */
	@Test
	public void testFourOfAKind() {
		assertEquals(2.03, fourOfAKind.isFourOfAKind(), 0);
	}

	/**
	 * Test full house.
	 */
	@Test
	public void testFullHouse() {
		assertEquals(3.06, fullHouse.isFullHouse(), 0);
	}

	/**
	 * Test flush.
	 */
	@Test
	public void testFlush() {
		assertEquals(4.1, flush.isFlush(), 0);
	}

	/**
	 * Test straight.
	 */
	@Test
	public void testStraight() {
		assertEquals(5.07, straight.isStraight(), 0);
	}

	/**
	 * Test three of A kind.
	 */
	@Test
	public void testThreeOfAKind() {
		assertEquals(6.03, threeOfAKind.isThreeOfAKind(), 0);
	}

	/**
	 * Test two pair.
	 */
	@Test
	public void testTwoPair() {
		assertEquals(7.06, twoPair.isTwoPair(), 0);
	}

	/**
	 * Test one pair.
	 */
	@Test
	public void testOnePair() {
		assertEquals(8.03, onePair.isOnePair(), 0);
	}

	/**
	 * Test No pair.
	 */
	@Test
	public void testNoPair() {
		assertEquals(9.03, noPair.isNoPair(), 0);
	}

	/**
	 * Test numerical rankings.
	 */
	@Test
	public void testNumericalRankings() {
		assertEquals(0.14, fiveOfAKind.isFiveOfAKind(), 0);
		assertEquals(1.1100000000000003, straightFlush.getRanking(), 0);
		assertEquals(2.03, fourOfAKind.getRanking(), 0);
		assertEquals(3.06, fullHouse.getRanking(), 0);
		assertEquals(4.1, flush.getRanking(), 0);
		assertEquals(5.07, straight.getRanking(), 0);
		assertEquals(6.03, threeOfAKind.getRanking(), 0);
		assertEquals(7.06, twoPair.getRanking(), 0);
		assertEquals(8.03, onePair.getRanking(), 0);
		assertEquals(9.03, noPair.isNoPair(), 0);

	}

	/**
	 * Test compare to.
	 */
	@Test
	public void testCompareTo() {
		assertEquals(0, onePair.compareTo(onePair));
		assertEquals(1, onePair.compareTo(fullHouse));
		assertEquals(-1, fullHouse.compareTo(onePair));
	}

}
