package com.Iterators;

import java.util.Scanner;

public class RectangleofStar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows= sc.nextInt();
		System.out.println("Enter columns :");
		int columns= sc.nextInt(); 
		System.out.println("Enter char :");   
		char ch= sc.next().charAt(0); 
		System.out.println(ch);
		for(int i=1;i<=rows;i++) { // rows
			for(int j=1;j<=columns;j++) { //columns
				System.out.print(" "+"*");
			}
			System.out.println("  ");
		}

	}

}
