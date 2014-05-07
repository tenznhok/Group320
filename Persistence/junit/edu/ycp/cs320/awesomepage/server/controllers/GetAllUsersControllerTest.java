package edu.ycp.cs320.awesomepage.server.controllers;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.server.model.persist.FakeDatabase;
import edu.ycp.cs320.awesomepage.shared.User;
import static org.junit.Assert.*;

public class GetAllUsersControllerTest {

	@Before
	public void setUp() {
		DatabaseProvider.setInstance(new FakeDatabase());
	}
	@Test
	public void GetAllUsers() {
		
	} 
}
