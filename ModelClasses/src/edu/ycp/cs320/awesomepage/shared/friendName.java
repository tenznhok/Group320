package edu.ycp.cs320.awesomepage.shared;

public class friendName {
	private String friendFirstName;
	private String friendLastName;
	
	public friendName(String friendFirstName, String friendLastName){
		this.friendFirstName = friendFirstName;
		this.friendLastName = friendLastName;
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
	
}
