package edu.ycp.cs320.awesomepage.server.controllers;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.server.model.persist.FakeDatabase;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.Status;
import static org.junit.Assert.*;

public class StatusControllerTest {
	
	@Before
	public void setUp() {
		DatabaseProvider.setInstance(new FakeDatabase());
	}
	//will test login just to make shore it still works
	@Test
	public void testLogin() {
		//gets the user
		LoginController controller = new LoginController();
		User user = controller.login("testuser", "abc123");
		assertNotNull(user);
		assertEquals("testuser", user.getUserName());
	} 
	@Test
	public void testStatus(){
		//gets the user and status info
		LoginController controllerLogin = new LoginController();
		User user = controllerLogin.login("testuser", "abc123");
		//will get the user status
		String status = "I like the color blue!";
		statusController controllerStatus = new statusController();
		controllerStatus.postStatus( user.getUserID(), status );
		assertEquals( status, controllerStatus.status( user.getUserID() ) );
	}

}
