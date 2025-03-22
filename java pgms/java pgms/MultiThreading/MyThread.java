package com.MultiThreading;

public class MyThread {

	public static void main(String[] args) {
		
		Thread t = new Thread("My first Thread");
		
		t.start();
		String str= t.getName();
		System.out.println(str);

	}

}
