package edu.ycp.cs320.awesomepage.server.model.persist;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.awesomepage.shared.User;

public class FakeDatabase implements IDatabase {
	private List<User> userList;
	
	
	public FakeDatabase() {
		this.userList = new ArrayList<User>();
		
		// add initial user data
		User user = new User();
		user.setEmail("user@ycp.edu");
		user.setPassword("abc123");
		user.setUserID(1);
		user.setUserName("testuser");
		userList.add(user);
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

}
