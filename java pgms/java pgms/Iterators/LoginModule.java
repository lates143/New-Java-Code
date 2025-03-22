package com.Iterators;

import java.util.Scanner;

public class LoginModule {

	public static void main(String[] args) {
		
		String email="ravi@gmail.com";
		String pwd1="Ravi@123";

		String emailid;
		String pwd;

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Email id:");
		emailid=sc.next();
		System.out.print("Enter Password:");
		pwd=sc.next();

		if(emailid.equals(email) && pwd.equals(pwd1)){

		System.out.println("Login Successfull");
		}
		else
		System.out.println("Login Failed");


	}

}
