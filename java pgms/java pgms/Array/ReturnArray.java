// Java program to return an array from the method
package com.Array;

public class ReturnArray {
	
	static int[] get() {
		
		return new int[]{10,20,30,40,50};
	}

	public static void main(String[] args) {
		
		int arr[]=get();
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

}
