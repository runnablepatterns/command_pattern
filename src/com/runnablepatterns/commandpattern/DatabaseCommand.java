package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * DatabaseCommand interface used to wrap all commands
 *
 */
public interface DatabaseCommand {

	/**
	 * Execute the command to get the Employee details
	 * @param parameters Parameters used in the query
	 * @return Employee details according to parameters provided
	 */
	public Employee execute(Object[] parameters);
}
