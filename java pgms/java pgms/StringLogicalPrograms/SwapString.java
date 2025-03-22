// Swap two strings
package com.StringLogicalPrograms;

public class SwapString {

	public static void main(String[] args) {
		String s1= "Java";
		String s2= "Python";
		System.out.println("Before Swap:"+s1+" "+s2);
		
//		String temp="";
//		temp=s1;
//		s1=s2;
//		s2=temp;
		
		// Without using third variable. JavaPython 
		s1=s1+s2; // Concat two strings 
		s2=s1.substring(0, s1.length()-s2.length()); // Java
		s1=s1.substring(s2.length()); // 4
		
		System.out.println("After Swap:"+s1+" "+s2);

	}

}
