//Find out largest element from an array.
package com.Array;

public class LargestEleArray {

	public static void main(String[] args) {
		
		int arr[]= {1,10,8,9,11,7,64,5,6};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
					
				if(arr[i]> max) {
					
					max=arr[i];
					System.out.print(max+" ");
				}
		}
		System.out.println("\nLargest Element form an array : "+max);
	}

}
