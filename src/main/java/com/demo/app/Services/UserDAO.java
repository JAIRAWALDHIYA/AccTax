package com.demo.app.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.Models.User;
import com.demo.app.Repositories.UserRepository;

@Service
public class UserDAO {
	
	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findByID(Long accountID) {
		return userRepository.getOne(accountID);
	}
	
	public void delete(Long accountID) {
		userRepository.deleteById(accountID);
	}
}
