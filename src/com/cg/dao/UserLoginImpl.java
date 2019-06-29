package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.employee.util.DBUtil;
import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public class UserLoginImpl implements IUserLogin{
	
	Connection con;
	public UserLoginImpl()
	{
		con = DBUtil.getConnect();
	}
	
	
	@Override
	public boolean authentication(Users users) throws UniversityException {
		
		int id = users.getId();
		String qry = "SELECT password FROM users WHERE id = ?";
		try{
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				return true;
			}  
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage());
		}
		return false;
	}
	
	

}
