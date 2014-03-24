package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.friendName;

public class FriendNameTest {
	
private friendName userFriend;
	
	@Before
	public void setup(){
		
		userFriend = new friendName( "Jack","Jim", 159 );
		
	}

	@Test
	public void testGetFriendFirstName() {
		
		assertEquals( "Jack",userFriend.getFriendFirstName() );
	}
	
	@Test
	public void testGetFriendLastName(){
		
		assertEquals( "Jim",userFriend.getFriendLastName() );
	}
	
	@Test
	public void testGetFriendID(){
		
		assertEquals( 159,userFriend.getFriendID() );
	}

}
