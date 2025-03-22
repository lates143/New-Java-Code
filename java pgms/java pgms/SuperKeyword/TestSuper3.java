//super() can be used to invoke parent class constructor.  
package com.SuperKeyword;

class Animal3{
	public Animal3() {
		System.out.println("Parent class constructor");
	}
}

class Dog3 extends Animal3{
	
	public Dog3() {
		//super();
		System.out.println("Child class constructor");
	}	
}

public class TestSuper3 {

	public static void main(String[] args) {
				
		Dog3 d= new Dog3();
	}

}
