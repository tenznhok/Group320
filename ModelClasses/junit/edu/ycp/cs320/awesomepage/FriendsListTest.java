package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;

public class FriendsListTest {
	
	//private friendName userFriend1, userFriend2, userFriend3, userFriend4;
	private ArrayList<friendName> listOfFriend = new ArrayList<friendName>();
	private FriendsList list = new FriendsList();
	User f = new User();
	friendName name1 = new friendName("Jack", 0);	
	friendName name2 = new friendName ("Harry", 1);
	friendName name3 = new friendName ("Ron", 2 );
	
// add friends	
	
	@Test
	public void testAddFriend() {
		listOfFriend.add(name1);
		listOfFriend.add(name2);
		listOfFriend.add(name3);
		f.setUserName("AB");
		
		
	
	listOfFriend.get(0).equals("Jack");
	listOfFriend.get(1).getFriendUserName().equals("Harry");	
	}
	@Test
	public void testRemoveFriend(){
		listOfFriend.add(name1);
		listOfFriend.add(name2);
		listOfFriend.add(name3);
		

		listOfFriend.remove(name2);
		
		assertFalse("Jack", listOfFriend.contains("Jack"));
		assertFalse("Harry", listOfFriend.equals(name2));
		assertEquals(2,listOfFriend.size());
	}
	
}
