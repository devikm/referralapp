package com.cc.referralapp.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserLogin {

	@Id
	Integer loginUserId;
	
	@Column(name = "username")
	String username;
	
	@Column(name = "password")
	String password;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "failed_attempts")
	Integer failedAttempts;
	
	@Column(name = "status_id")
	Integer statusId;
	
	@Column(name = "enroll_date")
	Date enrollDate;
	
	@Column(name = "contact_number")
	String contactNumber;
	
	@Column(name = "password_expiry_date")
	Date passwordExpiryDate;

	public Integer getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(Integer loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFailedAttempts() {
		return failedAttempts;
	}

	public void setFailedAttempts(Integer failedAttempts) {
		this.failedAttempts = failedAttempts;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getPasswordExpiryDate() {
		return passwordExpiryDate;
	}

	public void setPasswordExpiryDate(Date passwordExpiryDate) {
		this.passwordExpiryDate = passwordExpiryDate;
	}
	
	
}
