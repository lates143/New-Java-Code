package com.Interface;

public class Test implements Showable, Printable{
	
	@Override
	public void show() {
		System.out.println("Show method from showable");
		
	}
	@Override
	public void print() {
		
		System.out.println("Print method from interface");
		Showable.super.print();
	}

	public static void main(String[] args) {
		
		//Showable s= new Showable();
		Showable s= new Test();
		Test t= new Test();
		t.print();
		t.show();
		s.print();
		

	}

}
