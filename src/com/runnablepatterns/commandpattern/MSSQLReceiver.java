package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * MSSQLReceiver class used to perform MSSQL queries
 *
 */
public class MSSQLReceiver implements ReceiverType {

	@Override
	public Employee query(String query, Object[] parameters) {
		// add log messages
		System.out.println("Connecting to MSSQL database");
		System.out.println(String.format("Executing query: %s > using ID = %s", query, parameters[0]));
				
		// return employee instance
		return new Employee("1", "Max", "max@email.com");
	}

}
