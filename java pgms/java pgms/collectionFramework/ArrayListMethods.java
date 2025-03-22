package com.collectionFramework;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al1= new ArrayList();
		al1.add(11);
		al1.add("AmitSagar");
		al1.add(3.669f);
		al1.add(12.34);
		al1.add(12);
		al1.add('d');
		
		System.out.println(al1.get(0));
		System.out.println(al1.set(0, 12));
		System.out.println(al1);
		System.out.println(al1.indexOf('d'));
		System.out.println(al1.lastIndexOf(12));

	}

}
