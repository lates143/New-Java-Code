package com.Iterators;

// Print square of star
import java.util.Scanner;

public class SquareofStar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows= sc.nextInt();
//		System.out.println("Enter columns :");
//		int columns= sc.nextInt(); // Rectangle
		for(int i=1;i<=rows;i++) { // rows
			for(int j=1;j<=rows;j++) { //columns
				System.out.print(" "+"*");
			}
			System.out.println("  ");
		}
	}

}
