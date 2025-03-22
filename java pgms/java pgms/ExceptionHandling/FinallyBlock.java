package com.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
			int num=10/0;
			System.out.println(num);
		}
		catch (Exception e) {
			System.out.println(e);
			//System.exit(0);
		}
		finally {
			System.out.println("Finally Block");
		}		
		System.out.println("End of code");
	}

}
