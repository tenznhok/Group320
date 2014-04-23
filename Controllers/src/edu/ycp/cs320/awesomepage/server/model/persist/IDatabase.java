package edu.ycp.cs320.awesomepage.server.model.persist;

import edu.ycp.cs320.awesomepage.shared.User;

public interface IDatabase {
	public User login(String username, String password);
	public User signUp( String username, String password, String email );
}
