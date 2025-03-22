package com.typesofvariables;

import java.util.Scanner;

public class Marks1 {
	int mark;
	String subject;
	
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the subject and marks");
		mark=sc.nextInt();
		subject=sc.next();
		display();
	}
	void display() {
		Student s1= new Student();
		System.out.println("Id is "+s1.id);
		System.out.println("Name is "+s1.name);
		System.out.println("Subject is "+ subject);
		System.out.println("Marks is "+mark);
	}	

}
