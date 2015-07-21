package com.gmx.geekool.cardgame.framework;

import java.util.List;

/**
 * This class captures the attributes and behaviors of Players in a typical
 * modern Card Game.
 * 
 * @author Geekool
 *
 */
public interface Player {

	/**
	 * Returns the Player's current health.
	 * 
	 * @return An integer representing the player's current health.
	 */
	public int getHealth();

	/**
	 * Deals damage to the player. This should be called when reducing the
	 * player's health.
	 * 
	 * @param amount
	 *            The amount which will be subtracted from the Player's health.
	 */
	public void damage(int amount);

	/**
	 * Heals the Player's health. This should be called when increasing the
	 * player's health.
	 * 
	 * @param amount
	 *            The amount which will be added to the Player's health.
	 */
	public void heal(int amount);

	/**
	 * Lists the cards in the player's hand.
	 * 
	 * @return A List object with the cards in the player's hand.
	 */
	public List<Card> getHand();
}
