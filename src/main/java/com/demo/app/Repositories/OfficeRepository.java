package com.demo.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.Models.Office;

public interface OfficeRepository extends JpaRepository<Office, Long>{

}
