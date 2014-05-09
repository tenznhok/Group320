package edu.ycp.cs320.awesomepage.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FriendsList implements Serializable  {
	private int userID;
	private int id;
	private ArrayList<friendName> list = new ArrayList<friendName>();

	public FriendsList(  ){
		
	}
	public int getUserID(){
		return userID;
	}
	public void seUserID(int userID){
		this.userID = userID;
	}
	public void setID( int id ){
		this.id = id;
	}
	public int getID(){
		return id;
	}
	//count how many friends in the list
	public int countFriend(){
		int count = list.size();
		
		return count;
	}
	public ArrayList<friendName> getFriendList( int userID )
	{
		return this.list;
	}
	public String getFriendName( int id )
	{
		String name = list.get(id).getFriendUserName();
		return name;
	}
	public void addFriend( String name ) 
	{
		friendName newFriend = new friendName( );
		newFriend.setFriendUserName(name);
		newFriend.setFriendID(list.size()+1);
		list.add( newFriend );
	}
	public void removeFriend(friendName name)
	{
		for (friendName f : list) {
			if ( f.getFriendUserName() == name.getFriendUserName() ) {
				list.remove(f);
				list.clear();
			}
		}
	}
	public ArrayList<friendName> getFriendsList(){
		return this.list;
	}
}
