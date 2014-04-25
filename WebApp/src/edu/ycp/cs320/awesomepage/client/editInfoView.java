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

public class editInfoView extends Composite implements View  {
	private TextBox FirstNameTextBox;
	private TextBox LastNameTextBox;
	private TextBox EmailTextBox;
	private TextBox MorFTextBox;
	private TextBox PhoneNumTextBox;
	private TextBox CountryTextBox;
	private TextBox CityTextBox;
	private Button UpDateButton;
	private Button CancelButton;
	
	userInfo info;
	
	public editInfoView() {
		//gets the user from the session
		User user = Session.getInstance().getUser();
		int userID = user.getUserID();
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
					FirstNameTextBox.setText(info.getFirstName());
					LastNameTextBox.setText(info.getLastName());
					EmailTextBox.setText(info.getEmailContact());
					MorFTextBox.setText(info.getMaleOrFemale());
					PhoneNumTextBox.setText(info.getPhoneNum());
					CountryTextBox.setText(info.getCountry());
					CityTextBox.setText(info.getCity());
				}
			}
		});
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		
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
		
		MorFTextBox = new TextBox();
		absolutePanel.add(MorFTextBox, 158, 244);
		
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
		absolutePanel.add(UpDateButton, 405, 106);
		
		CancelButton = new Button("Cancel");
		CancelButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleCancel();
			}
		});
		absolutePanel.add(CancelButton, 405, 140);
	}
	
	@Override
	public void activate() {
		// Nothing to do (don't need to load data)
	}
	
	private void handleUpDate() {
		// TODO Auto-generated method stub
		WebApp.setView(new webpageView());
	}
	private void handleCancel() {
		// TODO Auto-generated method stub
		WebApp.setView(new webpageView());
	}
}
