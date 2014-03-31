package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;

public class StatusTest {
	
	private Status status = new Status();
	private String message = "skool is fun!!";

	@Before
	public void setup(){
		
		status.setId(51);
		status.setUserId(135);
		status.setMessage(message);
	}

	@Test
	public void testGetUserID() {
		assertEquals( 135, status.getUserId() );
	}
	
	@Test
	public void testGetID() {
		assertEquals( 51, status.getId() );
	}
	
	@Test
	public void testGetMessage() {
		assertEquals( message, status.getMessage() );
	}
}
