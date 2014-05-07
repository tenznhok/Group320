package edu.ycp.cs320.awesomepage.shared;

public class friendName {
	private int friendID; // ID of each friend
	//private String friendFirstName;
	//private String friendLastName;
	private String userName;
	
	public friendName(/*String friendFirstName, String friendLastName, int friendID*/ String userName){
		//this.friendFirstName = friendFirstName;
		//this.friendLastName = friendLastName;
		//this.friendID = friendID;
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
}
