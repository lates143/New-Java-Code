package com.innerclass;

public class Outerclass {
	 int x=10;
	 static int y=20;
	 
	 void display() {
		 System.out.println(x+y);
	 }
	 
	class InnerClass{ //	static class InnerClass{
		 int y=5;
		// Outerclass outer= new Outerclass();
		 void display() {
			 //System.out.println(outer.x+y);
			 System.out.println(x+y);
		 }
	 }
	public static void main(String[] args) {
		
		Outerclass outer= new Outerclass();
		Outerclass.InnerClass inner= outer.new InnerClass();
		
		System.out.println(outer.x);
		System.out.println(y);
		System.out.println(inner.y);
		outer.display();
		inner.display();
		

	}

}
