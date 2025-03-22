package com.MultiThreading;

public class ThreadExample implements Runnable {
//public class ThreadExample extends Thread {
		
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		
		ThreadExample t1= new ThreadExample();
		//t1.start();
		Thread t= new Thread(t1);
		t.start();
		//t1.run();
		
	}

}
