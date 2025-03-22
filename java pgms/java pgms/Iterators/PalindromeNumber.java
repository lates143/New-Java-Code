package com.Iterators;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n=455;
		
		int temp, r; 
		int sum=0;
		
		temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
		
		if(temp==sum) {
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("not palindrome");
		

	}

}
