package Sample;

import java.util.Scanner;

public class Forloopex {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the rows:");
		int rows= sc.nextInt();
		
		//Rows printing
		for(int i= 1; i<=rows; i++) {
			//Column printing
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
		
		}
		
	}


