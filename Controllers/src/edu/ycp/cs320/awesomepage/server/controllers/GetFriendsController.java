package edu.ycp.cs320.awesomepage.server.controllers;

import java.util.ArrayList;
import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;

public class GetFriendsController {

	public FriendsList getFriendsList( int userID ){
		return DatabaseProvider.getInstance().friendsList( userID );
	}
	public friendName addFriends( int userID, String name ){
		return DatabaseProvider.getInstance().addFriend( userID, name );
	}
}
