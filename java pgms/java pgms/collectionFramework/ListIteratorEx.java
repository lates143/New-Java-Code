package com.collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		
		ArrayList <String>  al=new ArrayList<String>();
		System.out.println(al.size());
		al.add("abcd");
		al.add("dddd");
		al.add("abcdef");
		al.add("defeed");
		System.out.println(al.size());
		System.out.println(al);
		al.add(3, "cgasgdh");
		
		ListIterator<String> iterator= al.listIterator(); 
		
		while (iterator.hasNext()) {
			String i=iterator.next();
			System.out.println(i);
		}

	}

}
