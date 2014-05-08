package edu.ycp.cs320.awesomepage.client;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.userInfo;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Image;

public class editInfoView extends Composite implements View  {
	private TextBox FirstNameTextBox;
	private TextBox LastNameTextBox;
	private TextBox EmailTextBox;
	private TextBox PhoneNumTextBox;
	private TextBox CountryTextBox;
	private TextBox CityTextBox;
	private Button UpDateButton;
	private Button CancelButton;
	
	userInfo info;
	//gets the user from the session
	User user = Session.getInstance().getUser();
	int userID = user.getUserID();
	private ListBox MaleFemaleListBox;
	
	public editInfoView() {
		
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("543px", "530px");
		
		Label FirstNameLabel = new Label("First Name:");
		absolutePanel.add(FirstNameLabel, 88, 53);
		
		Label LastNameLabel = new Label("Last Name:");
		absolutePanel.add(LastNameLabel, 89, 122);
		
		Label EmailLabel = new Label("Email:");
		absolutePanel.add(EmailLabel, 119, 191);
		
		Label MaleorFemaleLabel = new Label("Male or Female:");
		absolutePanel.add(MaleorFemaleLabel, 62, 260);
		
		Label PhoneNumLabel = new Label("Phone #:");
		absolutePanel.add(PhoneNumLabel, 104, 329);
		
		Label CountryLabel = new Label("Country:");
		absolutePanel.add(CountryLabel, 107, 398);
		
		Label CityLabel = new Label("City:");
		absolutePanel.add(CityLabel, 129, 467);
		
		FirstNameTextBox = new TextBox();
		absolutePanel.add(FirstNameTextBox, 158, 37);
		
		LastNameTextBox = new TextBox();
		absolutePanel.add(LastNameTextBox, 158, 106);
		
		EmailTextBox = new TextBox();
		absolutePanel.add(EmailTextBox, 158, 175);
		
		MaleFemaleListBox = new ListBox();
		MaleFemaleListBox.addItem("");
		MaleFemaleListBox.addItem("Male");
		MaleFemaleListBox.addItem("Female");
		absolutePanel.add(MaleFemaleListBox, 162, 255);
		MaleFemaleListBox.setSize("114px", "20px");
		MaleFemaleListBox.setVisibleItemCount(1);
		
		PhoneNumTextBox = new TextBox();
		absolutePanel.add(PhoneNumTextBox, 158, 313);
		
		CountryTextBox = new TextBox();
		absolutePanel.add(CountryTextBox, 158, 382);
		
		CityTextBox = new TextBox();
		absolutePanel.add(CityTextBox, 158, 451);
		
		UpDateButton = new Button("Up Date Info");
		UpDateButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleUpDate();
			}
		});
		absolutePanel.add(UpDateButton, 390, 37);
		
		CancelButton = new Button("Cancel");
		CancelButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleCancel();
			}
		});
		absolutePanel.add(CancelButton, 390, 82);
		
		Image image = new Image("EditingInfo.jpg");
		absolutePanel.add(image, 353, 122);
		image.setSize("180px", "363px");
	}
	
	@Override
	public void activate() {
		
		RPC.EditInfoService.getUserInfo(userID, new AsyncCallback<userInfo>() {

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
					int index = 0;
					String string = info.getMaleOrFemale();
					if( string.equals("Male") ){
						index = 1;
					}
					if( string.equals("Female") ){
						index = 2;
					}
					FirstNameTextBox.setText(info.getFirstName());
					LastNameTextBox.setText(info.getLastName());
					EmailTextBox.setText(info.getEmailContact());
					MaleFemaleListBox.setItemSelected(index, true);
					PhoneNumTextBox.setText(info.getPhoneNum());
					CountryTextBox.setText(info.getCountry());
					CityTextBox.setText(info.getCity());
				}
			}
		});
	}
	
	private void handleUpDate() {
		//RPC upDate use info
		final int index = MaleFemaleListBox.getSelectedIndex();
		
		RPC.EditInfoService.editInfo(userID, FirstNameTextBox.getText(), LastNameTextBox.getText(), EmailTextBox.getText(), MaleFemaleListBox.getItemText(index),
				PhoneNumTextBox.getText(), CountryTextBox.getText(), CityTextBox.getText(), new AsyncCallback<userInfo>() {

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
					GWT.log("Failed to edit user info");
				}else{
					WebApp.setView(new webpageView());
				}
			}
		});
		
		// TODO Auto-generated method stub
		//WebApp.setView(new webpageView());
	}
	private void handleCancel() {
		// TODO Auto-generated method stub
		WebApp.setView(new webpageView());
	}
}
