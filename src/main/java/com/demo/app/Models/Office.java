package com.demo.app.Models;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Office {
	
	int officeID;
	
	String officeName;
	String Address;
	String landline;
	String fax;
	Date registerationDate;
	
	int ownerID;
	int contactPersonID;
	
	public int getOfficeID() {
		return officeID;
	}
	public void setOfficeID(int officeID) {
		this.officeID = officeID;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Date getRegisterationDate() {
		return registerationDate;
	}
	public void setRegisterationDate(Date registerationDate) {
		this.registerationDate = registerationDate;
	}
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public int getContactPersonID() {
		return contactPersonID;
	}
	public void setContactPersonID(int contactPersonID) {
		this.contactPersonID = contactPersonID;
	}
}
