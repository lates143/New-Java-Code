package com.Iterators;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows= sc.nextInt();
		for(int i=1;i<=rows;i++) { // rows 
			for(int j=1;j<=i;j++) { // columns
				System.out.print("*");
			}
			System.out.println("  ");
		}

	}

}
