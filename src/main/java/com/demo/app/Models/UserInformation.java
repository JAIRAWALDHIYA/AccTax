package com.demo.app.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name="UserInformation")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserInformation {
	
	@Id
	private Long accountID;
	
	/**
	 * Here we are not generating new accountID as accountID is a foreign key coming from Users model.
	 * Also User and UserInformation models have one to one relation, therefore the same accountID is common between 
	 * both tables.
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private User user;
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	private Date dob;
	private String Address;
	private String contactNumber;
	
	private String PAN_Number;
	private String AADHAR_Number;
	private String UAN_Number;
		
	private int officeID;
	private String employeeID;
	private String designation;
	
	private int roleID;
	private int isOwner;
	
	
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
	public Long getAccountID() {
		return accountID;
	}
	public void setAccountID(Long id) {
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
	public int getOfficeID() {
		return officeID;
	}
	public void setOfficeID(int officeID) {
		this.officeID = officeID;
	}
}
