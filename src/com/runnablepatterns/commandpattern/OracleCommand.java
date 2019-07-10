package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * OracleCommand class used to encapsulate how Oracle handles queries
 *
 */
public class OracleCommand implements DatabaseCommand {
	
	/**
	 * Variable to store the receiver details
	 */
	private ReceiverType receiver;
	
	/**
	 * Overloaded constructor to set the receiver for the command
	 * @param _receiver ReceiverType to tie to the command
	 */
	public OracleCommand(ReceiverType _receiver) {
		this.receiver = _receiver;
	}

	@Override
	public Employee execute(Object[] parameters) {
		// create dummy value for oracle
		String query = "select statement for Oracle";
		
		// call the receiver action
		return receiver.query(query, parameters);
	}

}
