package edu.ycp.cs320.awesomepage.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;

@RemoteServiceRelativePath("GetFriends")
public interface GetFriendsService extends RemoteService {
	
	public ArrayList<friendName> friendsList( int userID );
	//public FriendsList addFriends( int userID, User f );
}
