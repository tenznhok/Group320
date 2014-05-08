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
import edu.ycp.cs320.awesomepage.shared.userInfo;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.widget.client.TextButton;
import com.google.gwt.user.datepicker.client.DatePicker;

public class webpageView extends Composite implements View {

	private Button statusBtt;
	private Button btnFriends;
	private Button btnEditInfo;
	private Button signOutBut;

	private Label status;

	private ListBox statusListBox;

	private Label NameLabel, EmailTextLabel, PhoneNumLabel, CountryLabel, CityLabel;

	//private User user = Session.getInstance().getUser();
	//private Status userStatus;


	public webpageView() {

		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("666px", "582px");

		statusBtt = new Button("Post");
		statusBtt.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleStatusPost();
			}
		});
		statusBtt.setText("Status");
		layoutPanel.add(statusBtt);
		layoutPanel.setWidgetLeftWidth(statusBtt, 78.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusBtt, 170.0, Unit.PX, 30.0, Unit.PX);

		btnFriends = new Button("Friends");
		btnFriends.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleFriends();
			}
		});
		btnFriends.setText("Friends");
		layoutPanel.add(btnFriends);
		layoutPanel.setWidgetLeftWidth(btnFriends, 165.0, Unit.PX, 98.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnFriends, 170.0, Unit.PX, 30.0, Unit.PX);

		btnEditInfo = new Button("Edit Info");
		btnEditInfo.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleEditInfo();
			}
		});
		layoutPanel.add(btnEditInfo);
		layoutPanel.setWidgetLeftWidth(btnEditInfo, 269.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEditInfo, 170.0, Unit.PX, 30.0, Unit.PX);

		signOutBut = new Button("Sign Out");
		signOutBut.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleSignOut();
			}
		});
		layoutPanel.add(signOutBut);
		layoutPanel.setWidgetLeftWidth(signOutBut, 78.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(signOutBut, 325.0, Unit.PX, 30.0, Unit.PX);

		statusListBox = new ListBox();
		statusListBox.setDirectionEstimator(true);
		statusListBox.setMultipleSelect(true);
		layoutPanel.add(statusListBox);
		layoutPanel.setWidgetLeftWidth(statusListBox, 20.0, Unit.PX, 464.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusListBox, 206.0, Unit.PX, 98.0, Unit.PX);
		statusListBox.setVisibleItemCount(2);

		NameLabel = new Label(" ");
		layoutPanel.add(NameLabel);
		layoutPanel.setWidgetLeftWidth(NameLabel, 36.0, Unit.PX, 376.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(NameLabel, 146.0, Unit.PX, 18.0, Unit.PX);

		EmailTextLabel = new Label("");
		layoutPanel.add(EmailTextLabel);
		layoutPanel.setWidgetLeftWidth(EmailTextLabel, 297.0, Unit.PX, 342.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(EmailTextLabel, 456.0, Unit.PX, 18.0, Unit.PX);

		PhoneNumLabel = new Label("");
		layoutPanel.add(PhoneNumLabel);
		layoutPanel.setWidgetLeftWidth(PhoneNumLabel, 297.0, Unit.PX, 338.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(PhoneNumLabel, 480.0, Unit.PX, 18.0, Unit.PX);

		CountryLabel = new Label("");
		layoutPanel.add(CountryLabel);
		layoutPanel.setWidgetLeftWidth(CountryLabel, 297.0, Unit.PX, 338.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(CountryLabel, 504.0, Unit.PX, 18.0, Unit.PX);

		CityLabel = new Label("");
		layoutPanel.add(CityLabel); 
		layoutPanel.setWidgetLeftWidth(CityLabel, 297.0, Unit.PX, 342.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(CityLabel, 528.0, Unit.PX, 18.0, Unit.PX);

		Label lblPhone = new Label("Email");
		layoutPanel.add(lblPhone);
		layoutPanel.setWidgetLeftWidth(lblPhone, 235.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblPhone, 456.0, Unit.PX, 18.0, Unit.PX);

		Label label = new Label("Phone:");
		layoutPanel.add(label);
		layoutPanel.setWidgetLeftWidth(label, 235.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(label, 480.0, Unit.PX, 18.0, Unit.PX);

		Label lblCountry = new Label("country");
		layoutPanel.add(lblCountry);
		layoutPanel.setWidgetLeftWidth(lblCountry, 235.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblCountry, 504.0, Unit.PX, 18.0, Unit.PX);

		Label lblCity = new Label("City:");
		layoutPanel.add(lblCity);
		layoutPanel.setWidgetLeftWidth(lblCity, 235.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblCity, 528.0, Unit.PX, 18.0, Unit.PX);
		
		Image image = new Image("LoginPage_ASP.jpg");
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 12.0, Unit.PX, 457.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 24.0, Unit.PX, 116.0, Unit.PX);
		
		DatePicker datePicker = new DatePicker();
		layoutPanel.add(datePicker);
		layoutPanel.setWidgetLeftWidth(datePicker, 12.0, Unit.PX, 212.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(datePicker, 371.0, Unit.PX, 191.0, Unit.PX);
		
		Image image_1 = new Image("aboutme.jpg");
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 255.0, Unit.PX, 254.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 325.0, Unit.PX, 95.0, Unit.PX);

	}


	public void activate() {
		final User user = Session.getInstance().getUser();

		if (user == null) {
			GWT.log("No user in session?");
			return;
		}
		RPC.statusService.getStatusesForUser(user, new AsyncCallback<String>() {
			@Override
			public void onSuccess(String result) {
				// Show statuses in list
				//statusListBox.insertItem(result, 3);
				statusListBox.addItem(result);
			}
			@Override
			public void onFailure(Throwable caught) {
				// TODO: display error message
				GWT.log("Couldn't display statuses", caught);
			}
		});



		int userID = user.getUserID();
		RPC.EditInfoService.getUserInfo(userID, new AsyncCallback<userInfo>() {

			userInfo info;

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				GWT.log("get user info RPC call failed");
			}
			@Override
			public void onSuccess(userInfo result) {
				// TODO Auto-generated method stub
				GWT.log("Successful To Get User Info!");
				if(result == null)
				{
					GWT.log("Failed to get user info");
				}else{
					info = result;
					NameLabel.setText("Welcome back " + info.getFirstName() + " " + info.getLastName() );

					EmailTextLabel.setText(info.getEmailContact());
					//MorFTextLabel.setText(info.getMaleOrFemale());
					PhoneNumLabel.setText(info.getPhoneNum());
					CountryLabel.setText(info.getCountry());
					CityLabel.setText(info.getCity());
					//
				}
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
	private void handleFriends() {
		// Switch to friendList view
		WebApp.setView(new friendListView());


	}
}