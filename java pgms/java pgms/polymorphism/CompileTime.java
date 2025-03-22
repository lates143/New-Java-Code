package com.polymorphism;

public class CompileTime {
	
	void display() {
		System.out.println("Non parameterized display");
	}
	
	void display(int a) {
		System.out.println("parameterized display"+a);
	}

	public static void main(String[] args) {
		
		CompileTime CT= new CompileTime();
		CT.display();
		CT.display(10);

	}

}
