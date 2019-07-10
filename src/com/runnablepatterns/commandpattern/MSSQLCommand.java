package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * MSSQLCommand class used to encapsulate how MSSQL handles queries
 *
 */
public class MSSQLCommand implements DatabaseCommand {

	/**
	 * Variable to store the receiver details
	 */
	private ReceiverType receiver;
	
	/**
	 * Overloaded constructor to set the receiver for the command
	 * @param _receiver ReceiverType to tie to the command
	 */
	public MSSQLCommand(ReceiverType _receiver) {
		this.receiver = _receiver;
	}
	
	@Override
	public Employee execute(Object[] parameters) {
		// create dummy value for oracle
		String query = "select statement for MSSQL";
				
		// call the receiver action
		return receiver.query(query, parameters);
	}

}
