package edu.ycp.cs320.awesomepage.shared;

public class User {
	private int id; //every user have an ID
	private String userName;
	private String password;
	private String email;
	
	public User(String name, String password) {
		
		this.userName = name;
		this.password = password;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail() {
		this.email = email;
	}
	
	public String getEmail() {
		return password;
	}
}
