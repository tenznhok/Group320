package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Style.Unit;
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


public class webpageView extends Composite {
	public webpageView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setHeight("421px");
		
		TextBox textBox = new TextBox();
		layoutPanel.add(textBox);
		layoutPanel.setWidgetLeftWidth(textBox, 0.0, Unit.PX, 780.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(textBox, 115.0, Unit.PX, 107.0, Unit.PX);
		
		Button btnPost = new Button("Post");
		layoutPanel.add(btnPost);
		layoutPanel.setWidgetLeftWidth(btnPost, 11.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnPost, 242.0, Unit.PX, 30.0, Unit.PX);
		
		Label label = new Label("");
		layoutPanel.add(label);
		layoutPanel.setWidgetLeftWidth(label, 0.0, Unit.PX, 780.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(label, 46.0, Unit.PX, 48.0, Unit.PX);
	}
}
