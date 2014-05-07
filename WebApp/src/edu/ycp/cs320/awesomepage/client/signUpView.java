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
import edu.ycp.cs320.awesomepage.shared.userInfo;
import com.google.gwt.user.client.ui.Hidden;

public class signUpView extends Composite implements View {
	private Button btnSignUp;
	private TextBox UserNameTextBox;
	private TextBox FirstNameTextBox;
	private TextBox LastNameTextBox;
	private PasswordTextBox PasswordTextBox;
	private TextBox EmailTextBox;
	private Label errorLabel;
	private Button btnIDecideNot;
	public signUpView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("810px", "684px");
		
		Label lblUsername = new Label("UserName :");
		layoutPanel.add(lblUsername);
		layoutPanel.setWidgetLeftWidth(lblUsername, 15.0, Unit.PX, 85.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblUsername, 169.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel inlineLabel = new InlineLabel("First Name: ");
		layoutPanel.add(inlineLabel);
		layoutPanel.setWidgetLeftWidth(inlineLabel, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(inlineLabel, 221.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblLastName = new InlineLabel("Last Name:");
		layoutPanel.add(nlnlblLastName);
		layoutPanel.setWidgetLeftWidth(nlnlblLastName, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblLastName, 272.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblPassword = new InlineLabel("Password:");
		layoutPanel.add(nlnlblPassword);
		layoutPanel.setWidgetLeftWidth(nlnlblPassword, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblPassword, 323.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblEmail = new InlineLabel("Email:");
		layoutPanel.add(nlnlblEmail);
		layoutPanel.setWidgetLeftWidth(nlnlblEmail, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblEmail, 377.0, Unit.PX, 18.0, Unit.PX);
		
		UserNameTextBox = new TextBox();
		layoutPanel.add(UserNameTextBox);
		layoutPanel.setWidgetLeftWidth(UserNameTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(UserNameTextBox, 153.0, Unit.PX, 34.0, Unit.PX);
		
		FirstNameTextBox = new TextBox();
		layoutPanel.add(FirstNameTextBox);
		layoutPanel.setWidgetLeftWidth(FirstNameTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(FirstNameTextBox, 205.0, Unit.PX, 34.0, Unit.PX);
		
		LastNameTextBox = new TextBox();
		layoutPanel.add(LastNameTextBox);
		layoutPanel.setWidgetLeftWidth(LastNameTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(LastNameTextBox, 257.0, Unit.PX, 34.0, Unit.PX);
		
		PasswordTextBox = new PasswordTextBox();
		layoutPanel.add(PasswordTextBox);
		layoutPanel.setWidgetLeftWidth(PasswordTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(PasswordTextBox, 309.0, Unit.PX, 32.0, Unit.PX);
		
		EmailTextBox = new TextBox();
		layoutPanel.add(EmailTextBox);
		layoutPanel.setWidgetLeftWidth(EmailTextBox, 119.0, Unit.PX, 163.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(EmailTextBox, 361.0, Unit.PX, 34.0, Unit.PX);
		
		btnSignUp = new Button("Sign Up");
		btnSignUp.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				signUp();

			}
		});
		layoutPanel.add(btnSignUp);
		layoutPanel.setWidgetLeftWidth(btnSignUp, 182.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnSignUp, 418.0, Unit.PX, 66.0, Unit.PX);
		
		errorLabel = new Label("");
		layoutPanel.add(errorLabel);
		layoutPanel.setWidgetLeftWidth(errorLabel, 327.0, Unit.PX, 277.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(errorLabel, 351.0, Unit.PX, 16.0, Unit.PX);
		
		Image image = new Image("keepcalmandsignuphere1.png");
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 337.0, Unit.PX, 551.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, -16.0, Unit.PX, 700.0, Unit.PX);
		
		btnIDecideNot = new Button("I Decide Not To");
		btnIDecideNot.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				notsignUp();
			}

			
		});
		layoutPanel.add(btnIDecideNot);
		layoutPanel.setWidgetLeftWidth(btnIDecideNot, 31.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnIDecideNot, 418.0, Unit.PX, 66.0, Unit.PX);
		
		Image image_1 = new Image("Signup.jpg");
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 15.0, Unit.PX, 397.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 0.0, Unit.PX, 146.0, Unit.PX);
		
		Image image_2 = new Image("LoginPage_ASP.jpg");
		layoutPanel.add(image_2);
		layoutPanel.setWidgetLeftWidth(image_2, 15.0, Unit.PX, 403.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_2, 537.0, Unit.PX, 116.0, Unit.PX);

	}
	
	@Override
	public void activate() {
		// Nothing to do (don't need to load data)
	}
	private void notsignUp() {
		// User does not want to sign up. 
		WebApp.setView(new logInView());	
	}
	
	public void signUp(){
	
		String userName = String.valueOf( UserNameTextBox.getText() );
		final String userFirstName = String.valueOf( FirstNameTextBox.getText() );
		final String userLastName = String.valueOf( LastNameTextBox.getText() );
		String userPassword = String.valueOf( PasswordTextBox.getText() );
		final String email = String.valueOf( EmailTextBox.getText() );
		
		// Call sign up RPC method to attempt to add new user to database
		RPC.SignUpService.signUp(userName,userPassword,userFirstName,userLastName,email, new AsyncCallback<User>() {
			@Override
			public void onFailure(Throwable caught) {
				GWT.log("sign up RPC call failed");
			}
			@Override
			public void onSuccess(User result) {
				WebApp.setView(new logInView());
			}
		});
	}
}
