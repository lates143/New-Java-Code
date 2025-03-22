package com.UseOfthiskeyword;

public class MethodUseofthis {
	
	public MethodUseofthis() {
		
		// Call to display method
		this.input();	
	}
	void input() {
		System.out.println("input method");
		this.display();
	}
	void display() {
		System.out.println("Display method");
		display1();
	}
	void display1() {
		System.out.println("Display1 method");
		display2();
	}
	void display2() {
		System.out.println("Display2 method");
		
	}
	public static void main(String[] args) {
		
		MethodUseofthis mu= new MethodUseofthis();

	}

}
