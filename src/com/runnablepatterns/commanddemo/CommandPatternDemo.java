package com.runnablepatterns.commanddemo;

import com.runnablepatterns.commandpattern.DBInvoker;
import com.runnablepatterns.commandpattern.DatabaseCommand;
import com.runnablepatterns.commandpattern.Employee;
import com.runnablepatterns.commandpattern.MSSQLCommand;
import com.runnablepatterns.commandpattern.MSSQLReceiver;
import com.runnablepatterns.commandpattern.OracleCommand;
import com.runnablepatterns.commandpattern.OracleReceiver;
import com.runnablepatterns.commandpattern.ReceiverType;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Command Pattern Demo class
 *
 */
public class CommandPatternDemo {

	public static void main(String[] args) {
		// create the invoker
		DBInvoker invoker = new DBInvoker();
		
		// set database query parameters
		Object[] parameters = {"1"};
		
		// create the specific receiver for oracle
		ReceiverType receiverOracle = new OracleReceiver();
		
		//create oracle database command and send the receiver
		DatabaseCommand oracleCommand = new OracleCommand(receiverOracle);
		
		// set the command to execute against Oracle
		invoker.setDbCommand(oracleCommand);
		
		// get the result
		Employee employee = invoker.execute(parameters);
		System.out.println(employee);
		System.out.println();
		
		// set command to execute against MSSQL
		invoker.setDbCommand(new MSSQLCommand(new MSSQLReceiver()));
		
		// get the result
		employee = invoker.execute(parameters);
		System.out.println(employee);
	}

}
