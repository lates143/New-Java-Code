package com.abstraction;

public class Scooter extends Vehicle{
	int nooftyres=2;
	@Override
	void start() {
		System.out.println("Scooter starts with kick");
		
	}

	@Override
	void display() {
		//nooftyres=2;
		
		System.out.println("No of Tyres "+nooftyres);
		
	}
//	@Override
//	void run() {
//		// TODO Auto-generated method stub
//		System.out.println("RIUn   method");
//	}
	public static void main(String[] args) {
	
		//Vehicle V= new Vehicle();
		Vehicle V= new Scooter();
		Scooter S = new Scooter();
		S.start();
		S.display();
//		S.run();
		
		Car C= new Car();
		C.start();
		C.display();
		
		V.run();
		

	}

}
