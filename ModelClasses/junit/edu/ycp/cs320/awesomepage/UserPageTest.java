package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.Wall;
import edu.ycp.cs320.awesomepage.shared.friendName;
import edu.ycp.cs320.awesomepage.shared.userPage;

public class UserPageTest {
	
	private userPage page;
	private String message = "I had a hole pie for lunch!";
	
	private ArrayList<friendName> listOfFriend = new ArrayList<friendName>();
	private FriendsList list = new FriendsList();	
	friendName name = new friendName ("Harry");

	@Before
	public void setup(){
		
		page = new userPage();
		page.upDateStatus( message );
		
		listOfFriend.add(name);
		//list.addFriend(listOfFriend);
	}

	@Test
	public void testGetStatus() 
	{
		assertEquals( message, page.getStatus() );		
	}
	/*@Test
	public void testGetFriendsName()
	{
		assertEquals( name, page.upDateStatus(message) );
	}*/
}
