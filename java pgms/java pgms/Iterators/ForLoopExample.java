// Print even and odd numbers between 1-100.
package com.Iterators;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for (int i = 0; i <=100; i++) {
			
			if(i%2==0) {
			System.out.println("Even Number"+i);
			}
			else
				System.out.println("Odd number:"+i);
		}
		
		for (int i = 2; i <=100; i+=2) {			
			System.out.println("Print even numbers: "+i);
		}
		for (int i = 1; i <=100; i+=2) {			
			System.out.println("Print odd numbers: "+i);
		}

	}

}

