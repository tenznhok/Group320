package edu.ycp.cs320.awesomepage.server.model.persist;

import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public interface IDatabase {
	public User login(String username, String password);
	public User signUp( String username, String password, String email );
	public User status(User user, String password);
	public userInfo editInfo();
	public userInfo getUserInfo( int userID );
}
