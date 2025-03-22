// Print non duplicate/ non repeated elements from array.
package com.Array;

public class NonDuplicate {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,2,7,8,8,3};
		int i,j;
		int n=arr.length;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(arr[i] == arr[j] && i!=j) {	
					break;
				}	
			}
			if(j==n) {
				
				System.out.println("Non repeated element: "+arr[i]);
			}
		}
		
	}
}
