package com.demo.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.app.Models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
