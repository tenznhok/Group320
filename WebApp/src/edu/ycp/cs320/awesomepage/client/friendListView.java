package edu.ycp.cs320.awesomepage.client;
import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;
import com.google.gwt.user.client.ui.Image;


public class friendListView extends Composite implements View {
	private Button btnBrowseFriend;
	private Button btnClose;
	private ListBox FriendListBox;
	
	//gets the user from the session
		User user = Session.getInstance().getUser();
		int userID = user.getUserID();
	
	public friendListView() {
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("561px", "536px");
		
		btnBrowseFriend = new Button("Browse Friend");
		btnBrowseFriend.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleBrowseFriend();
			}
		});
		absolutePanel.add(btnBrowseFriend, 371, 173);
		
		
		btnClose = new Button("Close");
		btnClose.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleClose();
			}
		});
		absolutePanel.add(btnClose, 371, 274);
		
		
		FriendListBox = new ListBox();
		absolutePanel.add(FriendListBox, 183, 41);
		FriendListBox.setSize("167px", "263px");
		FriendListBox.setVisibleItemCount(20);
		
		Image image = new Image("happy_three_friends____or_two_by_superaura-d34li8h.png");
		absolutePanel.add(image, 10, 330);
		image.setSize("527px", "169px");
		
		Image image_1 = new Image("my-friends-logo.jpg");
		absolutePanel.add(image_1, 10, 26);
		image_1.setSize("167px", "298px");
		
		Image image_2 = new Image("ASP_Icon.jpg");
		absolutePanel.add(image_2, 376, 41);
		image_2.setSize("104px", "107px");
	}

	private void handleBrowseFriend() {
		// switch to the user's list view
		WebApp.setView(new userListView());
	}
	private void handleClose() {
		// TODO Auto-generated method stub
		WebApp.setView(new webpageView());
	}
	
	@Override
	public void activate() {
		
		RPC.GetFriendsService.friendsList( userID, new AsyncCallback<FriendsList>()  {
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				GWT.log("get user friends LIST RPC call failed");
			}
			@Override
			public void onSuccess(FriendsList result) {
				// TODO Auto-generated method stub
				//for (FriendsList friend : result) {
					//if( friend.getUserID() == userID ){
						//String name = friend.getFriendUserName();
						
						//FriendListBox.insertItem(name, 1);
					//}
			//}
				
				ArrayList<friendName> list = result.getFriendList(userID);
				String name;
				int index;
				for (friendName friend : list) {
					name = friend.getFriendUserName();
					index = friend.getFriendID();
					FriendListBox.insertItem(name,index);
				}
				
			GWT.log("get user friends LIST DONE DID");
			}
		});
	}
}
