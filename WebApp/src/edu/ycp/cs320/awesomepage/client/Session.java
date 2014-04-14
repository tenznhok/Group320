package edu.ycp.cs320.awesomepage.client;

import edu.ycp.cs320.awesomepage.shared.User;

/**
 * Class to keep track of "global" information such
 * as the {@link User} object representing the current user.
 * 
 * @author tnguye17
 */
public class Session {
	private static final Session theInstance = new Session();
	
	public static Session getInstance() {
		return theInstance;
	}
	
	private User user;
	
	private Session() {
		
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	
	
}
