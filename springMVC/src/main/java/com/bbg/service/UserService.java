package com.bbg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bbg.dao.User;
import com.bbg.dao.UserDAO;

@Service
public class UserService {
	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User getUser(int id){
		return userDAO.get(id);
	}
}
