package edu.ycp.cs320.awesomepage.server.controllers;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.User;

public class statusController {
	public User status( User user, String password){
		return DatabaseProvider.getInstance().status( user, password);
	}

}
