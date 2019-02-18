package com.demo.app.Controllers;

import java.util.Hashtable;
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

import com.demo.app.Models.User;
import com.demo.app.Services.UserDAO;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UserDAO userDAO;

	@PostMapping("/saveUser")
	public User createUser(@Valid @RequestBody User user) {
		return userDAO.save(user);
	}
	
	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userDAO.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUserByID(@PathVariable(value="id") Long accountID) {
		
		User user = userDAO.findByID(accountID);
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUserByID(@PathVariable(value="id") Long accountID, @Valid @RequestBody User userDetails) {
		
		User user = userDAO.findByID(accountID);
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		
		User updateUser = userDAO.save(user);
		return ResponseEntity.ok().body(updateUser);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable(value="id") Long accountID) {
		
		User user = userDAO.findByID(accountID);
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		userDAO.delete(accountID);
		return ResponseEntity.ok().build();
	}
		
}
