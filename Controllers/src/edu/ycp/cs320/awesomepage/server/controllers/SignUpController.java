package edu.ycp.cs320.awesomepage.server.controllers;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.User;

public class SignUpController {
	
	public User signUp( String username, String password, String email ){
		return DatabaseProvider.getInstance().signUp( username, password, email );
	}
}
