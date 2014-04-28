package edu.ycp.cs320.awesomepage.client;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import edu.ycp.cs320.awesomepage.shared.User;

import com.google.gwt.user.client.ui.ListBox;


public class friendListView extends Composite implements View {
	private Button btnBrowseFriend;
	private Button btnRemoveFriend;
	private LayoutPanel layoutPanel;
	private Button btnClose;
	public friendListView() {
		
		layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		ListBox listBox = new ListBox();
		layoutPanel.add(listBox);
		layoutPanel.setWidgetLeftWidth(listBox, 87.0, Unit.PX, 147.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(listBox, 47.0, Unit.PX, 177.0, Unit.PX);
		listBox.setVisibleItemCount(5);
		
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
		layoutPanel.setWidgetLeftWidth(btnClose, 271.0, Unit.PX, 82.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnClose, 163.0, Unit.PX, 30.0, Unit.PX);
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
		// Nothing to do (don't need to load data)
	}
}
