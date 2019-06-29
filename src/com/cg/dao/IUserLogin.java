package com.cg.dao;

import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public interface IUserLogin {
	
	public boolean authentication(Users users) throws UniversityException;
	

}
