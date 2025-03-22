package com.constructor;

public class ConstructorOverloding {
	
	public ConstructorOverloding(){
		System.out.println("defualt constructor");
	}
//	public ConstructorOverloding(int a , int b){
//		System.out.println(a+" Parameterized COnstructor "+b);
//	}
	public ConstructorOverloding(int a , String b) {
		System.out.println(a+" "+b);
	}
	public ConstructorOverloding(String b , int a) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		
		ConstructorOverloding cv= new ConstructorOverloding();
		//new ConstructorOverloding(10,20);
		new ConstructorOverloding(10,"Java"); // Constructor Overloading 

	}

}
