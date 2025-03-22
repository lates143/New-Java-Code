package com.TypesofMethod;

import java.util.Scanner;

class Info{
	static String name="";
	static long mob;
	static String city="";
	static String desg="";
	static String Gender="";
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter User info");
		System.out.println("Enter name :");
		name+=sc.nextLine();
		System.out.println("Enter number :");
		mob=sc.nextLong();		
		System.out.println("Enter city :");
		city=sc.next();
		System.out.println("Enter Desg :");
		desg=sc.next();
		desg+=sc.nextLine();
		System.out.println("Enter Gender :");
		Gender=sc.next();	
	}
	void display() {
		System.out.println("name is :"+name);
		System.out.println("Number is :"+mob);
		System.out.println("City is :"+city);
		System.out.println("Desg is :"+desg);
		System.out.println("gender is :"+Gender);
	}
}

public class UserInfo {

	public static void main(String[] args) {
		Info info= new Info();
		Info info1 = new Info();
		//info.input();
		info1.input();
		info1.display();
	}

}
