// It is used to invoke parent class methods().
package com.SuperKeyword;

class Animal1{
	
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog1 extends Animal1{
	
	@Override
	void eat() {
		System.out.println("Dog Eating..");
	}
	void bark() {
		System.out.println("Barking...");
	}
	void work() {
	super.eat();
	this.eat();
	this.bark();
	}
	
}
public class TestSuper2 {

	public static void main(String[] args) {
		Dog1 d= new Dog1();
		d.work();

	}

}
