package com.demo.app.Services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.demo.app.Models.User;

@Service
public class UsersService {
	
	Hashtable<String, User> users = new Hashtable<String, User> ();
	
	public UsersService() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		User user = new User();
		user.setAccountID(1);
		user.setEmail("jai@compumatrice.com");
		user.setPassword("password");
		user.setIsActive(1);
		user.setLastLogin(dateFormat.format(date));
		users.put("1", user);
		
		user = new User();
		user.setAccountID(2);
		user.setEmail("rahul@compumatrice.com");
		user.setPassword("password");
		user.setIsActive(1);
		user.setLastLogin(dateFormat.format(date));
		users.put("2", user);
	}
	
	public User getUser(int accountID) {
		Set<String> keySet = users.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			User user = users.get(key);
			if(accountID == user.getAccountID()) {
				return user;
			}
		}
		return null;
	}
	
	public Hashtable<String, User> getAllUsers() {
		return users;
	}
}
