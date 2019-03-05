package com.demo.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.Models.UserInformation;

public interface UserInformationRepository extends JpaRepository<UserInformation, Long>{

}
