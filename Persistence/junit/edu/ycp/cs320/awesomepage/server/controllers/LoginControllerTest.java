package edu.ycp.cs320.awesomepage.server.controllers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.server.model.persist.FakeDatabase;
import edu.ycp.cs320.awesomepage.shared.User;

public class LoginControllerTest {
	@Before
	public void setUp() {
		DatabaseProvider.setInstance(new FakeDatabase());
	}
	
	@Test
	public void testLogin() {
		LoginController controller = new LoginController();
		User user = controller.login("testuser", "abc123");
		assertNotNull(user);
		assertEquals("testuser", user.getUserName());
		
	}
}
