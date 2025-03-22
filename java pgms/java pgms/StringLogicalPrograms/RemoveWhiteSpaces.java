// Remove white spaces from given string
package com.StringLogicalPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="Java is Programming language";
		//StringBuffer str1= new StringBuffer("Java is Programming language");
		String s="";
		System.out.println("Before removing white spaces: "+ str);
		//System.out.println("After removing white spaces: "+str.replaceAll("\\s", ""));
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch1!=' ') {
				s=s+str.charAt(i);
			}
		}
		System.out.println("After removing white spaces: "+ s);
	}

}
// Remove white spaces from string and save the string in the same variable. 
// Reverse the string 1. Using string literal 2.Change Same string.




