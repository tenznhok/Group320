package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.awesomepage.shared.User;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	/**
	 * Check to see if given username/password identifies a known user.
	 * If so, return the {@link User} object for that user.
	 * If not, return null.
	 * 
	 * @param username a username
	 * @param password a password
	 * @return the {@link User} object, or null if there is no such username/password
	 *         combination
	 */
	public User logIn(String username, String password);

}
