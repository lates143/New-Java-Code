package com.accessmodifier1;

public class TestPublic1 extends Public{

	public static void main(String[] args) {
		
		Public p = new Public();
		System.out.println(p.id);
		System.out.println(p.name);
		p.display();

	}

}
