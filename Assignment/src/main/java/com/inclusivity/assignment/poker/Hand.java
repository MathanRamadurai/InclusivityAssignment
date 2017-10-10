/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class Hand.
 */
public class Hand implements Comparable<Hand> {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(Hand.class);

	/** The hand. */
	private ArrayList<Card> hand;

	/** The values. */
	private int[] values;

	/** The suits. */
	private String[] suits;

	/**
	 * Construct a Hand and give the Hand some Cards.
	 *
	 * @param cards
	 *            the cards
	 */
	public Hand(ArrayList<Card> cards) {
		this.hand = cards;
		this.values = values();
		this.suits = suits();

		Arrays.sort(values);
		Arrays.sort(suits);
	}

	/**
	 * Get the ArrayList of Cards in the Hand.
	 * 
	 * @return An ArrayList of Cards.
	 */
	public ArrayList<Card> cards() {
		return hand;
	}

	/**
	 * Get the numerical ranking of the hand.
	 * 
	 * @return The ranking of a Hand. The higher the integer,
	 */
	public double getRanking() {
		double ranking = 0;

		if (isFiveOfAKind() > 0.0) {
			ranking = isFiveOfAKind();
		} else if (isStraightFlush() > 1.0) {
			ranking = isStraightFlush();
		} else if (isFourOfAKind() > 2.0) {
			ranking = isFourOfAKind();
		} else if (isFullHouse() > 3.0) {
			ranking = isFullHouse();
		} else if (isFlush() > 4.0) {
			ranking = isFlush();
		} else if (isStraight() > 5.0) {
			ranking = isStraight();
		} else if (isThreeOfAKind() > 6.0) {
			ranking = isThreeOfAKind();
		} else if (isTwoPair() > 7.0) {
			ranking = isTwoPair();
		} else if (isOnePair() > 8.0) {
			ranking = isOnePair();
		} else if (isNoPair() > 9.0) {
			ranking = isNoPair();
		} else {
			// NA
		}

		return ranking;
	}

	/**
	 * Get the ranking name of the hand.
	 * 
	 * @return The ranking name of a Hand.
	 * 
	 */
	public String getRankingName() {
		String rankingName = "";

		if (isFiveOfAKind() > 0.0) {
			rankingName = "Five of a kind";
		} else if (isStraightFlush() > 1.0) {
			rankingName = "Straight flush";
		} else if (isFourOfAKind() > 2.0) {
			rankingName = "Four of a kind";
		} else if (isFullHouse() > 3.0) {
			rankingName = "Full house";
		} else if (isFlush() > 4.0) {
			rankingName = "Flush";
		} else if (isStraight() > 5.0) {
			rankingName = "Straight";
		} else if (isThreeOfAKind() > 6.0) {
			rankingName = "Three of a kind";
		} else if (isTwoPair() > 7.0) {
			rankingName = "Two pair";
		} else if (isOnePair() > 8.0) {
			rankingName = "One pair";
		} else if (isNoPair() > 9.0) {
			rankingName = "High card";
		} else {
			// NA
		}

		return rankingName;
	}

	/**
	 * Generate an array of values.
	 * 
	 * @return An array of integers.
	 */
	private int[] values() {
		int[] result = new int[5];

		for (int i = 0; i < hand.size(); i++) {
			result[i] = hand.get(i).getValue();
		}

		return result;
	}

	/**
	 * Generate a array of suits.
	 * 
	 * @return An array of suits.
	 */
	private String[] suits() {
		String[] result = new String[5];

		for (int i = 0; i < hand.size(); i++) {
			result[i] = hand.get(i).getSuit();
		}

		return result;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ArrayList<Card> cardlist = new ArrayList<Card>();
		try {
			// Check to see if the program runs with the command line argument
			if (args.length < 1) {
				logger.info("Unknown command line argument. please check this sample argument A:S,10:C,10:H,3:D,3:S for reference.");
			} else if (args.length == 1) {
				String[] cards = args[0].split(",");
				for (String card : cards) {
					String[] cardArr = card.split(":");
					Card cardObj = new Card(cardArr[0], cardArr[1]);
					cardlist.add(cardObj);
				}
				Hand hand = new Hand(cardlist);
				String rankingName = hand.getRankingName();
				logger.info("Ranking Name >>>>>>>>>>>>>>> "+rankingName);
			}

		} catch (Exception e) {
			logger.error(e);
		}

	}

	/**
	 * Check if it is high card(no pair).
	 * 
	 * @return If it is a high card, the double 9.0 plus decimals representing
	 *         the high card. If not, 0.
	 */
	public double isNoPair() {
		double result = 0.0;
		for (int i = 0; i < values.length - 4; i++) {
			if (values[i] != values[i + 1] && values[i] != values[i + 2] && values[i] != values[i + 3]
					&& values[i] != values[i + 4]) {
				result = 9.0 + (values[i] * 0.01);
			}
		}

		return result;
	}

