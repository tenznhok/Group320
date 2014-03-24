package edu.ycp.cs320.awesomepage.shared;

public class friendName {
	private int friendID; // ID of each friend
	private String friendFirstName;
	private String friendLastName;
	
	public friendName(String friendFirstName, String friendLastName, int friendID){
		this.friendFirstName = friendFirstName;
		this.friendLastName = friendLastName;
		this.friendID = friendID;
	}
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
	public int getFriendID() {
		return friendID;
	}
	public void setFriendID(int friendID) {
		this.friendID = friendID;
	}
}
