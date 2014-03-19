package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.User;

public class UserTest {
	
	private User person;
	
	@Before
	public void setup(){
		
		person = new User();
		person.setUserName("Jim");
		person.setPassword("Apple");
		person.setEmail("email@mail.com");
		
	}

	@Test
	public void testGetName() {
		
		assertEquals( "Jim", person.getUserName() );
	}
	
	@Test
	public void testGetPassword() {
		
		assertEquals( "Apple", person.getPassword() );
	}
	
	@Test
	public void testEmail(){
		
		assertEquals( "email@mail.com", person.getEmail() );
	}
}
