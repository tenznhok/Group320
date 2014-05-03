package edu.ycp.cs320.awesomepage.server.controllers;

import java.util.ArrayList;
import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.User;

public class GetAllUsersController {

	public ArrayList<User> user( ){
		return DatabaseProvider.getInstance().getAllUsers();
	}
}
