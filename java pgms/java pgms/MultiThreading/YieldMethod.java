package com.MultiThreading;

public class YieldMethod extends Thread {

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		
		YieldMethod t1= new YieldMethod();
		YieldMethod t2= new YieldMethod();
	
		t1.start();
		t2.start();
		for(int i=0;i<3;i++) {
			t1.yield();
			System.out.println("Main "+Thread.currentThread().getName());
		}	
	}

}
