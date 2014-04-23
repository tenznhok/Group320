package edu.ycp.cs320.awesomepage.client;
//webpage

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Style.Unit;
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

public class webpageView extends Composite {
	private Button statusBtt;
	private Button btnAddFriend;
	private Button btnAddGames;
	private Button btnEditInfo;
	private Button btnEditStatus;
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
		
		Label status = new Label("");
		layoutPanel.add(status);
		layoutPanel.setWidgetLeftWidth(status, 78.0, Unit.PX, 376.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(status, 218.0, Unit.PX, 86.0, Unit.PX);
		
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
		layoutPanel.add(btnEditInfo);
		layoutPanel.setWidgetLeftWidth(btnEditInfo, 373.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEditInfo, 140.0, Unit.PX, 30.0, Unit.PX);
		
		btnEditStatus = new Button("Edit Status");
		layoutPanel.add(btnEditStatus);
		layoutPanel.setWidgetLeftWidth(btnEditStatus, 78.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEditStatus, 310.0, Unit.PX, 30.0, Unit.PX);
	}
	
	protected void handleStatusPost() {
		
		// Switch to StatusPosting view
		WebApp.setView(new StatusPosting());
		
		
	}
}
