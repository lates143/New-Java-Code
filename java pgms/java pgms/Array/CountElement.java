package com.Array;
// COunt the number of occurrences of an element
public class CountElement {

	public static void main(String[] args) {
		int n=1;
		int count=0;
		int[] arr= {1,2,3,4,2,1,7,8,8,1,1,1,1,1,1};
	
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]==1) {
					
					count++;	
				}		
		}
		System.out.println("Number of occurences of an element "+ n+ ": "+count);

	}

}
