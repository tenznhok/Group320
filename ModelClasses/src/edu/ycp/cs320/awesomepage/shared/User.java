package edu.ycp.cs320.awesomepage.shared;

import java.io.Serializable;

public class User implements Serializable {
	private int userID;
	private String userName;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail( String email ) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
}
