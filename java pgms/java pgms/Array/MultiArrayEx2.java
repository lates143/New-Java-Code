package com.Array;

import java.util.Scanner;

public class MultiArrayEx2 {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][2];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values of array: ");
		for(int i=0;i<2;i++) // rows
		{
			for(int j=0;j<2;j++) // Column 
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("elements of array");
		for(int i=0;i<2;i++) // rows
		{
			for(int j=0;j<2;j++) // Column 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
