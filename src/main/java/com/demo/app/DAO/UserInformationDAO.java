package com.demo.app.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.Models.UserInformation;
import com.demo.app.Repositories.UserInformationRepository;

@Service
public class UserInformationDAO {
	
	@Autowired
	UserInformationRepository uiRepository;
	
	public UserInformation insertUserInfo(UserInformation userInfo) {
		return uiRepository.save(userInfo);
		
	}
	
	public List<UserInformation> getAllUsersInfo() {
		return uiRepository.findAll();
	}
	
	public UserInformation getUserInfoByID(Long accountID) {
		return uiRepository.getOne(accountID);
	}
	
	public void deleteUserByID(Long accountID) {
		uiRepository.deleteById(accountID);
	}
}
