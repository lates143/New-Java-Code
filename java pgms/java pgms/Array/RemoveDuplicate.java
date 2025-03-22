// Write a java program to remove duplicate elements from array.
package com.Array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static int removeDupli(int[] arr, int len) {
		
		if(len==0 || len==1) {
			return len;
		}
		
		int[] temp= new int[len]; // len=9
		int j=0; // For next element
		for(int i=0;i<len-1;i++) { // i=0,1,2,3,4,5
			if(arr[i] !=arr[i+1]) { // {1 2 2 3 3 4 7 8 8 };
				temp[j++]=arr[i];  // temp={1,2,3,4,7,8};
			}
		}
		
		temp[j++]=arr[len-1];
		// Changing original array.
		for(int  i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
	
		int[] arr= new int[] {1,2,3,4,2,7,8,8,3};
		
		// Sorting Array
		int temp;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		//Arrays.sort(arr);
		
		int length=arr.length; //9 1
		length=removeDupli(arr,length); //6

		for(int i=0; i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
