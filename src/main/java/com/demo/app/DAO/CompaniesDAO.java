package com.demo.app.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.Models.Companies;
import com.demo.app.Repositories.CompaniesRepository;

@Service
public class CompaniesDAO {
	
	@Autowired
	CompaniesRepository cRepository;
	
	public Companies insertCompany (Companies companies) {
		return cRepository.save(companies);
	}
	
	public void deleteCompanyById (Long companyID) {
		cRepository.deleteById(companyID);
	}
	
	public List<Companies> getAllCompanies() {
		return cRepository.findAll();
	}
	
	public Companies getCompanyByID(Long companyID) {
		return cRepository.getOne(companyID);
	}
}
