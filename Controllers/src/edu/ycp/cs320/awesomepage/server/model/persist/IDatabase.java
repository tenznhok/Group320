package edu.ycp.cs320.awesomepage.server.model.persist;

import java.util.ArrayList;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public interface IDatabase {
	public User login(String username, String password);
	public User signUp( String username, String password, String firstName, String lastName, String email );
	public String status(int id);
	public Status postStatus(int id, String newStatus);
	public userInfo getUserInfo( int userID );
	public userInfo editInfo(int id, String firstName, String lastName, String eMail, String mf, String phone, String country, String city);
	public ArrayList<User> getAllUsers();
	
	public friendName addFriend(int userID, String friendName);
	public FriendsList friendsList(int userID);
	ArrayList<friendName> getAllFriends();
}
