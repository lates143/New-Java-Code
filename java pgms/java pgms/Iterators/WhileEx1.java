//Write a program to print 1-10 numbers and sum of 10 numbers.
package com.Iterators;

public class WhileEx1 {

	public static void main(String[] args) {
		
		int i=1,sum=0;
		
		while(i<=10)
		{
			System.out.println(i);
			sum=sum+i;
			i++;
			
		}
		System.out.println("Sum of 10 numbers:"+sum);

	}

}
