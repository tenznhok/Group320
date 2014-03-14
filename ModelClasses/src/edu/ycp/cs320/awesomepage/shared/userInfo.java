package edu.ycp.cs320.awesomepage.shared;

public class userInfo {
	private String firstName;
	private String lastName;
	private String emailContact;
	private String maleOrFemale;
	private String phoneNum;
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
	
	public void editInfo(String firstName, String lastName, String emailContact, String maleOrFemale, String phoneNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailContact = emailContact;
		this.maleOrFemale = maleOrFemale;
		this.phoneNum = phoneNum;
	}
	

}
