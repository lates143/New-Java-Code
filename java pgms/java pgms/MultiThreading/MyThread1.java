package com.MultiThreading;

public class MyThread1 implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Thread is running...");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r= new MyThread1();
		Thread t= new Thread(r,"My new thread");
		t.start();
		
		Thread.sleep(5000);
		System.out.println(t.getName());
	}



}
