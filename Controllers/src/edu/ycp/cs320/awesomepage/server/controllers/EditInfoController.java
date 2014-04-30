package edu.ycp.cs320.awesomepage.server.controllers;

import edu.ycp.cs320.awesomepage.server.model.persist.DatabaseProvider;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public class EditInfoController {
	
	public userInfo editInfo( int id, String firstName, String lastName, String eMail, String mf, String phone, String country, String city ){
		return DatabaseProvider.getInstance().editInfo( id, firstName, lastName, eMail, mf, phone, country, city );
	}
	public userInfo getUserInfo( int userID ){
		return DatabaseProvider.getInstance().getUserInfo(userID);
	}

}
