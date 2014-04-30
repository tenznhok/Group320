package edu.ycp.cs320.awesomepage.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.awesomepage.client.EditInfoService;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;
import edu.ycp.cs320.awesomepage.server.controllers.EditInfoController;

public class EditInfoServiceImpl extends RemoteServiceServlet implements EditInfoService {

	@Override
	public userInfo getUserInfo(int userID) {
		// TODO Auto-generated method stub
		EditInfoController controller = new EditInfoController();
		userInfo result = controller.getUserInfo(userID);
		return result;
	}
	@Override
	public userInfo editInfo(int id, String firstName, String lastName,
			String eMail, String mf, String phone, String country, String city) {
		
		EditInfoController controller = new EditInfoController();
		userInfo result = controller.editInfo(id, firstName, lastName, eMail, mf, phone, country, city);
		
		return result;
	}

}
