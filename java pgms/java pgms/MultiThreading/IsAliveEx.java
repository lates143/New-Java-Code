package com.MultiThreading;

public class IsAliveEx extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("is run() method is alive : "+ Thread.currentThread().isAlive());
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {

		IsAliveEx t1= new IsAliveEx();
		System.out.println("Before starting thread : "+t1.isAlive());
		t1.start();
		System.out.println("After starting thread : "+t1.isAlive());

	}

}
