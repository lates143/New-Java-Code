// WAP to find the Second occurrence of a character in a string.
package com.StringLogicalPrograms;

public class SecondOccurenceChar {

	public static void main(String[] args) {
		String str="Java is Programming language";
		char ch='g';
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch==ch1) {
				count++;
			}
			if(count==2) {
				System.out.println("First occurrence of "+ch+" index : "+i);
				break;
			}
		}

	}

}
