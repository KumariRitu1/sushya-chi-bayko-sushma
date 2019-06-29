package com.cg.ui;

import java.util.Scanner;

import com.cg.entities.Users;
import com.cg.exception.UniversityException;
import com.cg.service.IUniversityApplicatoin;
import com.cg.service.UniversityApplicationImpl;

public class UniversityApplicationMain {

	public static void main(String[] args) {
		
		IUniversityApplicatoin universityApplication = 
				new UniversityApplicationImpl();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("hi");
		boolean loginFlag = true;
		try
		{
			System.out.println("hi");
			while(loginFlag)
			{
				System.out.println("Enter Userid");
				int id = scan.nextInt();
				System.out.println("Enter password");
				String password = scan.next();
				Users user = new Users(id,password);
				loginFlag =! universityApplication.authentication(user);
				
			}
		}catch(UniversityException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
