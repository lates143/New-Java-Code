package com.Iterators;

public class Triangleofstar {

	public static void main(String[] args) {
		int i,j, rows=6;
		
		for( i=0;i<rows;i++) { // rows
			
			for(j=rows-i;j>1;j--) { 
				
				System.out.print(" ");
			}
			for( j=0;j<=i;j++) { //columns
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}

}
