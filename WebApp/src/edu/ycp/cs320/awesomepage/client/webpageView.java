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
import com.google.gwt.widget.client.TextButton;

public class webpageView extends Composite {
	private Button statusBtt;
	private Button editFriendListButt;
	private Button btnAddGames;
	private Button btnEditInfo;
	private Button btnEditStatus;
	private ListBox friendListBox;
	private Label lblMyFriends;
	public webpageView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("558px", "694px");
		
		statusBtt = new Button("Post");
		statusBtt.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleStatusPost();
			}

			
		});
		statusBtt.setText("Post Status");
		layoutPanel.add(statusBtt);
		layoutPanel.setWidgetLeftWidth(statusBtt, 29.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusBtt, 167.0, Unit.PX, 45.0, Unit.PX);
		
		Label status = new Label("");
		layoutPanel.add(status);
		layoutPanel.setWidgetLeftWidth(status, 29.0, Unit.PX, 492.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(status, 218.0, Unit.PX, 86.0, Unit.PX);
		
		editFriendListButt = new Button("Edit Friend");
		editFriendListButt.setText("Edit Friends");
		layoutPanel.add(editFriendListButt);
		layoutPanel.setWidgetLeftWidth(editFriendListButt, 409.0, Unit.PX, 98.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(editFriendListButt, 616.0, Unit.PX, 30.0, Unit.PX);
		
		btnAddGames = new Button("Add Games");
		layoutPanel.add(btnAddGames);
		layoutPanel.setWidgetLeftWidth(btnAddGames, 198.0, Unit.PX, 71.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnAddGames, 616.0, Unit.PX, 49.0, Unit.PX);
		
		btnEditInfo = new Button("Edit Info");
		layoutPanel.add(btnEditInfo);
		layoutPanel.setWidgetLeftWidth(btnEditInfo, 29.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEditInfo, 616.0, Unit.PX, 30.0, Unit.PX);
		
		btnEditStatus = new Button("Edit Status");
		layoutPanel.add(btnEditStatus);
		layoutPanel.setWidgetLeftWidth(btnEditStatus, 29.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEditStatus, 310.0, Unit.PX, 30.0, Unit.PX);
		
		Image image = new Image("LoginPage_ASP.jpg");
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 13.0, Unit.PX, 473.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 18.0, Unit.PX, 116.0, Unit.PX);
		
		InlineLabel userWelcomeLb = new InlineLabel("");
		layoutPanel.add(userWelcomeLb);
		layoutPanel.setWidgetLeftWidth(userWelcomeLb, 34.0, Unit.PX, 235.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(userWelcomeLb, 134.0, Unit.PX, 42.0, Unit.PX);
		
		friendListBox = new ListBox();
		layoutPanel.add(friendListBox);
		layoutPanel.setWidgetLeftWidth(friendListBox, 394.0, Unit.PX, 129.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(friendListBox, 383.0, Unit.PX, 227.0, Unit.PX);
		friendListBox.setVisibleItemCount(5);
		
		ListBox gameListBox = new ListBox();
		layoutPanel.add(gameListBox);
		layoutPanel.setWidgetLeftWidth(gameListBox, 198.0, Unit.PX, 129.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(gameListBox, 383.0, Unit.PX, 227.0, Unit.PX);
		gameListBox.setVisibleItemCount(5);
		
		lblMyFriends = new Label("My Friends:");
		layoutPanel.add(lblMyFriends);
		layoutPanel.setWidgetLeftWidth(lblMyFriends, 394.0, Unit.PX, 110.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblMyFriends, 348.0, Unit.PX, 18.0, Unit.PX);
		
		Label lblMyGames = new Label("My Games:");
		layoutPanel.add(lblMyGames);
		layoutPanel.setWidgetLeftWidth(lblMyGames, 198.0, Unit.PX, 109.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblMyGames, 348.0, Unit.PX, 18.0, Unit.PX);
	}
	
	protected void handleStatusPost() {
		
		// Switch to StatusPosting view
		WebApp.setView(new StatusPosting());
		
		
	}
}
