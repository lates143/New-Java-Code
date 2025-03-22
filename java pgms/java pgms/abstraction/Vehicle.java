package com.abstraction;

public abstract class Vehicle {
	
	int nooftyres;
	abstract void start();
	abstract void display(); 
	
	 void run() {
		 System.out.println("Method of abstract class");
	 }

}
