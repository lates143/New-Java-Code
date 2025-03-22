// WAP to find the Second occurrence of a character in a string.
package com.StringLogicalPrograms;

public class SecondOccurenceChar1 {
	static public int findOccur(String str, char ch, int N) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(ch==str.charAt(i)) {
				count+=1; // count++;
			}
			if(count==N) {
				return i;
			}
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		
		String str="Java is Programming language";
		char ch='w';
		int N=2;
		System.out.println("Second Occurence of char : "+findOccur(str,ch,N));
		

	}

}
