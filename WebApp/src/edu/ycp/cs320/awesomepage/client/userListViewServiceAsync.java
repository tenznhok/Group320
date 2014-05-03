package edu.ycp.cs320.awesomepage.client;

import java.util.ArrayList;
import com.google.gwt.user.client.rpc.AsyncCallback;
import edu.ycp.cs320.awesomepage.shared.User;

public interface userListViewServiceAsync {
	
	void user(AsyncCallback<ArrayList<User>> callback);
}
