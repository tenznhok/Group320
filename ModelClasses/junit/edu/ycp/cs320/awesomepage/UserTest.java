package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.User;

public class UserTest {
	
	private User person1;
	private User person2, person3;
	
	@Before
	public void setup(){
		
		person1 = new User( "Jim", "Apple" );
		person2 = new User("Fish","tkendk222");
		person3 = new User("Bob","dog");
		
		person3.setUserName("Bill");
		
		
		
	}

	@Test
	public void testGetName() {
		
		assertEquals( "Jim", person1.getUserName() );
		assertEquals( "Fish", person2.getUserName() );
		assertEquals( "Bill", person3.getUserName() );
		
	}
	@Test
	public void testGetPassword() {
		
		assertEquals( "Apple", person1.getPassword() );
		assertEquals( "tkendk222", person2.getPassword() );
		assertEquals( "dog", person3.getPassword() );
		
	}


}
