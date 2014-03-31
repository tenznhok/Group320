package edu.ycp.cs320.awesomepage.shared;

import java.util.ArrayList;

public class FriendsList {
	private friendName friendName;
	private ArrayList<friendName> listOfFriend = new ArrayList<friendName>();

	public FriendsList(){
		
	}
	
	// add friend into the user's list
	public void addFriend(ArrayList<friendName> friend){
		listOfFriend.addAll(friend);		
	}
	
	//remove friend from the user's list
	public void removeFriend(friendName name){
		ArrayList<friendName> toRemove = new ArrayList<friendName>();
		
			for (int i = 0; i < listOfFriend.size(); i++){
				name = listOfFriend.get(i);
				if (name.equals(getFriendName())){
					toRemove.add(name);
				}//
			}
			
			listOfFriend.removeAll(toRemove);
	}
	
	
	//count how many friends in the list
	public int countFriend(){
		int count; 
		count = listOfFriend.size();
		return count;
	}
	
	

	
	public friendName getFriendName() {
		return friendName;
	}

	public void setFriendName(friendName friendName, String firstName, String lastName ) {
		
		friendName.setFriendFirstName( firstName );
		friendName.setFriendLastName( lastName );
		//this.friendName = friendName;
		
	}

	
}
