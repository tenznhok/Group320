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
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class StatusPosting extends Composite {
	private Button statusPostButt;
	private TextBox statusTextbox;
	public StatusPosting() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("501px", "412px");
		
		statusTextbox = new TextBox();
		layoutPanel.add(statusTextbox);
		layoutPanel.setWidgetLeftWidth(statusTextbox, 0.0, Unit.PX, 483.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusTextbox, 54.0, Unit.PX, 128.0, Unit.PX);
		
		statusPostButt = new Button("Post");
		statusPostButt.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				postingStatus();
			}

			
		});
		layoutPanel.add(statusPostButt);
		layoutPanel.setWidgetLeftWidth(statusPostButt, 14.0, Unit.PX, 61.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusPostButt, 198.0, Unit.PX, 30.0, Unit.PX);
	}
	
	private void postingStatus() {
		
		
		// Switch to webpage view
			WebApp.setView(new webpageView());
		
	}
}
