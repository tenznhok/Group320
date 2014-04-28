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
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.event.logical.shared.AttachEvent;

/**
 * this class will pull all user's names in databse
 * so that the user can choose which friend he/she wants 
 * to add that friend into their list
 * @author tnguye17
 *
 */
public class userListView extends Composite implements View  {
	private Button btnCancel;
	private Button btnAdd;
	public userListView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		ListBox listBox = new ListBox();
		layoutPanel.add(listBox);
		layoutPanel.setWidgetLeftWidth(listBox, 50.0, Unit.PX, 155.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(listBox, 72.0, Unit.PX, 165.0, Unit.PX);
		listBox.setVisibleItemCount(5);
		
		btnAdd = new Button("Add");
		btnAdd.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleAdd();
			}

		});
		layoutPanel.add(btnAdd);
		layoutPanel.setWidgetLeftWidth(btnAdd, 50.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnAdd, 250.0, Unit.PX, 30.0, Unit.PX);
		
		btnCancel = new Button("Close/ Cancel\r\n");
		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleCancel();
			}

			
		});
		layoutPanel.add(btnCancel);
		layoutPanel.setWidgetLeftWidth(btnCancel, 152.0, Unit.PX, 109.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnCancel, 250.0, Unit.PX, 30.0, Unit.PX);
	}

	private void handleAdd() {
		// TODO Auto-generated method stub
		
	}
	
	private void handleCancel() {
		// Switch to friendList view
			WebApp.setView(new friendListView());
	}
	@Override
	public void activate() {
		// Nothing to do (don't need to load data)
	}
}
