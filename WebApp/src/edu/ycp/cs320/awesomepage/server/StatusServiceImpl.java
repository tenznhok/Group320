package edu.ycp.cs320.awesomepage.server;
import edu.ycp.cs320.awesomepage.shared.User;
import java.util.List;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ycp.cs320.awesomepage.client.StatusService;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.server.controllers.statusController;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.LoginService;
import edu.ycp.cs320.awesomepage.server.controllers.LoginController;
import edu.ycp.cs320.awesomepage.shared.User;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.StatusService;
import edu.ycp.cs320.awesomepage.server.controllers.statusController;
import edu.ycp.cs320.awesomepage.shared.User;

public class StatusServiceImpl extends RemoteServiceServlet implements StatusService {
	@Override
	public void postStatus(User user, String status) {
		System.out.println("User " + user.getEmail() + " posting status " + status);
		statusController controller = new statusController();
		User result = controller.status(user, status);
		
		// TODO: check to make sure that the provided User really is the user that is logged in
		
		// TODO: add the status to the database
		
	}
	
	@Override
	public String[] getStatusesForUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
