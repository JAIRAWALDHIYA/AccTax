package com.demo.app.Models;

import org.springframework.stereotype.Component;

@Component
public class User {
	int accountID;
	
	String email;
	String password;
	
	int isActive;
	String lastLogin;
	
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int id) {
		this.accountID = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String string) {
		this.lastLogin = string;
	}
}
