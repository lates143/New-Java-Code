package com.inheritance;

class Employee{
	
	float salary=12290;
	
	protected void display() {
		System.out.println("asdfhagfdkaj");
	}
}

public class Tester extends Employee {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
	
	float bonus=20000;

	public static void main(String[] args) {
		
		Tester test= new Tester();
		System.out.println(test.salary);
		System.out.println(test.bonus);
		
	}

}
