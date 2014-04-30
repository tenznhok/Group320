package edu.ycp.cs320.awesomepage.shared;

import java.io.Serializable;

public class userInfo implements Serializable {
	private int id; // unique id of this userInfo (may not be same as User id)
	private int userId; // ID of User object
	private String firstName;
	private String lastName;
	private String emailContact;
	private String maleOrFemale;
	private String phoneNum;
	private String country;
	private String city;
	
	public userInfo(){
		
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailContact() {
		return emailContact;
	}
	
	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}
	
	public String getMaleOrFemale() {
		return maleOrFemale;
	}
	
	public void setMaleOrFemale(String maleOrFemale) {
		this.maleOrFemale = maleOrFemale;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	//
	public void editInfo(String firstName, String lastName, String emailContact, String mF, String phoneNum, String country, String city){
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailContact = emailContact;
		this.maleOrFemale = mF;
		this.phoneNum = phoneNum;
		this.country = country;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
