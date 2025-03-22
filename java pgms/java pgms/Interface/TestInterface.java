package com.Interface;

public class TestInterface implements I1,I2{
	
	@Override
	public void show() {
		System.out.println("Show method from I1");
		
	}
	@Override
	public void print() {
		
		System.out.println("Print method from I1");
	}

	@Override
	public void display() {
		System.out.println("Display method from I2 ");
		I1.super.display();
	}
	public static void main(String[] args) {
		// I1 i1= new I1();
		TestInterface t= new TestInterface();
		t.show();
		t.print();
		t.display();
		I1.run();
	}

}
