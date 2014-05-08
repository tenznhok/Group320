package edu.ycp.cs320.awesomepage.server;

import java.util.ArrayList;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ycp.cs320.awesomepage.client.GetFriendsService;
import edu.ycp.cs320.awesomepage.server.controllers.GetFriendsController;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;

public class GetFriendsServiceImpl extends RemoteServiceServlet implements GetFriendsService  {

	@Override
	public ArrayList<friendName> friendsList( ){
		GetFriendsController controller = new GetFriendsController();
		ArrayList<friendName> result = controller.getFriendsList( );
		return result;
	}
	@Override
	public friendName addFriends( int userID, String name ){
		GetFriendsController controller = new GetFriendsController();
		controller.addFriends(userID, name);
		return null;
	}
}
