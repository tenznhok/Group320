package edu.ycp.cs320.awesomepage.server.controllers;

import java.util.List;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.User;

public class GetFriendsController {
	
	public List<User> user( ){
		return DatabaseProvider.getInstance().getAllUsers();
	}
}
