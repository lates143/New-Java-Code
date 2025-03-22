package com.UseOfthiskeyword;

public class ProvingthisKeyword {

	void m1() {
		
		System.out.println("this refrence id :"+this);
	}
	
	public static void main(String[] args) {
		
		ProvingthisKeyword obj= new ProvingthisKeyword();
		System.out.println("Object refrence id :"+obj);
		obj.m1();
	}

}
