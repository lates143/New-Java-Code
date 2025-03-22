package com.String;

public class DiffEqualandEqualto {

	public static void main(String[] args) {
		
		String s1= "hello";
		String s2= "hello";
		String s3= "Hello";
		
		String s4= new String("Java").intern();
		String s5= new String("Java").intern();
		
		
		if(s1==s2) {
			System.out.println("Strings are equal");
		}
		if(s1==s3) {
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
		
		if(s4==s5) {
			System.out.println("String are equal");
		}
		else
			System.out.println("Not equal");
		
		if(s4.equals(s5))
			System.out.println("String are equal");
	}

}
