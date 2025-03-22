package com.Interface;

public interface I1 {
	
	int var=10;
	public static final int b=20;
	public abstract void show();
	void print();
	// 8th version
	default void display() {
		System.out.println("Default Concrete method ");
		watch(); // calling private method
		//this.watch();
	}
	
	public static void run() { // By default compiler provide public keyword
		System.out.println("Static method of I1");
	}
	
	// 9th version
	
	private void watch() {
		System.out.println("Watch private method");
	}
	
}
