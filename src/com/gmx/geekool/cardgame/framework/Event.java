package com.gmx.geekool.cardgame.framework;

import java.util.List;

/**
 * What an Event is really depends on the Programmer. Usually, though, an Event
 * is a Player taking damage, a Card being played, an Effect taking action,
 * players moving from one game phase to another or the Game ending.
 * 
 * @author Geekool
 *
 */
public interface Event {

	/**
	 * Returns the type of the Event. This is assuming the programmer wants to
	 * maintaining event type as integers or Java's Enum class.
	 * 
	 * @return Returns an integer corresponding to the Event type.
	 */
	public int getEventType();

	/**
	 * Returns the list of objects waiting for this event.
	 * 
	 * @return Returns a List object containing the Listener objects registered
	 *         to this event
	 */
	public List<Listener> getListeners();

	/**
	 * Adds the given object as a Listener to this Event. The Listener's
	 * callback function will be called whenever this event happens.
	 * 
	 * @param listener
	 *            The Listener object that will have its callback function
	 *            called when this event happens.
	 */
	public void register(Listener listener);

	/**
	 * Removes the given object from the list of Listeners to this event.
	 * 
	 * @param listener
	 *            The Listener object that should be deleted from this event's
	 *            listener list
	 */
	public void unregisterListener(Listener listener);

	/**
	 * When the Event happens, all registered Listeners must be alerted.
	 * Depending on the specific game, the order at which the Listeners are
	 * alerted is not important.
	 * 
	 * This will usually fire a prompt to the players.
	 */
	public void trigger();

}
