package com.gmx.geekool.cardgame.framework;

/**
 * A Card is a simple implementation of a Card Game basic element. In every
 * modern card game, the cards have at least a name and a description.
 * 
 * @author Geekool
 *
 */
public interface Card {

	/**
	 * Returns the name of the card.
	 * 
	 * @return A String containing the name of the card.
	 */
	public String getName();

	/**
	 * Returns the description of the card.
	 * 
	 * @return A String containing the description of the card.
	 */
	public String getDescription();

}
