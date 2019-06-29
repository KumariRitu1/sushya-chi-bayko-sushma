package com.cg.service;

import com.cg.dao.IUserLogin;
import com.cg.dao.UserLoginImpl;
import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public class UniversityApplicationImpl implements IUniversityApplicatoin {

	private IUserLogin userLoginDAO;

	public UniversityApplicationImpl() {
		userLoginDAO = new UserLoginImpl();
	}



	
	
	@Override
	public boolean authentication(Users users) throws UniversityException {
		// TODO Auto-generated method stub
		return userLoginDAO.authentication(users);
	}

}
