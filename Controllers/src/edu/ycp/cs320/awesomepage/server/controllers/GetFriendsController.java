package edu.ycp.cs320.awesomepage.server.controllers;

import java.util.ArrayList;
import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;

public class GetFriendsController {

	public ArrayList<friendName> getFriendsList( int userID ){
		return DatabaseProvider.getInstance().getAllFriends( userID );
	}
	/*
	public FriendsList addFriends( int userID, User f ){
		return DatabaseProvider.getInstance().addFriends( userID, f );
	}
	*/
}
