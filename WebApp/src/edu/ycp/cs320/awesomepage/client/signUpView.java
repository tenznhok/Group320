package edu.ycp.cs320.awesomepage.client;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class signUpView extends Composite {
	private Button btnSignUp;
	public signUpView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setHeight("385px");
		
		Label lblUsername = new Label("UserName :");
		layoutPanel.add(lblUsername);
		layoutPanel.setWidgetLeftWidth(lblUsername, 15.0, Unit.PX, 85.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblUsername, 145.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel inlineLabel = new InlineLabel("First Name: ");
		layoutPanel.add(inlineLabel);
		layoutPanel.setWidgetLeftWidth(inlineLabel, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(inlineLabel, 185.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblLastName = new InlineLabel("Last Name:");
		layoutPanel.add(nlnlblLastName);
		layoutPanel.setWidgetLeftWidth(nlnlblLastName, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblLastName, 225.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblPassword = new InlineLabel("Password:");
		layoutPanel.add(nlnlblPassword);
		layoutPanel.setWidgetLeftWidth(nlnlblPassword, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblPassword, 263.0, Unit.PX, 18.0, Unit.PX);
		
		InlineLabel nlnlblEmail = new InlineLabel("Email:");
		layoutPanel.add(nlnlblEmail);
		layoutPanel.setWidgetLeftWidth(nlnlblEmail, 15.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(nlnlblEmail, 303.0, Unit.PX, 18.0, Unit.PX);
		
		PasswordTextBox passwordTextBox = new PasswordTextBox();
		layoutPanel.add(passwordTextBox);
		layoutPanel.setWidgetLeftWidth(passwordTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordTextBox, 249.0, Unit.PX, 32.0, Unit.PX);
		
		TextBox textBox = new TextBox();
		layoutPanel.add(textBox);
		layoutPanel.setWidgetLeftWidth(textBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox, 129.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox_1 = new TextBox();
		layoutPanel.add(textBox_1);
		layoutPanel.setWidgetLeftWidth(textBox_1, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_1, 169.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox_2 = new TextBox();
		layoutPanel.add(textBox_2);
		layoutPanel.setWidgetLeftWidth(textBox_2, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_2, 209.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox_3 = new TextBox();
		layoutPanel.add(textBox_3);
		layoutPanel.setWidgetLeftWidth(textBox_3, 121.0, Unit.PX, 175.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_3, 287.0, Unit.PX, 34.0, Unit.PX);
		
		btnSignUp = new Button("Sign Up");
		btnSignUp.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				signUpAction();
			}

			
		});
		layoutPanel.add(btnSignUp);
		layoutPanel.setWidgetLeftWidth(btnSignUp, 181.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnSignUp, 344.0, Unit.PX, 30.0, Unit.PX);
		
		Image image = new Image("Signup.jpg");
		layoutPanel.add(image);
		layoutPanel.setWidgetTopHeight(image, -23.0, Unit.PX, 163.0, Unit.PX);
		image.setSize("200", "400");
		layoutPanel.setWidgetLeftWidth(image, 32.0, Unit.PX, 389.0, Unit.PX);
		
		Image image_1 = new Image("SignupForFree.jpg");
		layoutPanel.add(image_1);
		layoutPanel.setWidgetLeftWidth(image_1, 314.0, Unit.PX, 327.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image_1, 129.0, Unit.PX, 76.0, Unit.PX);
	}
	
	private void signUpAction() {
		
	
		//switch to loginView
		WebApp.setView(new logInView());
		
	}
}


