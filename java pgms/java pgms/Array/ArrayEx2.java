// Passing array to a method 
package com.Array;

public class ArrayEx2 {

	static void minMax(int arr[]) {
		
		int min=arr[0]; 
		int max=arr[0]; 
		
		for(int i=0;i<=arr.length-1;i++) {
		
		if(min>arr[i]) {
			
			min=arr[i];
		}
		if(max<arr[i]) {
			
			max=arr[i];
		}
	}
	System.out.println("Minimum number from array:"+ min);	
	System.out.println("Maximum number from array:"+ max);	
}
	

	public static void main(String[] args) {
		
		int a[]= {33,44,3,6,76,5};
		
		minMax(a);
	}

}
