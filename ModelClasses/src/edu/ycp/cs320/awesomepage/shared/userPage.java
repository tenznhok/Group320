package edu.ycp.cs320.awesomepage.shared;

public class userPage {
	
	private Wall userWall = new Wall();
	private Status userStatus = new Status();
	private FriendsList usersFriends = new FriendsList();
	
	
	public void upDateStatus( String message ) {
		
		userStatus.setMessage(message);
		
	}
	
	public String getStatus()
	{
		return userWall.getStatus();
	}
}
