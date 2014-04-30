package edu.ycp.cs320.awesomepage.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.awesomepage.shared.User;

@RemoteServiceRelativePath("GetFriends")
public interface GetFriendsService extends RemoteService {

	public List<User> user();

}
