package com.ExceptionHandling;

public class ThrowKeyword {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible");
		}
		else {
			System.out.println("Person is eligible");
		}
	}

	public static void main(String[] args) {
		try {
		validate(19);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("End of code");
	}

}
