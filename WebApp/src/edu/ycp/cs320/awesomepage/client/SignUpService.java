package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.awesomepage.shared.User;


@RemoteServiceRelativePath("sign_up")
public interface SignUpService extends RemoteService{
	public User signUp(String username, String password, String email);
}
