/*
 * Copyright informations
 */
package com.inclusivity.assignment.poker;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Game.
 */
public class Game {
    
    /** The deck. */
    private Deck deck;
    
    /** The players. */
    private ArrayList<Player> players;
    
    /**
     * Instantiates a new game.
     */
    public Game() {
        
    }

	/**
	 * Instantiates a new game.
	 *
	 * @param deck the deck
	 * @param players the players
	 */
	public Game(Deck deck, ArrayList<Player> players) {
		super();
		this.deck = deck;
		this.players = players;
	}

	/**
	 * Gets the deck.
	 *
	 * @return the deck
	 */
	public Deck getDeck() {
		return deck;
	}

	/**
	 * Sets the deck.
	 *
	 * @param deck the new deck
	 */
	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	/**
	 * Gets the players.
	 *
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * Sets the players.
	 *
	 * @param players the new players
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
    
}