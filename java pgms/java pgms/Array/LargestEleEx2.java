package com.Array;

public class LargestEleEx2 {

	public static void main(String[] args) {
		
		int[] arr= {1,10,8,9,11,7,64,5,6};
		
		int temp;
		System.out.println("Sorted array :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nLargest Element :"+ arr[arr.length-1]);
		System.out.println("Second Largest Element :"+ arr[arr.length-2]);
		System.out.println("Third Largest Element :"+ arr[arr.length-3]);
		System.out.println("Smallest Element :"+ arr[0]);
		System.out.println("Second Smallest Element :"+ arr[1]);
		

	}

}
