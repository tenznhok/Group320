package edu.ycp.cs320.awesomepage.server.controllers;

import java.util.ArrayList;
import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;

public class GetFriendsController {
	
	public FriendsList friends( int userID ){
		return DatabaseProvider.getInstance().getAllFriends( userID );
	}
	public ArrayList<FriendsList> addFriends( FriendsList e ){
		return DatabaseProvider.getInstance().addFriends( e );
	}
}
