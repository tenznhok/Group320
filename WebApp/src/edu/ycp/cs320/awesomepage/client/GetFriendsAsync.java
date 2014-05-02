package edu.ycp.cs320.awesomepage.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.awesomepage.shared.User;

public interface GetFriendsAsync {

	void user(AsyncCallback<User> asyncCallback);
	
}
