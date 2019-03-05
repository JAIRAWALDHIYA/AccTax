package com.demo.app.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.DAO.UserInformationDAO;
import com.demo.app.Models.UserInformation;

@RestController
@RequestMapping("/userInfo")
public class UserInformationController {

	@Autowired
	UserInformationDAO uiDAO;
	
	@PostMapping("/create")
	public UserInformation insertUserInfo(@Valid @RequestBody UserInformation userInfo) {
		return uiDAO.insertUserInfo(userInfo);
	}
	
	@GetMapping("/all")
	public List<UserInformation> getAllUsersInfo() {
		return uiDAO.getAllUsersInfo();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<UserInformation> getUserInfoByID(@PathVariable(value="id") Long accountID) {
		
		UserInformation userInfo = uiDAO.getUserInfoByID(accountID);
		if(userInfo == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(userInfo);
	}
	
	@GetMapping("/update/{id}")
	public ResponseEntity<UserInformation> updateUserInfoByID(@PathVariable(value="id") Long accountID, @Valid @RequestBody UserInformation updatedUserInfo) {
		
		UserInformation userInfo = uiDAO.getUserInfoByID(accountID);
		if(userInfo == null) {
			return ResponseEntity.notFound().build();
		}
		userInfo.setAADHAR_Number(updatedUserInfo.getAADHAR_Number());
		userInfo.setAddress(updatedUserInfo.getAddress());
		userInfo.setContactNumber(updatedUserInfo.getContactNumber());
		userInfo.setDesignation(updatedUserInfo.getDesignation());
		userInfo.setDob(updatedUserInfo.getDob());
		userInfo.setEmployeeID(updatedUserInfo.getEmployeeID());
		userInfo.setFirstName(updatedUserInfo.getFirstName());
		userInfo.setIsOwner(updatedUserInfo.getIsOwner());
		userInfo.setLastName(updatedUserInfo.getLastName());
		userInfo.setOfficeID(updatedUserInfo.getOfficeID());
		userInfo.setPAN_Number(updatedUserInfo.getPAN_Number());
		userInfo.setRoleID(updatedUserInfo.getRoleID());
		userInfo.setUAN_Number(updatedUserInfo.getUAN_Number());
		
		UserInformation updateUserInfo = uiDAO.insertUserInfo(userInfo);
		return ResponseEntity.ok().body(updateUserInfo);
	}
}
