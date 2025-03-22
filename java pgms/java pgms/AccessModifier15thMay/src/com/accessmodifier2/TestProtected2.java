package com.accessmodifier2;

import com.accessmodifier1.*;

public class TestProtected2 extends Protected {
	
	@Override
	protected void display() {
		System.out.println(id+" "+name);
		super.display();
	}

	public static void main(String[] args) {
		TestProtected2 test= new TestProtected2();
		test.display();

	}

}
