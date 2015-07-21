package com.gmx.geekool.cardgame.framework;

/**
 * Every element of the Game that can react to an Event that takes place in the
 * game and can interrupt normal game flow should register itself on the Event's
 * listener list and implement a callback function that will execute once the
 * event happens.
 * 
 * @author Geekool
 *
 */
public interface Listener {

	/**
	 * This a callback function that will be called as soon as the event
	 * happens.
	 */
	public void respondToEvent();

}
