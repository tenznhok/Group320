package edu.ycp.cs320.awesomepage.client;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Composite;
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



public class logInView extends Composite implements FieldVerifier {
	private TextBox textBoxUserName;
	public logInView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("745px", "603px");
		
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
		
		InlineLabel PasswordLabel = new InlineLabel("Password:");
		layoutPanel.add(PasswordLabel);
		layoutPanel.setWidgetLeftWidth(PasswordLabel, 50.0, Unit.PX, 90.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(PasswordLabel, 114.0, Unit.PX, 18.0, Unit.PX);
		
		Button btnLogin = new Button("New button");
		btnLogin.setText("LOGIN");
		layoutPanel.add(btnLogin);
		layoutPanel.setWidgetLeftWidth(btnLogin, 182.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnLogin, 182.0, Unit.PX, 30.0, Unit.PX);
		
		PasswordTextBox passwordTextBox = new PasswordTextBox();
		layoutPanel.add(passwordTextBox);
		layoutPanel.setWidgetLeftWidth(passwordTextBox, 135.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordTextBox, 111.0, Unit.PX, 32.0, Unit.PX);
		
		Image image = new Image("chandelure_by_xous54-d3cmk9y.png");
		layoutPanel.add(image);
		image.setSize("600", "560");
		layoutPanel.setWidgetLeftWidth(image, 135.0, Unit.PX, 486.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 40.0, Unit.PX, 549.0, Unit.PX);
	}
}
