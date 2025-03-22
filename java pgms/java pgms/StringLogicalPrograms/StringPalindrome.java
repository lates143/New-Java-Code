// To check string is palindrome or not.
package com.StringLogicalPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the string: ");
		String org=sc.next();
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println("Original string: "+org);
		System.out.println("Revrse string: "+rev);
		
		if(org.equals(rev)) {
			System.out.println(org+" String is palindrome");
		}
		else {
			System.out.println(org+" String is not palindrome");
		}
	}

}
