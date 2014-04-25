package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.ui.IsWidget;

public interface View extends IsWidget {
	/**
	 * This must be called once a view has been shown.
	 * It gives the view the opportunity to load data
	 * from the server via RPC.
	 */
	public void activate();
}
