package com.demo.app.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.DAO.CompaniesDAO;
import com.demo.app.Models.Companies;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

	@Autowired
	CompaniesDAO cDAO;
	
	@PostMapping("/create")
	public Companies createCompany(@Valid @RequestBody Companies company) {
		return cDAO.insertCompany(company);
	}
	
	@GetMapping("/all")
	public List<Companies> getAllCompanies() {
		return cDAO.getAllCompanies();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Companies> getCompany(@PathVariable(value="id") Long companyID) {
		Companies company = cDAO.getCompanyByID(companyID);
		if(company == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(company);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Companies> updateCompanyDetails(@PathVariable(value="id") Long companyID, @Valid @RequestBody Companies companyDetails){
		Companies company = cDAO.getCompanyByID(companyID);
		if(company == null) {
			return ResponseEntity.notFound().build();
		} 
		company.setAddress(companyDetails.getAddress());
		company.setCompanyType(companyDetails.getCompanyType());
		company.setFax(companyDetails.getFax());
		company.setHasMultipleOffices(companyDetails.getHasMultipleOffices());
		company.setHeadOffice(companyDetails.getHeadOffice());
		company.setLandline(companyDetails.getLandline());
		company.setName(companyDetails.getName());
		company.setRegisterationDate(companyDetails.getRegisterationDate());
		company.setRegisterationNumber(companyDetails.getRegisterationNumber());
		company.setIsActive(companyDetails.getIsActive());
		
		Companies updatedCompany = cDAO.insertCompany(company);
		return ResponseEntity.ok().body(updatedCompany);	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Companies> deleteUser(@PathVariable(value="id") Long companyID) {
		
		Companies company = cDAO.getCompanyByID(companyID);
		if(company == null) {
			return ResponseEntity.notFound().build();
		}
		//We are not hard deleting any entity details.
		company.setIsActive(0);
		Companies deletedcompany = cDAO.insertCompany(company);
		return ResponseEntity.ok().body(deletedcompany);
	}
}
