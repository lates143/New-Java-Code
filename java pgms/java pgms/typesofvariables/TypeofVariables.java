package com.typesofvariables;

public class TypeofVariables {
	
	int data=50; // Instance variable/ Global variable
	
	static int var=100; // static variable
	
	void display() {
		System.out.println("Display method");
		
		TypeofVariables v1= new TypeofVariables();
		//variable.run(); // // variable cannot be resolved(CTE)
		v1.show();
		//show();
	}
	
	void show() {
		System.out.println("Show method");
	}
	
	static void run() {
		System.out.println("Static");
		int a=20; // local variable
		System.out.println(a);
		//System.out.println(data);
		System.out.println(var);
	}
	static {
		System.out.println("Static block");
		run();
		TypeofVariables v1= new TypeofVariables();
		v1.display();
		//variable.display(); // variable cannot be resolved(CTE)
	}
	public static void main(String[] args) {
		
		System.out.println("main");
		
		TypeofVariables variable= new TypeofVariables();
		
		int a=10; // local variable
		System.out.println(a);
		System.out.println(variable.data);
		System.out.println(var);
		
		//variable.display();
		
		//variable.run();
		//run(); 
	}

}
