package com.cg.service;

import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public interface IUniversityApplicatoin {
	public boolean authentication(Users users) throws UniversityException;

}
