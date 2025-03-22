// Factorial of a number
package com.Iterators;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		double fact=1;
		// int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number :");
		double num=sc.nextInt();
		//int num=sc.nextInt();
		
		for(int i=1;i<=num;++i) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is :"+fact);
		
	}

}
