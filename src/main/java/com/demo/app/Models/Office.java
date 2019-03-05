package com.demo.app.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name="office")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Office {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long officeID;
	
	private Long associatedCompanyID;
	private String officeName;
	private String Address;
	private String landline;
	private String fax;
	private Date registerationDate;
	
	@Column(name="is_active", nullable=false, columnDefinition= "int default 0")
	private int isActive;
	private int ownerID;
	private int contactPersonID;
	private int isHeadOffice;
	
	public Long getOfficeID() {
		return officeID;
	}
	public void setOfficeID(Long officeID) {
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
	public int getIsHeadOffice() {
		return isHeadOffice;
	}
	public void setIsHeadOffice(int isHeadOffice) {
		this.isHeadOffice = isHeadOffice;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public Long getAssociatedCompanyID() {
		return associatedCompanyID;
	}
	public void setAssociatedCompanyID(Long associatedCompanyID) {
		this.associatedCompanyID = associatedCompanyID;
	}	
}
