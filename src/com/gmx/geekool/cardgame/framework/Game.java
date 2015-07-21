package com.gmx.geekool.cardgame.framework;

/**
 * A Game object should capture the entire state of the Game.
 * 
 * If the implementation has players acting asynchronously, it is advised to
 * enforce consistent game state.
 * 
 * @author Geekool
 *
 */
public interface Game {

	/**
	 * Returns the Player who has won the match. Return null if the match is
	 * underway.
	 * 
	 * @return The Winning Player object or null if there is not one.
	 */
	public Player getWinner();

	/**
	 * Returns whether the game has finished or not.
	 * 
	 * @return a boolean for whether the game has finished or not
	 */
	public boolean isOver();

	/**
	 * Returns the integer associated with each Player's initial health.
	 * 
	 * @return An integer which represents the initial health for every match.
	 */
	public int getInitialPlayerHealth();

	/**
	 * Returns the starting hand size.
	 * 
	 * @return An integer which represents the size of the starting hand.
	 */
	public int getInitialHandSize();

	/**
	 * Returns the number of phases on every turn. For instance, Beginning
	 * Phase, Main Phase, Combat Phase, Main Phase 2, Ending Phase
	 * 
	 * @return An integer representing the number of phases on every turn.
	 */
	public int getNumberOfPhases();
}
