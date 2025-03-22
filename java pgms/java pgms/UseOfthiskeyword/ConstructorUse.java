package com.UseOfthiskeyword;

public class ConstructorUse {

	ConstructorUse(){
		//this(10);
		System.out.println("Default construcor");
		
	}
	
	ConstructorUse(int x){
		this();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		ConstructorUse cu= new ConstructorUse(10);
	}

}
