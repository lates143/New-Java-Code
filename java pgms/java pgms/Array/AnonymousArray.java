// Anonymous Array in java
package com.Array;

public class AnonymousArray {

	static void print(int[] arr) {
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		
		print(new int[] {10,20,30,40,50});

	}

}
