package com.runnablepatterns.commandpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Employee class to hold employee information
 *
 */
public class Employee {
	/**
	 * Variable to store id details.
	 */
	private String id;
	
	/**
	 * Variable to store name details.
	 */
	private String name;
	
	/**
	 * Variable to store email details
	 */
	private String email;
	
	/**
	 * Overloaded constructor used to initialize all variables
	 * @param _id The Employee id.
	 * @param _name The Employee name.
	 * @param _email The Employee email.
	 */
	public Employee(String _id, String _name, String _email) {
		setId(_id);
		setName(_name);
		setEmail(_email);
	}

	/**
	 * Get the id details
	 * @return Employee id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set the id details
	 * @param id Employee id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get the name details
	 * @return Employee name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name details
	 * @param name Employee name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the email details
	 * @return Employee email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the email details
	 * @param email Employee email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("ID: %s | Name: %s | Email: %s", getId(), getName(), getEmail());
	}
}
