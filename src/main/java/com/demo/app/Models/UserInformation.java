package com.demo.app.Models;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class UserInformation {
	
	int accountID;
	
	String firstName;
	String lastName;
	Date dob;
	String Address;
	String contactNumber;
	
	String PAN_Number;
	String AADHAR_Number;
	String UAN_Number;
	
	int comapnyID;
	String employeeID;
	String designation;
	
	int roleID;
	int isOwner;
	
	
	public int getIsOwner() {
		return isOwner;
	}
	public void setIsOwner(int isOwner) {
		this.isOwner = isOwner;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}	
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int id) {
		this.accountID = id;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPAN_Number() {
		return PAN_Number;
	}
	public void setPAN_Number(String pAN_Number) {
		PAN_Number = pAN_Number;
	}
	public String getAADHAR_Number() {
		return AADHAR_Number;
	}
	public void setAADHAR_Number(String aADHAR_Number) {
		AADHAR_Number = aADHAR_Number;
	}
	public String getUAN_Number() {
		return UAN_Number;
	}
	public void setUAN_Number(String uAN_Number) {
		UAN_Number = uAN_Number;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getComapnyID() {
		return comapnyID;
	}
	public void setComapnyID(int comapnyID) {
		this.comapnyID = comapnyID;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}	
}
