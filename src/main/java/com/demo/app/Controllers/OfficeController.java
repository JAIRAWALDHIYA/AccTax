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

import com.demo.app.DAO.OfficeDAO;
import com.demo.app.Models.Office;

@RestController
@RequestMapping("/office")
public class OfficeController {
	
	@Autowired
	OfficeDAO oDAO;
	
	@PostMapping("/create")
	public Office createOffice(@Valid @RequestBody Office office) {
		return oDAO.insertOffice(office);
	}
	
	@GetMapping("/all")
	public List<Office> getAllOffices() {
		return oDAO.getAllOffices();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Office> getOfficeByID(@PathVariable(value="id")Long officeID) {
		Office office = oDAO.getOfficeByID(officeID);
		if(office == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(office);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Office> getOfficeByID(@PathVariable(value="id")Long officeID, @Valid @RequestBody Office officeDetails) {
		Office office = oDAO.getOfficeByID(officeID);
		if(office == null) {
			return ResponseEntity.notFound().build();
		} 
		office.setAddress(officeDetails.getAddress());
		office.setContactPersonID(officeDetails.getContactPersonID());
		office.setFax(officeDetails.getFax());
		office.setIsActive(officeDetails.getIsActive());
		office.setIsHeadOffice(officeDetails.getIsHeadOffice());
		office.setLandline(officeDetails.getLandline());
		office.setOfficeName(officeDetails.getOfficeName());
		office.setOwnerID(officeDetails.getOwnerID());
		office.setRegisterationDate(officeDetails.getRegisterationDate());
		office.setAssociatedCompanyID(officeDetails.getAssociatedCompanyID());
		
		Office updatedOffice = oDAO.insertOffice(office);
		return ResponseEntity.ok().body(updatedOffice);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Office> deleteOfficeByID(@PathVariable(value="id")Long officeID) {
		Office office = oDAO.getOfficeByID(officeID);
		if(office == null) {
			return ResponseEntity.notFound().build();
		}
		office.setIsActive(0);
		Office deletedOffice = oDAO.insertOffice(office);
		return ResponseEntity.ok().body(deletedOffice);
	}
	
}
