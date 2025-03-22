package com.TypesofMethod;

public class StaticMethod {
	
	public static void show() {
		System.out.println("Show static method");
	}

	public static void main(String[] args) {
		StaticMethod s= new StaticMethod();
		System.out.println("Main method");
		show();
		//s.show();
	}

}
