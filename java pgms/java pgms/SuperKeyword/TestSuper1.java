// It is used to refer the parent class instance variables.
package com.SuperKeyword;

class Animal{
	String color="black";
}

class Dog extends Animal{
	String color="white";
	
	void printColor() {
//		System.out.println(color);
		System.out.println(color+" "+super.color);
	}
}

public class TestSuper1 {

	public static void main(String[] args) {
		
		Dog d= new Dog();
		d.printColor();

	}

}
