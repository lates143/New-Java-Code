package com.constructor;

public class ParameterizedConstructor {
	int id;
	String name;
	public ParameterizedConstructor(int a, String b){
		id=a;
		name=b;
		
		System.out.println(id+" "+name);
	}
	public ParameterizedConstructor(int a, String b,int c){
		id=a;
		name=b;
		
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		ParameterizedConstructor p= new ParameterizedConstructor(10,"Amit");
		ParameterizedConstructor p1= new ParameterizedConstructor(10,"Amit");
	}

}
