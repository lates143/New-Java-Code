package com.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class AddAllMethod {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("Amit");
		al.add(34.66f);
		al.add(12.3444);
		al.add('c');
		
		boolean b=al.isEmpty();
		System.out.println( b);
		System.out.println(al.contains(10));
		
		ArrayList al1= new ArrayList();
		al1.add(11);
		al1.add("AmitSagar");
		al1.add(3.669f);
		al1.add(12.34);
		al1.add('d');
		
		System.out.println(al);
		System.out.println(al.addAll(al));
		System.out.println(al);
		al.addAll(1, al1);
		System.out.println(al);
		
		System.out.println(al.containsAll(al1));
		
		Collections.addAll(al1,1,2,3,4);
		System.out.println(al1);
	}

}
