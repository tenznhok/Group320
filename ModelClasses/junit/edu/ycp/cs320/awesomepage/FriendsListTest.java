package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.friendName;

public class FriendsListTest {
	
	//private friendName userFriend1, userFriend2, userFriend3, userFriend4;
	private ArrayList<friendName> listOfFriend = new ArrayList<friendName>();
	private FriendsList list = new FriendsList();

	friendName name1 = new friendName("Jack", "First", 1);	
	friendName name2 = new friendName ("Harry", "Potter", 2);
	friendName name3 = new friendName ("Ron", "Westley", 3);
	
// add friends	
	
	@Test
	public void testAddFriend() {
		listOfFriend.add(name1);
		listOfFriend.add(name2);
		listOfFriend.add(name3);
		list.addFriend(listOfFriend);
	
	listOfFriend.get(1).equals("Jack");
	listOfFriend.get(2).getFriendFirstName().equals("Harry");
	assertEquals(3,list.countFriend());		
	}
	@Test
	public void testRemoveFriend(){
		listOfFriend.add(name1);
		listOfFriend.add(name2);
		listOfFriend.add(name3);
		list.addFriend(listOfFriend);

		listOfFriend.remove(name2);
		
		assertFalse("Jack", listOfFriend.contains("Jack"));
		assertFalse("Harry", listOfFriend.equals(name2));
		assertEquals(2,listOfFriend.size());
	}
	@Test
	public void testSetFriendName() {
		listOfFriend.add(name1);
		listOfFriend.add(name2);
		listOfFriend.add(name3);
		
		//list.setFriendName(name3);
		
		list.setFriendName(name3, "Michael", "NotMe");
		
		assertEquals( "Michael", listOfFriend.get(2).getFriendFirstName() );
		assertEquals( "NotMe", listOfFriend.get(2).getFriendLastName() );	
	}
}
