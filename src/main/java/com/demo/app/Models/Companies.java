package com.demo.app.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name="Companies")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Companies {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long comapnyID;

	@NotBlank
	private String name;
	private String landline;
	private String fax;
	private String address;
	private String registerationNumber;
	private Date registerationDate;
	
	@Column(name="is_active", nullable=false, columnDefinition= "int default 0")
	private int isActive;
	private int companyType;
	private int headOffice;
	private int hasMultipleOffices;
	
	
	public Long getComapnyID() {
		return comapnyID;
	}
	public void setComapnyID(Long comapnyID) {
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
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
}
