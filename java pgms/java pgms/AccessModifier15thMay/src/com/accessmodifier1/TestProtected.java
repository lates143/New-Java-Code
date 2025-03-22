package com.accessmodifier1;


public class TestProtected extends Protected {
	
	@Override
	protected void display() {
		
		System.out.println(id+" "+name );
		super.display();
	}

	public static void main(String[] args) {
//		Protected p= new Protected();
//		System.out.println(p.id+" "+p.name);
		TestProtected testp= new TestProtected();
		testp.display();

	}

}
