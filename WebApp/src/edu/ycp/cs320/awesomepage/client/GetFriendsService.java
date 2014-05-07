package edu.ycp.cs320.awesomepage.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;

@RemoteServiceRelativePath("GetFriends")
public interface GetFriendsService extends RemoteService {

	public FriendsList friendsList( int userID );
	public FriendsList addFriends(FriendsList e);
}
