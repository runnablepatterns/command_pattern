package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Receiver interface used to wrap all receivers types
 *
 */
public interface ReceiverType {

	/**
	 * Method that performs the actual action to query the database
	 * @param query The query statement to execute
	 * @param parameters The query parameters
	 * @return Employee that matches the parameters
	 */
	public Employee query(String query, Object[] parameters);
}
