package edu.ycp.cs320.awesomepage.server.controllers;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public class EditInfoController {
	
	public userInfo editInfo(  ){
		return DatabaseProvider.getInstance().editInfo( );
	}
	public userInfo getUserInfo( int userID ){
		return DatabaseProvider.getInstance().getUserInfo(userID);
	}

}
