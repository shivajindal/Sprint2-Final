package com.matchzone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	/*Marking userEmail as @Id, as an identifier for the row
	 * */
	@Id
	private String userEmail;
	private String userName;
	private String userRole="Employee";
	/*For not saving the userPassword in the database
	 * we are marking userPassword as Transient
	 * */
	@Transient
	private String userPassword;
	
	public User() {}

	public User(String userEmail, String userName, String userRole, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userRole = userRole;
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userName=" + userName + ", userRole=" + userRole + ", userPassword="
				+ userPassword + "]";
	}
	
}
