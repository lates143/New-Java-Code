package com.constructor;

public class DefaultConstructor {
	int id; 
	int name; 
	
	void display() {
		id=1;
		name=2;
		System.out.println(id+" "+name);
	}
	public DefaultConstructor() {
//		id=2;
//		name=3;
		System.out.println(id+" "+name);
		System.out.println("Default Constructor");
	}
	void show() {
		System.out.println("Show method");
		System.out.println(id+ " "+name);
	}
	public static void main(String[] args) {
		
		DefaultConstructor d= new DefaultConstructor();
		DefaultConstructor d1= new DefaultConstructor();
		d.display();
		d1.display();
		d.show();

	}

}
