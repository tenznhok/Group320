package edu.ycp.cs320.awesomepage.client;

import java.util.ArrayList;
import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;

public interface GetFriendsServiceAsync {

	void friendsList(int userID, AsyncCallback<FriendsList> callback);
	void addFriends(FriendsList e, AsyncCallback<FriendsList> callback);
}
