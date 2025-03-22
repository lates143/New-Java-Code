//Program to print or find the duplicate elements of an array.
package com.Array;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,2,1,7,8,8,2,8,1};
		System.out.println("Duplicates element from array: ");
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[i]+" ");
					
				}
			}
				
		}

	}

}
