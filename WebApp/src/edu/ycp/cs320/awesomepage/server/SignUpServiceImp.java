package edu.ycp.cs320.awesomepage.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ycp.cs320.awesomepage.client.SignUpService;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.server.controllers.SignUpController;

public class SignUpServiceImp extends RemoteServiceServlet implements SignUpService {
	@Override
	public User signUp(String username, String password) {
		// TODO Auto-generated method stub
		SignUpController controller = new SignUpController();
		
		User result = controller.signUp(username, password);
		if (result == null) {
			System.out.println("No new user I like cake!!");
		} else {
			System.out.println("Successful to make good cake!!");
		}
		return result;
	}
}
