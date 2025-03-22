//Two ways to create a string.
package com.String;

public class StringExample {
	
	StringExample(String str){
		System.out.println("String from constructor:"+str);
	}
	
	public static void main(String[] args) {
		
		StringExample SE= new StringExample("String");
	
		String s="Sagar"; // By using string literal
		String s1= new String("Sagar"); // Creating a string using new keyword.

		System.out.println("By using string literal :"+s);
		System.out.println("String using new keyword :"+s1);
		
		char ch[]= {'s','t','r','i','n','g'};
		String s2= new String(ch);
		System.out.println("Converting array to string :"+s2);
	}

}
