package com.MultiThreading;

public class UserdefinedPriority extends Thread {
	
	@Override
	public void run() {
		//System.out.println("Running..");
		System.out.println("priority of thread is : "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
	
		UserdefinedPriority t0= new UserdefinedPriority();
		UserdefinedPriority t1= new UserdefinedPriority();
		UserdefinedPriority t2= new UserdefinedPriority();
		
		t1.setPriority(4);
		t2.setPriority(6);
		t0.setPriority(10);
		
//		System.out.println("priority of thread is : "+t0.getPriority());
//		System.out.println("priority of thread is : "+t1.getPriority());
//		System.out.println("priority of thread is : "+t2.getPriority());
		
		t1.start();
		t0.start();
		t2.start();

	}

}
