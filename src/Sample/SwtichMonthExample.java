package Sample;

import java.util.Scanner;

public class SwtichMonthExample {

	public static void main(String[] args) {

		int month;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a month ");
		month=sc.nextInt();

		switch(month){

		case 1:
		System.out.println("1-January");
		break;
		case 2:
		System.out.println("2-February");
		break;
		case 3:
		System.out.println("3-March");
		break;
		case 4:
		System.out.println("4-April");
		break;
		case 5:
		System.out.println("5-May");
		break;
		case 6:
		System.out.println("6-June");
		break;
		case 7:
		System.out.println("7-July");
		break;
		case 8:
		System.out.println("8-August");
		break;
		default:
		System.out.println("Invalid Month");

		}
		
		
	}

}
