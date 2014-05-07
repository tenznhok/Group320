package edu.ycp.cs320.awesomepage.server;

import java.util.ArrayList;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ycp.cs320.awesomepage.client.userListViewService;
import edu.ycp.cs320.awesomepage.server.controllers.GetAllUsersController;
import edu.ycp.cs320.awesomepage.shared.User;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class GetAllUsersServiceImpl extends RemoteServiceServlet implements userListViewService   {

	@Override
	public ArrayList<User> user( ){
		GetAllUsersController controller = new GetAllUsersController();
		ArrayList<User> result = controller.user();
		return result;
	}
}
