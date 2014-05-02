package edu.ycp.cs320.awesomepage.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.GetFriendsService;
import edu.ycp.cs320.awesomepage.server.controllers.GetFriendsController;
import edu.ycp.cs320.awesomepage.shared.User;

public class GetFriendsServiceImpl extends RemoteServiceServlet implements GetFriendsService  {

	@Override
	public List<User> user( ){
		GetFriendsController controller = new GetFriendsController();
		return null;
	}
}
