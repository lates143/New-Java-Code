package com.polymorphism;

class Main{
	
	void display() {
		System.out.println("Main class display method");
	}
}
public class RunTime extends Main{
	
	@Override
	void display() {
		System.out.println("Child class display method");
		super.display();
	}
	void run() {
		System.out.println("Child class Run");
	}

	public static void main(String[] args) {
		
		RunTime RT= new RunTime();
		RT.display();
		RT.run();

	}

}
