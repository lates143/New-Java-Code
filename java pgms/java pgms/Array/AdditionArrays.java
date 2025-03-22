package com.Array;

import java.util.Scanner;

public class AdditionArrays {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][3];
		int arr1[][] = new int[2][2];
		int res[][] = new int[2][3];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values of array: ");
		for(int i=0;i<2;i++) // rows
		{
			for(int j=0;j<3;j++) // Column 
			{
				arr[i][j]=sc.nextInt();
				//arr1[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter values of 2nd array");
		for(int i=0;i<2;i++) // rows
		{
			for(int j=0;j<2;j++) // Column 
			{
				//arr[i][j]=sc.nextInt();
				arr1[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Addition of an array: ");
		for(int i=0;i<2;i++) // rows
		{
			for(int j=0;j<2;j++) // Column 
			{
				arr1[i][j]=arr[i][j] + arr1[i][j];
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
