package edu.ycp.cs320.awesomepage.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.LoginService;
import edu.ycp.cs320.awesomepage.server.controllers.LoginController;
import edu.ycp.cs320.awesomepage.shared.User;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {
	private List<User> userList;

	@Override
	public User logIn(String username, String password) {
		System.out.println("Server's logIn method called!");
		
		// TODO: use a controller to check the database
	
		LoginController controller = new LoginController();
		for (User user : userList) {
			if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
		
	}

}
