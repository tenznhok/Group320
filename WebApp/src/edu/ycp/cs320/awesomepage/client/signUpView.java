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

public class signUpView extends Composite {
	private Button btnSignUp;
	private TextBox UserNameTextBox;
	private TextBox FirstNameTextBox;
	private TextBox LastNameTextBox;
	private PasswordTextBox PasswordTextBox;
	private TextBox EmailTextBox;
	private Label errorLabel;
	public signUpView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setHeight("385px");
		
		Label lblUsername = new Label("UserName :");
		layoutPanel.add(lblUsername);
		layoutPanel.setWidgetLeftWidth(lblUsername, 15.0, Unit.PX, 85.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblUsername, 89.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel inlineLabel = new InlineLabel("First Name: ");
		layoutPanel.add(inlineLabel);
		layoutPanel.setWidgetLeftWidth(inlineLabel, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(inlineLabel, 137.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblLastName = new InlineLabel("Last Name:");
		layoutPanel.add(nlnlblLastName);
		layoutPanel.setWidgetLeftWidth(nlnlblLastName, 10.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblLastName, 177.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblPassword = new InlineLabel("Password:");
		layoutPanel.add(nlnlblPassword);
		layoutPanel.setWidgetLeftWidth(nlnlblPassword, 10.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblPassword, 225.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblEmail = new InlineLabel("Email:");
		layoutPanel.add(nlnlblEmail);
		layoutPanel.setWidgetLeftWidth(nlnlblEmail, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblEmail, 268.0, Unit.PX, 18.0, Unit.PX);
		
		UserNameTextBox = new TextBox();
		layoutPanel.add(UserNameTextBox);
		layoutPanel.setWidgetLeftWidth(UserNameTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(UserNameTextBox, 73.0, Unit.PX, 34.0, Unit.PX);
		
		FirstNameTextBox = new TextBox();
		layoutPanel.add(FirstNameTextBox);
		layoutPanel.setWidgetLeftWidth(FirstNameTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(FirstNameTextBox, 121.0, Unit.PX, 34.0, Unit.PX);
		
		LastNameTextBox = new TextBox();
		layoutPanel.add(LastNameTextBox);
		layoutPanel.setWidgetLeftWidth(LastNameTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(LastNameTextBox, 161.0, Unit.PX, 34.0, Unit.PX);
		
		PasswordTextBox = new PasswordTextBox();
		layoutPanel.add(PasswordTextBox);
		layoutPanel.setWidgetLeftWidth(PasswordTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(PasswordTextBox, 211.0, Unit.PX, 32.0, Unit.PX);
		
		EmailTextBox = new TextBox();
		layoutPanel.add(EmailTextBox);
		layoutPanel.setWidgetLeftWidth(EmailTextBox, 121.0, Unit.PX, 163.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(EmailTextBox, 252.0, Unit.PX, 34.0, Unit.PX);
		
		btnSignUp = new Button("Sign Up");
		btnSignUp.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				signUp();

			}
		});
		layoutPanel.add(btnSignUp);
		layoutPanel.setWidgetLeftWidth(btnSignUp, 184.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnSignUp, 315.0, Unit.PX, 30.0, Unit.PX);
		
		errorLabel = new Label("");
		layoutPanel.add(errorLabel);
		layoutPanel.setWidgetLeftWidth(errorLabel, 363.0, Unit.PX, 277.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(errorLabel, 315.0, Unit.PX, 16.0, Unit.PX);
		
		/*Image image = new Image((String) null);
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 15.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, -17.0, Unit.PX, 100.0, Unit.PX);*/
	}
	
	public void signUp(){
	
		String userName = String.valueOf( UserNameTextBox.getText() );
		//String userFirstName = String.valueOf( FirstNameTextBox.getText() );
		//String userLastName = String.valueOf( LastNameTextBox.getText() );
		String userPassword = String.valueOf( PasswordTextBox.getText() );
		String email = String.valueOf( EmailTextBox.getText() );
		
		// Call login RPC method to attempt to log in
		RPC.SignUpService.signUp(userName, userPassword, email, new AsyncCallback<User>() {
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
				GWT.log("sign up RPC call failed");
			}
			@Override
			public void onSuccess(User result) {
					WebApp.setView(new logInView());
			}
		});
	}
}
