package edu.ycp.cs320.awesomepage.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.LoginService;
import edu.ycp.cs320.awesomepage.server.controllers.LoginController;
import edu.ycp.cs320.awesomepage.shared.User;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

	@Override
	public User logIn(String username, String password) {
		System.out.println("Server's logIn method called!");
		
		// TODO: use a controller to check the database
		
		LoginController controller = new LoginController();
		
		return controller.login(username, password);
		
		//return null;
	}

}
