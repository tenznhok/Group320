package edu.ycp.cs320.awesomepage.shared;

import java.io.Serializable;

public class friendName implements Serializable {
	private int friendID; // ID of each friend
	private String userName;
	public friendName(){

	}
	
	public friendName( String userName, int friendID ){
		this.friendID = friendID;
		this.userName = userName;
	}
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
}
