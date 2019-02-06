package com.demo.app.Models;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Companies {
	
	int comapnyID;
	
	String name;
	String address;
	String registerationNumber;
	Date registerationDate;
	String landline;
	String fax;
	
	int companyType;
	int headOffice;
	int hasMultipleOffices;
	
	
	public int getComapnyID() {
		return comapnyID;
	}
	public void setComapnyID(int comapnyID) {
		this.comapnyID = comapnyID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegisterationNumber() {
		return registerationNumber;
	}
	public void setRegisterationNumber(String registerationNumber) {
		this.registerationNumber = registerationNumber;
	}
	public Date getRegisterationDate() {
		return registerationDate;
	}
	public void setRegisterationDate(Date registerationDate) {
		this.registerationDate = registerationDate;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landLine) {
		this.landline = landLine;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public int getCompanyType() {
		return companyType;
	}
	public void setCompanyType(int companyType) {
		this.companyType = companyType;
	}
	public int getHeadOffice() {
		return headOffice;
	}
	public void setHeadOffice(int headOffice) {
		this.headOffice = headOffice;
	}
	public int getHasMultipleOffices() {
		return hasMultipleOffices;
	}
	public void setHasMultipleOffices(int hasMultipleOffices) {
		this.hasMultipleOffices = hasMultipleOffices;
	}
}
