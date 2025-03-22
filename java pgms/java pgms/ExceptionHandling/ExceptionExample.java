package com.ExceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int a=10/0; // The code that raise exception
		}
		catch (ArithmeticException e) {
				System.out.println(e);
		}	
		
		System.out.println("End of the program");

	}

}
