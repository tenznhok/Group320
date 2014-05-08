package edu.ycp.cs320.awesomepage.shared;

import java.util.ArrayList;
import java.util.List;

public class FriendsList {
	private int userID;
	private int id;
	//private friendName friendName;
	//private ArrayList<friendName> listOfFriend = new ArrayList<friendName>();
	private List<friendName> list;

	public FriendsList(){
		this.list = new ArrayList<friendName>();
	}
	
	public void setUserID( int id ){
		this.userID = id;
	}
	public int getUserID(){
		return userID;
	}
	public void setID( int id ){
		this.id = id;
	}
	public int getID(){
		return id;
	}
	/*
	// add friend into the user's list
	public void addFriend( ArrayList<friendName> listOfFriend ){
		friendName newFriend = new friendName( listOfFriend.getUserName() );
		newFriend.setFriendID( list.size()+1 );
		list.add(newFriend);
	}
	*/
	//remove friend from the user's list
	public void removeFriend(String name){
		for (friendName f : list) {
			if ( f.getFriendUserName() == name ) {
				list.remove(f);
			}
		}
		
		
		/*
		ArrayList<friendName> toRemove = new ArrayList<friendName>();
		
			for (int i = 0; i < listOfFriend.size(); i++){
				name = listOfFriend.get(i);
				if (name.equals(getFriendName())){
					toRemove.add(name);
				}//
			}
			
			listOfFriend.removeAll(toRemove);
			*/
	}
	
	
	//count how many friends in the list
	public int countFriend(){
		//int count; 
		//count = listOfFriend.size();
		
		int count = list.size();
		
		return count;
	}
	public List<friendName> getFriendList(){
		return this.list;
	}
	public String getFriendName( int id ){
		String name = list.get(id).getFriendUserName();
		return name;
	}
	
	

	/*
	public friendName getFriendName() {
		return friendName;
	}

	public void setFriendName(friendName friendName, String firstName, String lastName ) {
		
		friendName.setFriendFirstName( firstName );
		friendName.setFriendLastName( lastName );
		//this.friendName = friendName;
		
	}
*/
	
}
