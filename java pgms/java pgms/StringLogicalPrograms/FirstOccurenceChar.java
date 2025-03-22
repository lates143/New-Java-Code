//  WAP to find the first occurrence of a character in a string.

package com.StringLogicalPrograms;

public class FirstOccurenceChar {

	public static void main(String[] args) {
		
		String str="Java is Programming language";
		char ch='i';
		System.out.println("Occurence of char at index : "+str.indexOf(ch));
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch==ch1) {
				System.out.println("First occurrence of "+ch+" index : "+i);
				break;
			}
		}

	}

}
