package com.MultiThreading;

public class CurrentThreadEx extends Thread{
	
	@Override
	public void run() {
		// Printing currently executing thread
		System.out.println(Thread.currentThread().getName());
		display();
	}
	void display() {
		System.out.println("Display method");
	}

	public static void main(String[] args) {
		// Creating Threads
		CurrentThreadEx t1= new CurrentThreadEx();
		CurrentThreadEx t2= new CurrentThreadEx();
		CurrentThreadEx t3= new CurrentThreadEx();
		CurrentThreadEx t4= new CurrentThreadEx();
		
		// Invoking Threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
