package edu.ycp.cs320.awesomepage.server.controllers;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.User;

public class LoginController {
	public User login(String username, String password) {
		return DatabaseProvider.getInstance().login(username, password);
	}
}
