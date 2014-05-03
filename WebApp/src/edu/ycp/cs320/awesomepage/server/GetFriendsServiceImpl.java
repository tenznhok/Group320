package edu.ycp.cs320.awesomepage.server;

import java.util.ArrayList;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ycp.cs320.awesomepage.client.GetFriendsService;
import edu.ycp.cs320.awesomepage.server.controllers.GetFriendsController;
import edu.ycp.cs320.awesomepage.shared.User;

public class GetFriendsServiceImpl extends RemoteServiceServlet implements GetFriendsService  {

	@Override
	public ArrayList<User> user( ){
		GetFriendsController controller = new GetFriendsController();
		ArrayList<User> result = controller.user();
		return result;
	}
}
