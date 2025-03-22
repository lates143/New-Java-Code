package com.collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx1 {

	public static void main(String[] args) {
		
		TreeSet<String> T= new TreeSet<String>();
		T.add("Java");
		T.add("Python");
		T.add("C");
		T.add("CPP");
		T.add("Net");
		
		
		System.out.println(T);
		System.out.println(T.descendingSet());
		System.out.println(T.headSet("Java", true));
		System.out.println(T.headSet("Java", false));
		System.out.println(T.subSet("C", true , "Java", true));
		System.out.println(T.tailSet("Java",true));
//		Iterator<String> itr=T.iterator();
		Iterator<String> itr=T.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
