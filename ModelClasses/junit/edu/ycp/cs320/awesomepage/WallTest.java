package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.Wall;

public class WallTest {
	
	private Wall userWall;
	
	@Before
	public void setup(){
		
		userWall = new Wall();
		userWall.setStatus("I am at Home!!");
		
	}

	@Test
	public void testWallStatus() {
		
		assertEquals( "I am at Home!!", userWall.getStatus() );
	}

}
