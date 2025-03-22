package com.ExceptionHandling;

public class UserDefinedException extends Exception {

	public UserDefinedException(String str) {
		super(str); // Calling constructor of parent Exception
	}

	public static void main(String[] args) {
		try {
		throw new UserDefinedException("This is user defined exception");
		}
		catch (UserDefinedException ude) {
			System.out.println("Exception has caught");
			System.out.println(ude.getMessage());
		}
	}
}
