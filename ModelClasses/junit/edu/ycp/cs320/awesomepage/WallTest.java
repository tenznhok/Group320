package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.Wall;

public class WallTest {
	
	private Wall userWall;
	private int ID = 987, userID = 456;
	
	@Before
	public void setup(){
		
		userWall = new Wall();
		userWall.setStatus("I am at Home!!");
		userWall.setId(ID);
		userWall.setUserId(userID);
		
	}

	@Test
	public void testWallStatus() {
		
		assertEquals( "I am at Home!!", userWall.getStatus() );
	}
	@Test
	public void testGetId() {
		
		assertEquals( ID, userWall.getId() );
	}
	@Test
	public void testGetUserId() {
		
		assertEquals( userID, userWall.getUserId() );
	}

}
