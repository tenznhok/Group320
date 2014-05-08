package edu.ycp.cs320.awesomepage.server.model.persist;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public class FakeDatabase implements IDatabase {
	private ArrayList<User> userList;
	private List<userInfo> userInfoList;
	private List<Status> userStatusList;
	
	private ArrayList<FriendsList> friendsList;
	
	public FakeDatabase() {
		this.userList = new ArrayList<User>();
		this.userInfoList = new ArrayList<userInfo>();
		this.userStatusList = new ArrayList<Status>();
		this.friendsList = new ArrayList<FriendsList>();
		
		// add initial user data
		User user = new User();
		user.setEmail("user@ycp.edu");
		user.setPassword("abc123");
		user.setUserID( 0 );
		user.setUserName("testuser");
		userList.add(user);
		//sets the user info
		userInfoStart( 0, "first", "last", "user@ycp.edu" );
		//sets the user status
		userStatusStart( 0 );
		//sets the user friendsList
		userFriendsListStart( 0 );
	}
	@Override
	public User login(String username, String password) {	
		// TODO Auto-generated method stub
		for (User user : userList) {
			if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	//sign up page, will add new user to database
	@Override 
	public User signUp( String userName, String password, String firstName, String lastName, String eMail ){
		int id = userList.size()+1;
		User newUser = new User();
		newUser.setEmail( eMail );
		newUser.setUserName(userName);
		newUser.setPassword(password);
		newUser.setUserID( id );
		userList.add(newUser);
		
		//makes user info
		userInfoStart( id, firstName, lastName, eMail );
		//makes the first user status
		userStatusStart( id );
		//sets the user friendsList
		userFriendsListStart( id );
		
		return newUser;
	}
	//makes the users empty user info which than can be edited in the edit user info page
	private void userInfoStart(int userID, String firstName, String lastName, String eMail) 
	{
		//new user info
		userInfo newInfo = new userInfo();
		newInfo.setId( userInfoList.size()+1 );
		newInfo.setUserId( userID );
		newInfo.setFirstName(firstName);
		newInfo.setLastName(lastName);
		newInfo.setEmailContact(eMail);
		newInfo.setMaleOrFemale(" ");
		newInfo.setCity("York");
		newInfo.setCountry("Moon");
		newInfo.setPhoneNum("1234567899");
		
		userInfoList.add(newInfo);
	}
	//make the list for your friends
	private void userFriendsListStart( int userID ){
		FriendsList newList = new FriendsList();
		newList.setUserID(userID);
		newList.setID( friendsList.size()+1 );
		newList.addFriend( userList.get(0) );
		friendsList.add(newList);
	}
	private void userStatusStart( int userID ) 
	{
		Status newStatus = new Status();
		
		newStatus.setId(userStatusList.size()+1);
		newStatus.setUserId(userID);
		newStatus.setMessage("Welcome to AwesomePage!!");
		
		userStatusList.add(newStatus);
	}
	//will get the users status
	@Override
	public String status( int id ) {
		// TODO Auto-generated method stub
		for (Status status : userStatusList) {
			if( status.getUserId() == id )
			{
				return status.getMessage();
			}
		}
		return "error";
	}
	//will post a new status
	@Override
	public Status postStatus(int id, String newStatus){
		
		for (Status status : userStatusList) {
			if( status.getUserId() == id )
			{
				status.setMessage(newStatus);
			}
		}
		return null;
	}
	@Override
	public userInfo editInfo( int id, String firstName, String lastName, String eMail, String mf, String phone, String country, String city ) {
		
		for (userInfo info : userInfoList) {
			if( info.getUserId() == id )
			{
				info.setFirstName(firstName);
				info.setLastName(lastName);
				info.setEmailContact(eMail);
				info.setMaleOrFemale(mf);
				info.setPhoneNum(phone);
				info.setCountry(country);
				info.setCity(city);
				return info;
			}
		}
		//if count find userInfo will return null
		return null;
	}
	@Override
	public userInfo getUserInfo( int id )
	{
		for (userInfo info : userInfoList) {
			if( info.getUserId() == id )
			{
				return info;
			}
		}
		return null;
	}
	@Override
	public ArrayList<User> getAllUsers()
	{
		return userList;
	}
	//will get the users friend list
	/*@Override
	public FriendsList getAllFriends( int userID ) {
		
		for( FriendsList f : friendsList ){
			if( f.getUserID() == userID ){
				return f;
			}
		}
		return null;*/
	}
/*	@Override
	public void addFriends(  int userID, User f ) {
		for( FriendsList friend : friendsList )
		{
			if( friend.getUserID() == userID )
			{
				friend.addFriend(f);
			}
		}

}*/

