// Count number of digits in an integer number.
package com.Iterators;

public class CountDigits {

	public static void main(String[] args) {
		
		int num=33000114; //  if a-->0 outpu - digit is 0
		int count=0;	 // a--->1-9  outpu - digit is not 0
		while(num!=0){
			num=num/10; 
			System.out.println(num);
			++count;	
		}		
		System.out.println("Number of digits :"+count);
	}

}
