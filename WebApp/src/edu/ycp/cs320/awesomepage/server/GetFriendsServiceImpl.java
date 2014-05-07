package edu.ycp.cs320.awesomepage.server;

import java.util.ArrayList;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ycp.cs320.awesomepage.client.GetFriendsService;
import edu.ycp.cs320.awesomepage.server.controllers.GetFriendsController;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;

public class GetFriendsServiceImpl extends RemoteServiceServlet implements GetFriendsService  {
/*
	@Override
	public FriendsList friendsList( int userID ){
		GetFriendsController controller = new GetFriendsController();
		FriendsList result = controller.friends( userID );
		return result;
	}
	
	@Override
	public FriendsList addFriends( int userID, User f ){
		GetFriendsController controller = new GetFriendsController();
		controller.addFriends( userID, f);
		return null;
	}
	*/
}
