package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.core.shared.GWT;

public class RPC {
	public static final LoginServiceAsync loginService =
			GWT.create(LoginService.class);
	
	public static final StatusServiceAsync statusService =
			GWT.create(StatusService.class);
	
	public static final SignUpServiceAsync SignUpService = 
			GWT.create(SignUpService.class);

	public static final EditInfoServiceAsync EditInfoService = 
			GWT.create(EditInfoService.class);

	public static final userListViewServiceAsync userListViewService = 
			GWT.create(userListViewService.class);
	
	public static final GetFriendsServiceAsync GetFriendsService = 
			GWT.create(GetFriendsService.class);
}
