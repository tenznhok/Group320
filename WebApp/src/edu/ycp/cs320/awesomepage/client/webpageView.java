package edu.ycp.cs320.awesomepage.client;
//webpage

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.ListBox;

import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;

public class webpageView extends Composite implements View {
	private Button statusBtt;
	private Button btnAddFriend;
	private Button btnAddGames;
	private Button btnEditInfo;
	private Button btnEditStatus;
	private Button signOutBut;
	private ListBox statusListBox;
	
	//private User user = Session.getInstance().getUser();
	//private Status userStatus;
	
	public webpageView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("527px", "450px");
		
		statusBtt = new Button("Post");
		statusBtt.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleStatusPost();
			}
		});
		statusBtt.setText("Status");
		layoutPanel.add(statusBtt);
		layoutPanel.setWidgetLeftWidth(statusBtt, 78.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusBtt, 140.0, Unit.PX, 30.0, Unit.PX);
		
		btnAddFriend = new Button("Add Friend");
		btnAddFriend.setText("Add Friends");
		layoutPanel.add(btnAddFriend);
		layoutPanel.setWidgetLeftWidth(btnAddFriend, 165.0, Unit.PX, 98.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnAddFriend, 140.0, Unit.PX, 30.0, Unit.PX);
		
		btnAddGames = new Button("Add Games");
		layoutPanel.add(btnAddGames);
		layoutPanel.setWidgetLeftWidth(btnAddGames, 269.0, Unit.PX, 98.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnAddGames, 140.0, Unit.PX, 30.0, Unit.PX);
		
		btnEditInfo = new Button("Edit Info");
		btnEditInfo.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleEditInfo();
			}
		});
		layoutPanel.add(btnEditInfo);
		layoutPanel.setWidgetLeftWidth(btnEditInfo, 373.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEditInfo, 140.0, Unit.PX, 30.0, Unit.PX);
		
		btnEditStatus = new Button("Edit Status");
		layoutPanel.add(btnEditStatus);
		layoutPanel.setWidgetLeftWidth(btnEditStatus, 78.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEditStatus, 310.0, Unit.PX, 30.0, Unit.PX);
		
		signOutBut = new Button("Sign Out");
		signOutBut.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleSignOut();
			}
		});
		layoutPanel.add(signOutBut);
		layoutPanel.setWidgetLeftWidth(signOutBut, 78.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(signOutBut, 357.0, Unit.PX, 30.0, Unit.PX);
		
		statusListBox = new ListBox();
		layoutPanel.add(statusListBox);
		layoutPanel.setWidgetLeftWidth(statusListBox, 78.0, Unit.PX, 376.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusListBox, 176.0, Unit.PX, 128.0, Unit.PX);
		statusListBox.setVisibleItemCount(5);
	}
	
	
	public void activate() {
		User user = Session.getInstance().getUser();
		if (user == null) {
			GWT.log("No user in session?");
			return;
		}
		RPC.statusService.getStatusesForUser(user, new AsyncCallback<String[]>() {
			@Override
			public void onSuccess(String[] result) {
				// Show statuses in list
				for (String status : result) {
					statusListBox.addItem(status);
				}
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO: display error message
				GWT.log("Couldn't display statuses", caught);
			}
		});
	}
	
	protected void handleSignOut() {
		//log out and go to the login view
		WebApp.setView(new logInView());
	}

	protected void handleStatusPost() {
		
		// Switch to StatusPosting view
		WebApp.setView(new StatusPosting());
	}
	private void handleEditInfo() {
		// TODO Auto-generated method stub
		WebApp.setView(new editInfoView());
	}
}
