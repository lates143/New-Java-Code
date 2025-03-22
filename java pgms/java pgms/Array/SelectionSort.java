package com.Array;

import java.util.Arrays;

public class SelectionSort {
	
	
	public void selectionSort(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[minindex]) {
				minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]= arr[minindex];
			arr[minindex]= temp;
		}		
	}

	public static void main(String[] args) {
		 int[] data = new int[] {20,12,10,15,2};
		 
		 SelectionSort ss= new SelectionSort();
		 ss.selectionSort(data);
		 System.out.println("Sorted array is"+ Arrays.toString(data));
	}

}
