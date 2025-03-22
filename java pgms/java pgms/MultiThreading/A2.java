package com.MultiThreading;

class A1 extends Thread{
	int t=0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<=10;i++) {
				t=t+i;
			}this.notify();
		}
	}
}

public class A2 {

	public static void main(String[] args) throws InterruptedException {
		A1 a = new A1();
		a.start();
		synchronized (a) {
			System.out.println("Main Thread");
			a.wait();
			System.out.println("Main thread got notified");
			System.out.println(a.t);
			
		}

	}

}
