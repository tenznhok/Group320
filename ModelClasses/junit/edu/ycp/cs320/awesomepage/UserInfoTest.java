package edu.ycp.cs320.awesomepage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.shared.userInfo;

public class UserInfoTest {
	
	private userInfo info;
	
	@Before
	public void setup(){
		
		info = new userInfo();
		
		info.setFirstName("Michael");
		info.setLastName("NotMe");
		info.setCity("York");
		info.setMaleOrFemale("Male");
		info.setEmailContact("email@mail.com");
		info.setCountry("TheMoon");
		info.setPhoneNum("123-456-7899");
		info.setId(12345);
	}
	
	@Test
	public void testGetFirstName() {
		
		assertEquals( "Michael", info.getFirstName() );
	}
	
	@Test
	public void testGetLastName() {
		
		assertEquals( "NotMe", info.getLastName() );
	}
	
	@Test
	public void testGetCity() {
		
		assertEquals( "York", info.getCity() );
	}
	
	@Test
	public void testGetMorF() {
		
		assertEquals( "Male", info.getMaleOrFemale() );
	}
	
	@Test
	public void testGetEmail() {
		
		assertEquals( "email@mail.com", info.getEmailContact() );
	}
	
	@Test
	public void testGetCountry() {
		
		assertEquals( "TheMoon", info.getCountry() );
	}
	
	@Test
	public void testGetPhoneNum() {
		
		assertEquals( "123-456-7899", info.getPhoneNum() );
	}
	
	@Test
	public void testGetID() {
		
		assertEquals( 12345, info.getId() );
	}
	
	@Test
	public void testEditInfo() {
		
		info.editInfo( "Bill", "Jim", "Email@Email.com", "Female", "987-987-9563", "TheSun", "York");
		
		assertEquals( "Bill", info.getFirstName() );
		assertEquals( "Jim", info.getLastName() );
		assertEquals( "York", info.getCity() );
		assertEquals( "Email@Email.com", info.getEmailContact() );
		assertEquals( "Female", info.getMaleOrFemale() );
		assertEquals( "987-987-9563", info.getPhoneNum() );
		assertEquals( "TheSun", info.getCountry() );
	}
}
