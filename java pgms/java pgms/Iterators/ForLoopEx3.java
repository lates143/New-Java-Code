package com.Iterators;

public class ForLoopEx3 {

	public static void main(String[] args) {
		int add=0;
		
		for (int i = 1; i <=5; i++) {
			
			System.out.println(i);
			
			add=add+i;
			//break;
			System.exit(0);
		}
		System.out.println("Addition is :"+add);
	}

}
