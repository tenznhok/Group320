package edu.ycp.cs320.awesomepage.client;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;

import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.AbsolutePanel;

/**
 * this class will pull all user's names in database
 * so that the user can choose which friend he/she wants 
 * to add that friend into their list
 * @author tnguye17
 *
 */
public class userListView extends Composite implements View  {
	private Button btnCancel;
	private Button btnAdd;
	private ListBox UserListBox;
	private int id;
	
	//gets the user from the session
			User user = Session.getInstance().getUser();
			int userID = user.getUserID();
	
	
	public userListView() {
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setHeight("421px");
		
		UserListBox = new ListBox();
		absolutePanel.add(UserListBox, 38, 26);
		UserListBox.setSize("118px", "225px");
		
		UserListBox.setVisibleItemCount(5);
		
		btnAdd = new Button("Add");
		btnAdd.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleAdd();
			}
		});
		absolutePanel.add(btnAdd, 10, 277);
		
		btnCancel = new Button("Close/ Cancel\r\n");
		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleCancel();
			}
		});
		absolutePanel.add(btnCancel, 70, 277);
		
		Image image = new Image("ASP_UserList.jpg");
		absolutePanel.add(image, 184, 10);
		image.setSize("238px", "323px");
		
		
	}

	private void handleAdd() {
		int id = UserListBox.getSelectedIndex();
		String newFriend = UserListBox.getItemText( id );
		
		
		RPC.GetFriendsService.addFriends(userID, newFriend, new AsyncCallback<friendName>(){

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(friendName result) {
				// TODO Auto-generated method stub
				
			}
				
				
		});
		
	}
	
	private void handleCancel() {
		// Switch to friendList view
			WebApp.setView(new friendListView());
	}
	@Override
	public void activate() {
		RPC.userListViewService.user( new AsyncCallback<ArrayList<User>>()  {
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				GWT.log("get All user RPC call failed");
			}
			@Override
			public void onSuccess(ArrayList<User> result) {
				// TODO Auto-generated method stub
				GWT.log("Successful To Get AllUser!");
				if(result == null)
				{
					GWT.log("Failed to get user peoples");
				}else{
					GWT.log("SuccessFul to get list of all users");
					for (User user : result) {
						id = user.getUserID();
						String name = user.getUserName();
						UserListBox.insertItem(name, id);
					}
				}
			}
		});
	}
}
