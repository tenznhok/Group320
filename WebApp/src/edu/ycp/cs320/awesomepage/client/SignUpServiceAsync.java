package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.awesomepage.shared.User;


public interface SignUpServiceAsync {
	void signUp(String username, String password, AsyncCallback<User> callback);
}
