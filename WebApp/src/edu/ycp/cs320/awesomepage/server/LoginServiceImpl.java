package edu.ycp.cs320.awesomepage.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.LoginService;
import edu.ycp.cs320.awesomepage.server.controllers.LoginController;
import edu.ycp.cs320.awesomepage.shared.User;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {
//	private List<User> userList;

	@Override
	public User logIn(String username, String password) {
		
		System.out.println("Attempt to log in: username=" + username + ", password=" + password);
		
		LoginController controller = new LoginController();
		//controller.login(username, password);
			User result = controller.login(username, password);
		if (result == null) {
			System.out.println("No such username/password");
		} else {
			System.out.println("Successful login");
		}
		return result;
	}

}
