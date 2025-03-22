package com.StringBuilder;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder(); // 16
		System.out.println(sb.capacity());
		sb.append("Java Programming language programiing");//(old capacity*2)+2 ,(oldCapacity+1)*2
		System.out.println(sb.capacity());
		sb.insert(0, "Python ");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.replace(0, 5,"CPP");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.substring(7));
		System.out.println(sb.substring(0, 7));
		System.out.println(sb.reverse());
	}

}
