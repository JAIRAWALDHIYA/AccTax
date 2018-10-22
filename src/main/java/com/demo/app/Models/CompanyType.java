package com.demo.app.Models;

import org.springframework.stereotype.Component;

@Component
public class CompanyType {
	int companyTypeID;
	String companyType;
	
	public int getId() {
		return companyTypeID;
	}
	public void setId(int id) {
		this.companyTypeID = id;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
}
