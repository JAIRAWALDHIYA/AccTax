package com.demo.app.DAO;

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
	
	public User insertUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User getUserByID(Long accountID) {
		return userRepository.getOne(accountID);
	}
	
	public void deleteUserByID(Long accountID) {
		userRepository.deleteById(accountID);
	}
}
