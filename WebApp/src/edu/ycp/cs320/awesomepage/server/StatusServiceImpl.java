package edu.ycp.cs320.awesomepage.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.StatusService;
import edu.ycp.cs320.awesomepage.shared.User;

public class StatusServiceImpl extends RemoteServiceServlet implements StatusService {
	@Override
	public void postStatus(User user, String status) {
		System.out.println("User " + user.getEmail() + " posting status " + status);
		
		// TODO: check to make sure that the provided User really is the user that is logged in
		
		// TODO: add the status to the database
		
	}
}
