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
	private Button addFriendButt;
	public userListView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		layoutPanel.addAttachHandler(new Handler() {
			public void onAttachOrDetach(AttachEvent event) {
				handleCancle();
			}

			
		});
		initWidget(layoutPanel);
		layoutPanel.setHeight("365px");
		
		ListBox allUserDataListBox = new ListBox();
		allUserDataListBox.setName("Users");
		layoutPanel.add(allUserDataListBox);
		layoutPanel.setWidgetLeftWidth(allUserDataListBox, 56.0, Unit.PX, 253.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(allUserDataListBox, 76.0, Unit.PX, 191.0, Unit.PX);
		allUserDataListBox.setVisibleItemCount(5);
		
		addFriendButt = new Button("Add");
		addFriendButt.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				addFriendAction();
			}

			
		});
		layoutPanel.add(addFriendButt);
		layoutPanel.setWidgetLeftWidth(addFriendButt, 56.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(addFriendButt, 273.0, Unit.PX, 30.0, Unit.PX);
		
		Button btnCancel = new Button("Cancel");
		layoutPanel.add(btnCancel);
		layoutPanel.setWidgetLeftWidth(btnCancel, 158.0, Unit.PX, 82.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnCancel, 273.0, Unit.PX, 30.0, Unit.PX);
	}

	private void addFriendAction() {
		// TODO Auto-generated method stub
		WebApp.setView(new friendListView());
		
	}
	private void handleCancle() {
		// TODO Auto-generated method stub
		WebApp.setView(new friendListView());

	}
	
	@Override
	public void activate() {
		// Nothing to do (don't need to load data)
	}
}
