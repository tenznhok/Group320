package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.friendName;

public class FriendsListTest {
	
	private FriendsList friends;
	//private friendName userFriend1, userFriend2, userFriend3, userFriend4;
	private friendName userFriend[];
	
	@Before
	public void setUp(){
		
		
		userFriend[1] = new friendName( "Jack","Jim", 159 );
		userFriend[2] = new friendName( "Bill","Pie", 160 );
		userFriend[3] = new friendName( "Yellow","Bird", 161 );
		userFriend[4] = new friendName( "Tom","Five", 162 );
		
		friends = new FriendsList();
		
		friends.addFriend(userFriend);
	}

	@Test
	public void test() {
		
	}

}
