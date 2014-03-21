package edu.ycp.cs320.awesomepage.shared;

public class Status {
	private int id; //keep track of what user do
	private int userId; // id of the user who posted this status
	private String message;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
