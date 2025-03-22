// Q. Java program to illustrate how to declare , instantiate and traverse an array.
package com.Array;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// Declaration of array
		int[] arr1;
		//int arr2[];
		int arr3[]= {10,20,30,40,50};
		int arr2[]= {1,34,5,56,3,3,44};
		int arr[] = new int[5];
		
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
		System.out.println("Enter elements of an array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		System.out.println("Elements of an array :");
//		//for(int i=0;i<=4;i++) 
//		for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
