package com.String;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1= "AGmitG:GundaGwar";
		String s2= "Sagar";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.concat(s2));
		//String[] words=s1.split(" ");
		String[] words=s1.split(":");
		for(String s:words) {
			System.out.println(s);
		}
		System.out.println(s1.length());
		String s3=s1.replace('a','e');
		System.out.println(s3);
		String s4=s1.replaceAll("Gundawar", "Thakre");
		System.out.println(s4);
		System.out.println(s1.substring(0,4));
		System.out.println(s1.charAt(8));
		String s5="";
		System.out.println(s5.isEmpty());
		boolean r=s5.isEmpty();
		if(s5.isEmpty()) {
			System.out.println("Please enter the password");
		}
		int index=s1.indexOf('G');
//		System.out.println("Index of Character: "+s1.indexOf('G'));
		System.out.println("Index of Character: "+index);
		System.out.println("Index of string: "+	s1.indexOf("Gunda"));
		System.out.println("Index of Character after 2nd index: "+	s1.indexOf('G', 2));
		System.out.println("Index of string: "+	s1.indexOf("Gmit",2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		char[] ch=s1.toCharArray();
		for(char i:ch) {
			System.out.print(i+" ");
		}
		boolean b= s1.contains("AGmitG");
		System.out.println("\n"+s1.contains("AGmitG")+" "+b);
		System.out.println(s1.endsWith("war"));
		System.out.println(s1.startsWith("AGm"));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf("war"));
		System.out.println(s1.lastIndexOf('G', 11));
		
		String s6="      Sagar     ";
		System.out.println(s6.trim());
		
	}	

}
