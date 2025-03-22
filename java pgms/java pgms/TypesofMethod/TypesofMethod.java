package com.TypesofMethod;

import java.util.Scanner;

public class TypesofMethod {
	
	// Non Parameterized method with no return type
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Non Parameterized method with no return type");
		System.out.println(a+b);	
		int mul=Multiplication();
		int res=mul+c;
		System.out.println(res);
	}
	//Non Parameterized method with return type:
	public int Multiplication() {
	int a=10;
	int b=12;
	int c=a*b;
	System.out.println("Non Parameterized method with return type");
	return c;
	}
	
	// Parameterized method with no return type
	public void substraction(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	// Parameterized method with return type
	public String login(String email,String pwd) {
		
		String mail="Growing";
		String psd="G@1234";
		
		if(mail.equals(email) && psd.equals(pwd))
		
			return "Login Successfull";
		
		else
			
			return "Login unsuccessfull";
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);		
		TypesofMethod type= new TypesofMethod();
		type.addition();
		//System.out.println(type.Multiplication());
		type.substraction(18, 10);
		String mail=sc.next();
		String psd=sc.next();
		System.out.println(type.login(mail,psd));

	}

}
