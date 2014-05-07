package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

import edu.ycp.cs320.awesomepage.shared.User;
import com.google.gwt.user.client.ui.Image;

public class StatusPosting extends Composite implements View {
	private Button statusPostButt;
	private TextBox statusTextbox;
	public StatusPosting() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("501px", "412px");
		
		statusTextbox = new TextBox();
		layoutPanel.add(statusTextbox);
		layoutPanel.setWidgetLeftWidth(statusTextbox, 0.0, Unit.PX, 483.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusTextbox, 197.0, Unit.PX, 82.0, Unit.PX);
		
		statusPostButt = new Button("Post");
		statusPostButt.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				postingStatus();
			}
		});
		layoutPanel.add(statusPostButt);
		layoutPanel.setWidgetLeftWidth(statusPostButt, 11.0, Unit.PX, 61.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(statusPostButt, 303.0, Unit.PX, 30.0, Unit.PX);
	}
	
	@Override
	public void activate() {
		// Nothing to do (don't need to load data)
	}
	
	private void postingStatus() {
		
		User user = Session.getInstance().getUser();
		int userID = user.getUserID();
		
		String status = String.valueOf(statusTextbox.getText());
		RPC.statusService.postStatus( user, status, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// Status posted successfully
				
				// Switch to webpage view
				WebApp.setView(new webpageView());
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO: display error message in UI
			}
		});
	}
}
