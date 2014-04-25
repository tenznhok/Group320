package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public interface EditInfoServiceAsync {
	void editInfo( AsyncCallback<userInfo> callback);
	void getUserInfo(int userID, AsyncCallback<userInfo> asyncCallback);
}
