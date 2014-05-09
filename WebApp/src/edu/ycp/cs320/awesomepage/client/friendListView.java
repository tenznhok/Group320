package edu.ycp.cs320.awesomepage.client;
import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;


public class friendListView extends Composite implements View {
	private Button btnBrowseFriend;
	private Button btnRemoveFriend;
	private LayoutPanel layoutPanel;
	private Button btnClose;
	private ListBox FriendListBox;
	
	//gets the user from the session
		User user = Session.getInstance().getUser();
		int userID = user.getUserID();
	
	public friendListView() {
		
		layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		btnBrowseFriend = new Button("Browse Friend");
		btnBrowseFriend.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleBrowseFriend();
			}
		});
		layoutPanel.add(btnBrowseFriend);
		layoutPanel.setWidgetLeftWidth(btnBrowseFriend, 271.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnBrowseFriend, 47.0, Unit.PX, 30.0, Unit.PX);
		
		btnRemoveFriend = new Button("Remove Friend");
		btnRemoveFriend.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleRemoveFriend();
			}
					});
		layoutPanel.add(btnRemoveFriend);
		layoutPanel.setWidgetLeftWidth(btnRemoveFriend, 271.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnRemoveFriend, 103.0, Unit.PX, 30.0, Unit.PX);
		
		btnClose = new Button("Close");
		btnClose.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleClose();
			}
		});
		layoutPanel.add(btnClose);
		layoutPanel.setWidgetLeftWidth(btnClose, 271.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnClose, 163.0, Unit.PX, 30.0, Unit.PX);
		
		FriendListBox = new ListBox();
		layoutPanel.add(FriendListBox);
		layoutPanel.setWidgetLeftWidth(FriendListBox, 51.0, Unit.PX, 176.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(FriendListBox, 25.0, Unit.PX, 227.0, Unit.PX);
		FriendListBox.setVisibleItemCount(20);
	}

	private void handleBrowseFriend() {
		// switch to the user's list view
		WebApp.setView(new userListView());
	}
	
	private void handleRemoveFriend() {
		// TODO Auto-generated method stub
		
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
