package com.accessmodifier2;

import com.accessmodifier1.Default;
import com.accessmodifier1.TestDefualt1;

public class TestDefault2 extends Default {

public static void main(String[] args) {
		
		Default d= new Default();
		TestDefault2 testd= new TestDefault2();
//		d.display();
//		System.out.println(d.id);
//		System.out.println(d.name);
		testd.display();
		System.out.println(testd.id);
		System.out.println(testd.name);

	}

}
