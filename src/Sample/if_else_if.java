package Sample;

import java.util.Scanner;

public class if_else_if {

	public static void main(String[] args) {
		
		int marks;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter marks:");
		marks= sc.nextInt();
		
		/* 	if(marks <= 50) {
			System.out.println("fail");
		}
		else
			System.out.println("Pass"); */
		
		if(marks == 50) {
			System.out.println("Pass");
		}
		
		if(marks<50) {
			System.out.println("fail");
		}
		if(marks>50) {
			System.out.println("pass");
		}

	}

}
