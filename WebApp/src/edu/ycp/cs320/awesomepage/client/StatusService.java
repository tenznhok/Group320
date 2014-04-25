package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;

@RemoteServiceRelativePath("status")
public interface StatusService extends RemoteService {
	//public void postStatus(User user, String status);
	public String postStatus(User user, String status);
	
	public String getStatusesForUser(User user);
}
