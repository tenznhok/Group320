package edu.ycp.cs320.awesomepage.server.model.persist;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public class FakeDatabase implements IDatabase {
	private List<User> userList;
	private List<userInfo> userInfoList;
	
	
	public FakeDatabase() {
		this.userList = new ArrayList<User>();
		this.userInfoList = new ArrayList<userInfo>();
		
		// add initial user data
		User user = new User();
		user.setEmail("user@ycp.edu");
		user.setPassword("abc123");
		user.setUserID(1);
		user.setUserName("testuser");
		userList.add(user);
		userInfoStart( user.getUserID() );
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
		userInfoStart( newUser.getUserID() );
		
		return newUser;
	}
	//makes the users empty user info which than can be edited in the edit user info page
	private void userInfoStart(int userID) 
	{
		userInfo newInfo = new userInfo();
		newInfo.setId(userInfoList.size()+1);
		newInfo.setUserId( userID );
		newInfo.setFirstName(null);
		newInfo.setLastName(null);
		newInfo.setMaleOrFemale(null);
		newInfo.setCity(null);
		newInfo.setCountry(null);
		newInfo.setPhoneNum(null);
		
		userInfoList.add(newInfo);
	}
	//@Override
	//public userInfo editInfo( int userID )
	//{
		
	//}
	@Override
	public User status(User user, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
