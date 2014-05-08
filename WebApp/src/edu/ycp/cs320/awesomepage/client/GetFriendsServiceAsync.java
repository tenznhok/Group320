package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;

public interface GetFriendsServiceAsync {

	void friendsList(int userID, AsyncCallback<FriendsList> callback);
	//void addFriends(int userID, User f, AsyncCallback<FriendsList> callback);
}
