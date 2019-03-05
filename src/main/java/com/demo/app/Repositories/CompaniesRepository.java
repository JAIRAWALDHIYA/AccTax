package com.demo.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.Models.Companies;

public interface CompaniesRepository extends JpaRepository<Companies, Long>{

}
