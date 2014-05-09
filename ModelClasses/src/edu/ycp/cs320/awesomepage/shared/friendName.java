package edu.ycp.cs320.awesomepage.shared;

import java.io.Serializable;

public class friendName implements Serializable {
	private int friendID; // ID of each friend
	private int userID;//the users id of this friend
	//private String friendFirstName;
	//private String friendLastName;
	private String userName;
	
	public friendName() {
		
	}
	
	public friendName( String userName, int friendID ){
		//this.friendFirstName = friendFirstName;
		//this.friendLastName = friendLastName;
		this.userID = friendID;
		this.userName = userName;
	}
	/*
	public String getFriendFirstName() {
		return friendFirstName;
	}
	public void setFriendFirstName(String friendFirstName) {
		this.friendFirstName = friendFirstName;
	}
	public String getFriendLastName() {
		return friendLastName;
	}
	public void setFriendLastName(String friendLastName) {
		this.friendLastName = friendLastName;
	}
	*/
	public int getFriendID() {
		return friendID;
	}
	public void setFriendID(int friendID) {
		this.friendID = friendID;
	}
	public void setFriendUserName( String name ){
		this.userName = name;
	}
	public String getFriendUserName(){
		return this.userName;
	}
	public int getUserID() {
	
		return this.friendID;
	}
	public void setUserID(int userID) {
		
		this.userID = userID;
	}
	public int getFriendUserIDa(){
		return this.userID;
	}
}
