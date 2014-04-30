package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;

@RemoteServiceRelativePath("editInfo")
public interface EditInfoService extends RemoteService{
	
	public userInfo editInfo( int id, String firstName, String lastName, String eMail, String mf, String phone, String country, String city );
	public userInfo getUserInfo(int userID);
}
