package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class StatusPosting extends Composite {
	public StatusPosting() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("501px", "412px");
		
		TextBox statusTextbox = new TextBox();
		layoutPanel.add(statusTextbox);
		layoutPanel.setWidgetLeftWidth(statusTextbox, 0.0, Unit.PX, 483.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusTextbox, 54.0, Unit.PX, 128.0, Unit.PX);
		
		Button statusPostButt = new Button("Post");
		layoutPanel.add(statusPostButt);
		layoutPanel.setWidgetLeftWidth(statusPostButt, 14.0, Unit.PX, 61.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusPostButt, 198.0, Unit.PX, 30.0, Unit.PX);
	}
}
