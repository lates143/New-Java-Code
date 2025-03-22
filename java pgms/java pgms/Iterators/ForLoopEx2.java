package com.Iterators;

public class ForLoopEx2 {

	public static void main(String[] args) {
		
		for(int i=5; i<=5;i--) {
			System.out.println(i);
		}
		// This loop will execute till the range of int data type -2^31
	}   // This loop will execute till the JVM memory full.
}
