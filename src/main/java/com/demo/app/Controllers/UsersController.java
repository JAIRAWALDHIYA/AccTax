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

import com.demo.app.DAO.UserDAO;
import com.demo.app.Models.User;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UserDAO userDAO;

	@PostMapping("/create")
	public User createUser(@Valid @RequestBody User user) {
		return userDAO.insertUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUserByID(@PathVariable(value="id") Long accountID) {
		
		User user = userDAO.getUserByID(accountID);
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUserByID(@PathVariable(value="id") Long accountID, @Valid @RequestBody User userDetails) {
		
		User user = userDAO.getUserByID(accountID);
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		
		User updateUser = userDAO.insertUser(user);
		return ResponseEntity.ok().body(updateUser);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable(value="id") Long accountID) {
		
		User user = userDAO.getUserByID(accountID);
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		//We are not hard deleting any entity details.
		user.setIsActive(0);
		User deletedUser = userDAO.insertUser(user);
		return ResponseEntity.ok().body(deletedUser);
	}
		
}
