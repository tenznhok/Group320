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
	public logInView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("745px", "956px");
		
		textBoxUserName = new TextBox();
		textBoxUserName.setMaxLength(30);
		textBoxUserName.setText("");
		layoutPanel.add(textBoxUserName);
		layoutPanel.setWidgetLeftWidth(textBoxUserName, 135.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBoxUserName, 71.0, Unit.PX, 34.0, Unit.PX);
		
		InlineLabel UserNameLabel = new InlineLabel("UserName:");
		layoutPanel.add(UserNameLabel);
		layoutPanel.setWidgetLeftWidth(UserNameLabel, 50.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(UserNameLabel, 74.0, Unit.PX, 18.0, Unit.PX);
		
		final InlineLabel PasswordLabel = new InlineLabel("Password:");
		layoutPanel.add(PasswordLabel);
		layoutPanel.setWidgetLeftWidth(PasswordLabel, 50.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(PasswordLabel, 114.0, Unit.PX, 18.0, Unit.PX);
		
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
		layoutPanel.setWidgetLeftWidth(btnLogin, 182.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnLogin, 182.0, Unit.PX, 30.0, Unit.PX);
		
		passwordTextBox = new PasswordTextBox();
		layoutPanel.add(passwordTextBox);
		layoutPanel.setWidgetLeftWidth(passwordTextBox, 135.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordTextBox, 111.0, Unit.PX, 32.0, Unit.PX);
		
		Image image = new Image("chandelure_by_xous54-d3cmk9y.png");
		layoutPanel.add(image);
		image.setSize("600", "560");
		layoutPanel.setWidgetLeftWidth(image, 24.0, Unit.PX, 486.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 286.0, Unit.PX, 549.0, Unit.PX);
		
		Image image_1 = new Image("LoginPage_IMG.png");
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 473.0, Unit.PX, 250.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 35.0, Unit.PX, 218.0, Unit.PX);
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
				} else {
					// Successful login!
					// TODO: switch to next view
					GWT.log("Successful login!");
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
