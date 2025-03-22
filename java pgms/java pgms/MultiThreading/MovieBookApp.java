package com.MultiThreading;

class TotalEarnings extends Thread{

	int total=0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				
				total=total+100;
			}
			this.notify(); // Notify to main thread // lock release
		} 
	}
}
public class MovieBookApp{
	
	public static void main(String[] args) throws InterruptedException {
		TotalEarnings te= new TotalEarnings();
		te.start();  // Thread-0
//		System.out.println("Total Earnings: "+te.total+" rs"); //0
		
		synchronized (te) {
			te.wait(); // Main thread waiting state
			System.out.println("Total Earnings: "+te.total+" rs");
		}
		System.out.println("Total Earnings: "+te.total+" rs");
	}
}