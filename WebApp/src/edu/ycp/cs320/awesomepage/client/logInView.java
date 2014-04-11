package edu.ycp.cs320.awesomepage.client;
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

import edu.ycp.cs320.awesomepage.shared.User;



public class logInView extends Composite  {
	private TextBox textBoxUserName;
	private PasswordTextBox passwordTextBox;
	private InlineLabel errorLabel;
	private InlineLabel loginSucessLable;
	public logInView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("745px", "956px");
		
		textBoxUserName = new TextBox();
		textBoxUserName.setMaxLength(30);
		textBoxUserName.setText("");
		layoutPanel.add(textBoxUserName);
		layoutPanel.setWidgetLeftWidth(textBoxUserName, 109.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBoxUserName, 169.0, Unit.PX, 34.0, Unit.PX);
		
		InlineLabel UserNameLabel = new InlineLabel("UserName:");
		layoutPanel.add(UserNameLabel);
		layoutPanel.setWidgetLeftWidth(UserNameLabel, 13.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(UserNameLabel, 180.0, Unit.PX, 23.0, Unit.PX);
		
		final InlineLabel PasswordLabel = new InlineLabel("Password:");
		layoutPanel.add(PasswordLabel);
		layoutPanel.setWidgetLeftWidth(PasswordLabel, 13.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(PasswordLabel, 223.0, Unit.PX, 18.0, Unit.PX);
		
		Button btnLogin = new Button("New button");
		btnLogin.addClickHandler(new ClickHandler() 
		{
			public void onClick(ClickEvent event) 
			{
				handleLogIn();
			}
		});
		
		btnLogin.setText("LOGIN");
		layoutPanel.add(btnLogin);
		layoutPanel.setWidgetLeftWidth(btnLogin, 149.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnLogin, 274.0, Unit.PX, 30.0, Unit.PX);
		
		passwordTextBox = new PasswordTextBox();
		layoutPanel.add(passwordTextBox);
		layoutPanel.setWidgetLeftWidth(passwordTextBox, 109.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordTextBox, 209.0, Unit.PX, 32.0, Unit.PX);
		
		Image image_1 = new Image("Login.jpg");
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 13.0, Unit.PX, 359.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 406.0, Unit.PX, 314.0, Unit.PX);
		
		Image image_2 = new Image("LoginPage_ASP.jpg");
		layoutPanel.add(image_2);
		layoutPanel.setWidgetLeftWidth(image_2, 13.0, Unit.PX, 427.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_2, 27.0, Unit.PX, 116.0, Unit.PX);
		
		Image image_3 = new Image("ASP_LI.jpg");
		layoutPanel.add(image_3);
		layoutPanel.setWidgetTopBottom(image_3, -32.0, Unit.PX, 170.0, Unit.PX);
		image_3.setSize("300", "500");
		layoutPanel.setWidgetLeftRight(image_3, 405.0, Unit.PX, 0.0, Unit.PX);
		
		errorLabel = new InlineLabel("");
		errorLabel.setStyleName("awesomepage-errorLabel", true);
		layoutPanel.add(errorLabel);
		layoutPanel.setWidgetLeftWidth(errorLabel, 13.0, Unit.PX, 386.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(errorLabel, 334.0, Unit.PX, 18.0, Unit.PX);
		
		loginSucessLable = new InlineLabel("");
		loginSucessLable.setStyleDependentName("awesomepage-sucessLable", true);
		layoutPanel.add(loginSucessLable);
		layoutPanel.setWidgetLeftWidth(loginSucessLable, 252.0, Unit.PX, 240.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(loginSucessLable, 286.0, Unit.PX, 23.0, Unit.PX);
		layoutPanel.setWidgetLeftWidth(loginSucessLable, 96.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(loginSucessLable, 310.0, Unit.PX, 23.0, Unit.PX);
	}

	protected void handleLogIn() 
	{
		String userName = String.valueOf( textBoxUserName.getText() );
		String userPassword = String.valueOf( passwordTextBox.getText() );
		
		// Call login RPC method to attempt to log in
		RPC.loginService.logIn(userName, userPassword, new AsyncCallback<User>() {
			
			@Override
			public void onSuccess(User result) {
				if (result == null) {
					// No such username/password
					// TODO: display error message in UI
					
					GWT.log("Login failed (unknown username/password)");
					errorLabel.setText("Unknown username/password: please re-enter");
				} else {
					// Successful login!
					// TODO: switch to next view
					GWT.log("Successful login!");
					errorLabel.setText(""); // clear previous error if there was one
					loginSucessLable.setText("You re logging into your page.....");
					
					// Switch to webpage view
					WebApp.setView(new webpageView());
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				String message = caught.getMessage();
				// TODO: display error message in UI
				GWT.log("Login RPC call failed");
			}
		});
	}
}
