package edu.ycp.cs320.awesomepage.server.model.persist;

import java.util.ArrayList;
import java.util.List;
import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public class FakeDatabase implements IDatabase {
	private ArrayList<User> userList;//list of all the users
	private List<userInfo> userInfoList;//a list for evey users info
	private List<Status> userStatusList;//a list for every users status
	private ArrayList<friendName> friendsList;//list of friends names
	private ArrayList<FriendsList> userFriendsList;//a list of the list of friends names to be the users friend list
	
	public FakeDatabase() {
		this.userList = new ArrayList<User>();
		this.userInfoList = new ArrayList<userInfo>();
		this.userStatusList = new ArrayList<Status>();
		//this.friendsList = new ArrayList<friendName>();
		userFriendsList = new ArrayList<FriendsList>();
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
		//make us users
		signUp("mike","mike","mike","C","mike@ycp.edu");
		signUp("lou","lou","lou","T","lou@ycp.edu");
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
	private void userInfoStart(int userID, String firstName, String lastName, String eMail) {
		//new user info
		userInfo newInfo = new userInfo();
		newInfo.setId( userInfoList.size()+1 );
		newInfo.setUserId( userID );
		newInfo.setFirstName(firstName);
		newInfo.setLastName(lastName);
		newInfo.setEmailContact(eMail);
		newInfo.setMaleOrFemale(" ");
		newInfo.setCity(" ");
		newInfo.setCountry(" ");
		newInfo.setPhoneNum(" ");
		userInfoList.add(newInfo);
	}
	//make the list for your friends
	private void userFriendsListStart( int userID ){
		FriendsList friends = new FriendsList( );
		friends.seUserID(userID);
		userFriendsList.add(friends);
	}
	//make the users start up status
	private void userStatusStart( int userID ) {
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
			if( status.getUserId() == id ){
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
	//to edit the users info
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
		return null;
	}
	//will get all the users in the database
	@Override
	public ArrayList<User> getAllUsers(){
		return userList;
	}
	//will return the current users friendslist
	//which will be found by the users id
	@Override
	public FriendsList friendsList( int userID ) {
		for( FriendsList list : userFriendsList )
		{
			if( list.getUserID() == userID )
			{
				return list;
			}
		}
		return null;
	}
	//will add friends to the users list
	@Override
	public friendName addFriend(int userID, String friendName) {
		for( FriendsList list : userFriendsList )
		{
			if( list.getUserID() == userID )
			{
				list.addFriend(friendName);
			}
		}
		friendName newFriend = new friendName( friendName, userID );
		newFriend.setFriendID(friendsList.size()+1);
		friendsList.add(newFriend);
		return null;
	}
	//will get the users info from the user info list
	//which will be found by the users id
	@Override
	public userInfo getUserInfo(int userID) {
		for (userInfo info : userInfoList) {
			if( info.getUserId() == userID )
			{
				return info;
			}
			
		}
		return null;
	}
	//all of the friends list
	@Override
	public ArrayList<friendName> getAllFriends() {
		return friendsList;
	}
}

