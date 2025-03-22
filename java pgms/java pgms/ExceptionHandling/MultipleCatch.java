package com.ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		
		String s="Reverse string";
		String rev="";
		
		String s1=null;
		//System.out.println(s1); // NUll pointer exception
		
		String s2="xyz";
		//int num=Integer.parseInt(s2); // NumberFormatexception
		
		int arr[]= new int[5];
		arr[10]=7; // ArrayIndexOutOfBoundsException
		
		try {
		int a=10/2;
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("End of the program");
	}

}
