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

public class signUpView extends Composite {
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
		
		TextBox textBox = new TextBox();
		layoutPanel.add(textBox);
		layoutPanel.setWidgetLeftWidth(textBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox, 73.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox_1 = new TextBox();
		layoutPanel.add(textBox_1);
		layoutPanel.setWidgetLeftWidth(textBox_1, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_1, 121.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox textBox_2 = new TextBox();
		layoutPanel.add(textBox_2);
		layoutPanel.setWidgetLeftWidth(textBox_2, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_2, 161.0, Unit.PX, 34.0, Unit.PX);
		
		PasswordTextBox passwordTextBox = new PasswordTextBox();
		layoutPanel.add(passwordTextBox);
		layoutPanel.setWidgetLeftWidth(passwordTextBox, 123.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordTextBox, 211.0, Unit.PX, 32.0, Unit.PX);
		
		TextBox textBox_3 = new TextBox();
		layoutPanel.add(textBox_3);
		layoutPanel.setWidgetLeftWidth(textBox_3, 121.0, Unit.PX, 163.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox_3, 252.0, Unit.PX, 34.0, Unit.PX);
		
		Button btnSignUp = new Button("Sign Up");
		layoutPanel.add(btnSignUp);
		layoutPanel.setWidgetLeftWidth(btnSignUp, 184.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnSignUp, 315.0, Unit.PX, 30.0, Unit.PX);
		
		Image image = new Image("SignUp.png");
		layoutPanel.add(image);
		image.setSize("250", "100");
		layoutPanel.setWidgetLeftWidth(image, 322.0, Unit.PX, 250.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 0.0, Unit.PX, 107.0, Unit.PX);
	}
}
