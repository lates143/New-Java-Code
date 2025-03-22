// Count all the occurrences of a character in a string.

package com.StringLogicalPrograms;

public class CountCharecter {

	public static void main(String[] args) {
		String str="Java is my favourite language ";
		int count=0;
		char c='a';
	
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==c) {
				count++;
			}
		}
		System.out.println("No of 'a' in string: "+count);
	}

	}


