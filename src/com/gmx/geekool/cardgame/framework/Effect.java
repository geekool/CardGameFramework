package com.gmx.geekool.cardgame.framework;

/**
 * The effect class was design to capture the special behavior of some cards
 * that have special abilities that can brake the game's core mechanic, like
 * causing damage directly to a Player's health. Or causing a player to descard
 * a card.
 * 
 * @author Geekool
 *
 */
public interface Effect {

	/**
	 * Retrieves and returns the object which is the target of this effect.
	 * 
	 * @return the Target object of this effect.
	 */
	public Target getTarget();

	/**
	 * Actually does the designed effect. In a proper implementation, this
	 * should trigger an Event object.
	 */
	public void doEffect();

}
