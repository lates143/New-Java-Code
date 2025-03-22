package com.Array;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5,6,7,8,9};
		int[] arr2={1,2,3,4,5,6,7,8,9};
		
		for(int i=0,j=0;i<arr1.length;i++,j++) {
			
//			for(int j=i;j<=i;j++) {
			
				if(arr1[i]==arr2[j]) {
					System.out.println("Equal");
					break;
				}
				else
					System.out.println("Not Equal");
//			}
		}
		if(arr1==arr2) {
			System.out.println("Equal");
		}
		else 
			System.out.println("Not equal");
		
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Equal");
		}
		else
			System.out.println("Not equal");
	}

}
