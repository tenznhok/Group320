package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.friendName;

public class FriendNameTest {
	
private friendName userFriend;
	
	@Before
	public void setup(){
		
		userFriend = new friendName( "Jack","Jim" );
		
	}

	@Test
	public void testGetFriendFirstName() {
		
		assertEquals( "Jack",userFriend.getFriendFirstName() );
	}
	
	@Test
	public void testGetFriendLastName(){
		
		assertEquals( "Jim",userFriend.getFriendLastName() );
	}

}
