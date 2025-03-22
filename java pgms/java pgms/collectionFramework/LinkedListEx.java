package com.collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList list= new LinkedList();
		list.add("String");
		list.add(10);
		list.add('c');
		list.add(122.344f);
		list.add(true);
		list.addFirst(10);
		list.addLast(12);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		// list.clear();
		System.out.println(list);
		
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
