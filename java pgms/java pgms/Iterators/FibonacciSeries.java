// Generate fibonacci series for first n numbers
package com.Iterators;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int count=sc.nextInt();
		System.out.println("Enter a first number:");
		int n1=sc.nextInt();
		System.out.println("Enter a Second number:");
		int n3, n2=sc.nextInt();
		//int n3;
		//int n1=0,n2=1,n3;
		//System.out.println(n1+" "+n2);// Printing 0 and 1
		
		//10--> 0 1 2 3 4 5 6 7 8 9 10
		for(int i=0;i<count;i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
