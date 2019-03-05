package com.demo.app.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.Models.Office;
import com.demo.app.Repositories.OfficeRepository;

@Service
public class OfficeDAO {
	
	@Autowired
	OfficeRepository oRepository;
	
	public Office insertOffice(Office office) {
		return oRepository.save(office);
	}
	
	public List<Office> getAllOffices() {
		return oRepository.findAll();
	}
	
	public Office getOfficeByID(Long officeID) {
		return oRepository.getOne(officeID);
	}
	
	public void deleteUserByID(Long officeID) {
		oRepository.deleteById(officeID);
	}
}
