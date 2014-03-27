package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.Wall;
import edu.ycp.cs320.awesomepage.shared.userPage;

public class UserPageTest {
	
	private userPage page;
	
	
	@Before
	public void setup(){
		
		page = new userPage();
		page.upDateStatus( "I had a hole pie for lunch!" );
		
	}

	@Test
	public void testGetStatus() 
	{
		assertEquals( "I had a hole pie for lunch!", page.getStatus() );		
	}
}
