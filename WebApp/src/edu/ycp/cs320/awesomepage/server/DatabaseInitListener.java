package edu.ycp.cs320.awesomepage.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.server.model.persist.FakeDatabase;

public class DatabaseInitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent e) {
		// Webapp is starting
		DatabaseProvider.setInstance(new FakeDatabase()); // TODO: use real database
		System.out.println("Database initialized!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent e) {
		// Webapp is shutting down

	}

}
