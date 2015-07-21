package com.gmx.geekool.cardgame.framework;

/**
 * Any Card or Player may be the target of a given card's effect. This class is
 * a wrapper around these two classes allowing the getTarget method of Effect to
 * return something specific to this framework, which is better than returning
 * Object.
 * 
 * @author Geekool
 *
 */
public interface Target {

	/**
	 * Retrieves and returns the Effect targeting this Object.
	 * 
	 * @return The Effect object which is targeting this Object.
	 */
	public Effect getTargetingEffect();

	/**
	 * This method should return the Player which is the target of the Effect.
	 * This method may return null if the target is not a Player.
	 * 
	 * @return A Player object representing the target of an effect, or null if
	 *         the target is actually a card.
	 */
	public Player getPlayer();

	/**
	 * This method should return the Card which is the target of the Effect.
	 * This method may return null if the target is not a Card.
	 * 
	 * @return A Card object representing the target of an effect, or null if
	 *         the target is actually a player.
	 */
	public Card getCard();
}
