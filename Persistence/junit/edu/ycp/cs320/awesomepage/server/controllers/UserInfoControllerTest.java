package edu.ycp.cs320.awesomepage.server.controllers;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.server.model.persist.FakeDatabase;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;
import static org.junit.Assert.*;

public class UserInfoControllerTest {


	
	@Before
	public void setUp() {
		DatabaseProvider.setInstance(new FakeDatabase());
	}
	//will test login
	@Test
	public void testLogin() {
		//gets the user
		LoginController controller = new LoginController();
		User user = controller.login("testuser", "abc123");
		assertNotNull(user);
		assertEquals("testuser", user.getUserName());
	}
	//will test the edit info
	@Test
	public void testEditInfo(){
		//gets the user
		LoginController controller = new LoginController();
		User user = controller.login("testuser", "abc123");
		//gets the user into
		//the edit info also works for getting the info
		EditInfoController controllerInfo = new EditInfoController();
		userInfo info = controllerInfo.getUserInfo(user.getUserID());
		//will set the info
		String firstName = "first", lastName = "last", mF = "Male", country = "Orange", city = "Brown", emailContact = "email@email.com", phoneNum = "5555555555";
		info.editInfo(firstName, lastName, emailContact, mF, phoneNum, country, city);
		//will check the info
		assertNotNull(info);
		assertEquals( firstName, info.getFirstName() );
		assertEquals( lastName, info.getLastName() );
		assertEquals( mF, info.getMaleOrFemale() );
		assertEquals( country, info.getCountry() );
		assertEquals( city, info.getCity() );
		assertEquals( emailContact, info.getEmailContact() );
		assertEquals( phoneNum, info.getPhoneNum() );
	}
}
