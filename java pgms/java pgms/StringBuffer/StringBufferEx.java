package com.StringBuffer;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer(); // It reserves the space for 16 characters.
		StringBuffer s1= new StringBuffer("Java is Programming language");
		System.out.println(s1);
//		System.out.println(s.insert(0,"Java is prigraming language sdjdajj"));
		StringBuffer s2= new StringBuffer(5);
		System.out.println(s2.insert(0,"Java is prigraming language "));
		s1.append(" Java ");
		System.out.println(s1);
		s1.insert(0, s2);
		System.out.println(s1);
		s1.insert(0, 19);
		System.out.println(s1);
		s1.replace(0, 4, "python");
		System.out.println(s1);
		System.out.println(s1.delete(0,4));
		//System.out.println(s1.reverse());
		System.out.println(s.capacity()); // (16*2)+3=35
		System.out.println(s1.charAt(0));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 11));
		System.out.println(s1.length());
		
	}

}
