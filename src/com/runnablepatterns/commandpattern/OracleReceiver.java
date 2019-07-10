package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * OracleReceiver class used to perform Oracle queries
 *
 */
public class OracleReceiver implements ReceiverType {

	@Override
	public Employee query(String query, Object[] parameters) {
		// add log messages
		System.out.println("Connecting to Oracle database");
		System.out.println(String.format("Executing query: %s > using ID = %s", query, parameters[0]));
		
		// return employee instance
		return new Employee("1", "John", "john@email.com");
	}

}
