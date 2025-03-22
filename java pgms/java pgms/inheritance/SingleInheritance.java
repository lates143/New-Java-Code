package com.inheritance;

class Single{
	int a = 19;
	void show() {
		System.out.println(a);
}
}
	
public class SingleInheritance extends Single{
	
	int b= 10;
	
	@Override
	void show() {
		System.out.println(b);
		super.show();
	}
	
	public static void main(String[] args) {
		SingleInheritance s= new SingleInheritance();
		s.show();
		

	}

}

