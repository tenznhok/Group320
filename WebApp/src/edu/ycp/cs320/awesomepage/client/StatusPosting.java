package edu.ycp.cs320.awesomepage.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbsolutePanel;
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
	private Button btnCancel;
	public StatusPosting() {
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("533px", "412px");
		
		statusTextbox = new TextBox();
		statusTextbox.setVisibleLength(200);
		statusTextbox.setDirectionEstimator(true);
		absolutePanel.add(statusTextbox, 10, 200);
		statusTextbox.setSize("410px", "47px");
		
		statusPostButt = new Button("Post");
		statusPostButt.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				postingStatus();
			}
		});
		absolutePanel.add(statusPostButt, 150, 284);
		statusPostButt.setSize("65px", "30px");
		
		
		Image image = new Image("postingstatus.jpg");
		absolutePanel.add(image, 0, 0);
		image.setSize("430px", "178px");
	
		
		btnCancel = new Button("Cancel");
		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				cancel();
			}

			
		});
		absolutePanel.add(btnCancel, 239, 284);
		
	}
	
	@Override
	public void activate() {
		// Nothing to do (don't need to load data)
	}
	
	private void cancel() {
		// Switch to webpage view
		WebApp.setView(new webpageView());
		
		
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
