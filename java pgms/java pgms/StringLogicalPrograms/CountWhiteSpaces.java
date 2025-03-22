// Count white spaces in string
package com.StringLogicalPrograms;

public class CountWhiteSpaces {

	public static void main(String[] args) {
		
		String str=" Java is my favourite language ";
		int count=0;
		
		System.out.println(str.length());
		//System.out.println("White Spaces in string :"+ (str.length()-str.replace(" ","").length()));
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("No of white spaces in string: "+count);
	}

}
