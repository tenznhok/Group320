package edu.ycp.cs320.awesomepage.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;

public interface GetFriendsServiceAsync {

	//void addFriends(int userID, User f, AsyncCallback<FriendsList> callback);

	void friendsList(int userID, AsyncCallback<ArrayList<friendName>> asyncCallback);
}
