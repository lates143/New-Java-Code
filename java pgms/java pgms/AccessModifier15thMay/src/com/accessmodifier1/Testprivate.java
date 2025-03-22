package com.accessmodifier1;

class Private1 {
	
	private int id=12;
	private String name="Sagar";
	
	private void display() {
		System.out.println(id+" "+name);
	}
}
public class Testprivate extends Private1{
	
	@Override
	void display() {
		System.out.println(id+" "+name);
		super.display();
	}
	public static void main(String[] args) {
		
		Testprivate testp= new Testprivate();
		testp.display();		
	}
}
