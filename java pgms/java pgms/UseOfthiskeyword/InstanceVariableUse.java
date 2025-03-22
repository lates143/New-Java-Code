package com.UseOfthiskeyword;

public class InstanceVariableUse {
	
	int a=50;
	int b=100;
	int c;
	int d;
	
	public InstanceVariableUse(int a, int b, int f, int g) {
		this.a=a;
		this.b=b;
		d=f;
		c=g;
		System.out.println(a+" "+b+" "+d+" "+c);
	}
   void show() {
	   
	   System.out.println(a+" "+b+" "+d+" "+c);
   }
	public static void main(String[] args) {
		
		InstanceVariableUse iv= new InstanceVariableUse(10,20,30,40);
		iv.show();
		System.out.println(iv.a);
	}

}
