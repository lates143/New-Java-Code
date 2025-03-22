package com.abstraction;

public class Car extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Car starts with key");
	}
	@Override
	void display() {
		nooftyres=4;
		System.out.println("Tyres of car :"+nooftyres);
		
	}
	
}
