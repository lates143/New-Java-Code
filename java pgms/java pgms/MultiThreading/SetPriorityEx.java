package com.MultiThreading;

public class SetPriorityEx extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" Priority of the thread is: "+ Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		SetPriorityEx t0= new SetPriorityEx();
		SetPriorityEx t1= new SetPriorityEx();
		SetPriorityEx t2= new SetPriorityEx();
		
		t2.setPriority(MAX_PRIORITY); // 10
		t1.setPriority(MIN_PRIORITY);// 1
		t0.setPriority(NORM_PRIORITY); // 5
		
			t1.start();
			t2.start();
			t0.start();
	}

}
