package com.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		
		Deque<String> de= new ArrayDeque<String>();
		
		de.add("Ravi");
		de.add("Vijay");
		de.add("Sagar");
		de.add("Ajay");
		de.addFirst("Amit");
		de.addLast("Tejal");
		de.offerFirst("10");
		de.offerLast("30");
		//de.addFirst(null);
		System.out.println(de.getFirst());
		System.out.println(de.getLast());
		System.out.println(de.peekFirst());
		System.out.println(de.peekLast());
		System.out.println(de.removeFirst());
		System.out.println(de.removeLast());
		System.out.println(de.pollFirst());
		System.out.println(de.pollLast());
		
		for(String str:de) {
			System.out.println(str);
		}

	}

}
