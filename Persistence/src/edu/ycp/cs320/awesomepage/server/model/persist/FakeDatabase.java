package edu.ycp.cs320.awesomepage.server.model.persist;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public class FakeDatabase implements IDatabase {
	private List<User> userList;
	private List<userInfo> userInfoList;
	private List<Status> userStatusList;
	
	
	public FakeDatabase() {
		this.userList = new ArrayList<User>();
		this.userInfoList = new ArrayList<userInfo>();
		this.userStatusList = new ArrayList<Status>();
		
		// add initial user data
		User user = new User();
		user.setEmail("user@ycp.edu");
		user.setPassword("abc123");
		user.setUserID(1);
		user.setUserName("testuser");
		userList.add(user);
		//sets the user info
		userInfoStart( user.getUserID() );
		//sets the user status
		userStatusStart( user.getUserID() );
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
	public User signUp( String userName, String password, String email ){
		User newUser = new User();
		newUser.setEmail( email );
		newUser.setUserName(userName);
		newUser.setPassword(password);
		newUser.setUserID(userList.size()+1);
		userList.add(newUser);
		
		//makes empty user info
		userInfoStart( userList.size()+1 );
		
		return newUser;
	}
	//makes the users empty user info which than can be edited in the edit user info page
	private void userInfoStart(int userID) 
	{
		//new user info
		userInfo newInfo = new userInfo();
		newInfo.setId(userInfoList.size()+1);
		newInfo.setUserId( userID );
		newInfo.setFirstName("Bob");
		newInfo.setLastName("Jim");
		newInfo.setMaleOrFemale(" ");
		newInfo.setCity("York");
		newInfo.setCountry("Moon");
		newInfo.setPhoneNum("1234567899");
		
		userInfoList.add(newInfo);
	}
	private void userStatusStart( int userID ) 
	{
		Status newStatus = new Status();
		
		newStatus.setUserId(userID);
		newStatus.setMessage("Welcome to AwesomePage!!");
		
		userStatusList.add(newStatus);
	}
	@Override
	public User status(User user, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public userInfo editInfo() {
		// TODO Auto-generated method stub
		return null;
	}
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
}
