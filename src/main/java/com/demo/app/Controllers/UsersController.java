package com.demo.app.Controllers;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.Models.User;
import com.demo.app.Services.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersService us;
	
	@RequestMapping("/all")
	public Hashtable<String, User> getAll() {
		//System.out.println("jainarayan");
		return us.getAllUsers();
	}
	
	@RequestMapping("{id}")
	public User getUser(@PathVariable("id") int id) {
		return us.getUser(id);
	}
}
