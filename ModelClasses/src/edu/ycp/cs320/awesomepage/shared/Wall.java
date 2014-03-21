package edu.ycp.cs320.awesomepage.shared;

public class Wall {
	private int id; //keep track of what user do
	private int userId;
	private String status;

	public Wall(){
		
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