	/**
	 * Check if it is one pair.
	 * 
	 * @return If it is one pair, the double 8.0 plus decimals representing the
	 *         high card. If not, 0.
	 */
	public double isOnePair() {
		double result = 0.0;

		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) {
				result = 8.0 + (values[i] * 0.01);
			}
		}

		return result;
	}

	/**
	 * Check if it is two pair.
	 * 
	 * @return If it is two pair, the double 7.0 plus decimals representing the
	 *         high card. If not, 0.
	 */
	public double isTwoPair() {
		double result = 0.0;
		double value = 0.0;
		int counter = 0; // Number of pairs.

		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) {
				counter++;

				value = values[i] * 0.01;
			}
		}

		if (counter == 2) {
			result = 7.0 + value;
		}

		return result;
	}

	/**
	 * Check if it is a three-of-a-kind.
	 * 
	 * @return If it is three-of-a-kind, the double 6.0 plus decimals
	 *         representing the high card. If not, 0.
	 */
	public double isThreeOfAKind() {
		double result = 0.0;

		for (int i = 0; i < values.length - 2; i++) {
			if (values[i] == values[i + 1] && values[i] == values[i + 2]) {
				result = 6.0 + (values[i] * 0.01);
			}
		}

		return result;
	}

	/**
	 * Check if it is a straight.
	 *
	 * @return If it is straight, the double 5.0 plus decimals representing the
	 *         high card. If not, 0.
	 */
	public double isStraight() {
		double result = 0.0;

		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1] - 1) {
				result = 5.0 + (values[i + 1] * 0.01);
			} else {
				result = 0.0;
			}
		}

		return result;
	}

	/**
	 * Check if it is a straight.
	 * 
	 * @return If it is straight, the double 4.0 plus decimals representing the
	 *         high card. If not, 0.
	 */
	public double isFlush() {
		double result = 0.0;

		String suit = suits[0];

		for (int i = 0; i < suits.length; i++) {
			result = 4.0 + (values[i] * 0.01);

			if (suits[i].equals(suit) == false) {
				result = 0.0;
			}
		}

		return result;
	}

	/**
	 * Check if it is a full house.
	 * 
	 * @return If it is full house, the double 3.0 plus decimals representing
	 *         the high card. If not, 0.
	 */
	public double isFullHouse() {
		double result = 0.0;
		boolean one = false;
		boolean two = false;

		for (int i = 0; i < values.length - 2; i++) {
			if (values[i] == values[i + 1] && values[i] == values[i + 2]) {
				one = true;
			}
		}

		if (values[3] == values[4]) {
			two = true;
		}

		if (one && two) {
			result = 3.0 + (values[values.length - 1] * 0.01);
		}

		return result;
	}

	/**
	 * Check if it is a four-of-a-kind.
	 * 
	 * @return If it is four-of-a-kind, the double 2.0 plus decimals
	 *         representing the high card. If not, 0.
	 */
	public double isFourOfAKind() {
		double result = 0.0;

		for (int i = 0; i < values.length - 3; i++) {
			if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
				result = 2.0 + (values[i] * 0.01);
			}
		}

		return result;
	}

	/**
	 * Check if it is a five-of-a-kind.
	 * 
	 * @return If it is five-of-a-kind, the double 0.0 plus decimals
	 *         representing the high card. If not, 0.
	 */
	public double isFiveOfAKind() {
		double result = 0.0;

		for (int i = 0; i < values.length - 4; i++) {
			if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]
					&& values[i + 4] == 15) {
				result = 0.0 + (values[i] * 0.01);
			}
		}

		return result;
	}

	/**
	 * Check if it is a straight flush.
	 * 
	 * @return If it is a straight flush, the double 1.0 plus decimals
	 *         representing the high card. If not, 0.
	 */
	public double isStraightFlush() {
		double result = 0.0;

		if (isStraight() > 5.0 && isFlush() > 4.0) {
			result = 1.0 + isStraight() - 5.0;
		}

		return result;
	}

	/**
	 * Get the value of the card (2-10, J, Q, K, A).
	 * 
	 * @param other
	 *            The Hand to compare to.
	 * @return An integer. If 0, then they are equal, -1 if the current hard
	 *         (the one calling the method) is weaker than the other, and 1 if
	 *         the hand calling the method is better.
	 */
	public int compareTo(Hand other) {
		int result = 0;

		int thisIntRank = (int) this.getRanking();
		int otherIntRank = (int) other.getRanking();

		double tempThisHighCard = this.getRanking() - thisIntRank;
		double tempOtherHighCard = other.getRanking() - otherIntRank;

		int thisHighCard = (int) tempThisHighCard;
		int otherHighCard = (int) tempOtherHighCard;

		if (thisIntRank == otherIntRank) { // If the same rank.
			if (thisHighCard > otherHighCard) {
				result = 1;
			} else if (otherHighCard > thisHighCard) {
				result = -1;
			} else {
				result = 0;
			}
		} else if (thisIntRank > otherIntRank) { // If this is of greater rank.
			result = 1;
		} else if (otherIntRank > thisIntRank) { // If the other is of greater
													// rank.
			result = -1;
		} else { // Something different?
			result = 0;
		}

		return result;
	}

	/**
	 * Get a string representation of a Hand.
	 * 
	 * @return The string representation of a Hand.
	 */
	public String toString() {
		String result = "";
		result += hand.get(0).toString();

		for (int i = 1; i < 5; i++) {
			result += ", " + hand.get(i).toString();
		}

		return result;
	}
}