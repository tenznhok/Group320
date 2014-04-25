package edu.ycp.cs320.awesomepage.server.controllers;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;

public class statusController {
	public String status( int id, String newStatus ){
		return DatabaseProvider.getInstance().status( id );
	}
	public Status postStatus(int id, String newStatus){
		return DatabaseProvider.getInstance().postStatus(id, newStatus);
	}
}
