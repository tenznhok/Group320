package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.friendName;

public class FriendNameTest {
	
private friendName userFriend, userFriend2;
	
	@Before
	public void setup(){
		
		userFriend = new friendName( "Jack", 0 );
		userFriend2 = new friendName(" ", 1);
		//userFriend2.setFriendFirstName("Bob");
		//userFriend2.setFriendLastName("Green");
		userFriend2.setFriendID(123);
		
	}

	/*@Test
	public void testGetFriendFirstName() {
		
		assertEquals( "Jack",userFriend.getFriendFirstName() );
		assertEquals( "Bob",userFriend2.getFriendFirstName() );
	}
	
	@Test
	public void testGetFriendLastName(){
		
		assertEquals( "Jim",userFriend.getFriendLastName() );
		assertEquals( "Green",userFriend2.getFriendLastName() );
	}
	*/
	@Test
	public void testGetFriendID(){
		
		assertEquals( 0,userFriend.getFriendID() );
		assertEquals( 123,userFriend2.getFriendID() );
	}

}
