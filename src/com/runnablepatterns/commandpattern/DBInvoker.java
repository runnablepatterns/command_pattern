package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * DBInvoker class used to handle commands references
 *
 */
public class DBInvoker {

	/**
	 * Variable to store the current command
	 */
	private DatabaseCommand dbCommand;

	/**
	 * Set the specific command to execute
	 * @param dbCommand The command to execute
	 */
	public void setDbCommand(DatabaseCommand dbCommand) {
		this.dbCommand = dbCommand;
	}
	
	/**
	 * Method that executes the action for the current command
	 * @param parameters Command parameters used in the statement
	 * @return Employee that matches the parameters
	 */
	public Employee execute(Object[] parameters) {
		return dbCommand.execute(parameters);
	}
}
