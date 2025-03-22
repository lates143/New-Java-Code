package com.MultiThreading;

public class JoinExample extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
		
			try {
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		JoinExample t0= new JoinExample();
		JoinExample t1= new JoinExample();
		JoinExample t2= new JoinExample();
		
		t0.start();
		
		try {
			t0.join(500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		t1.start();
		t2.start();

	}

}
