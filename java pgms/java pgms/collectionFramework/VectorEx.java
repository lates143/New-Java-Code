package com.collectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector V= new Vector<>();
		V.add(1);
		V.add(2);
		V.addAll(V);
		V.addElement(10);
		
		Vector V1= new Vector<>();
		V1.add(1);
		V1.add(2);
		V1.addAll(V);
		V1.addElement(10);
		//System.out.println(V.capacity());
		//V.clear();
		//System.out.println(V.elementAt(3));
//		System.out.println(V.equals(V1));
//		System.out.println(V1);
//		System.out.println(V);
//      System.out.println(V.firstElement());
		
		V.forEach(System.out::println);
		System.out.println(V.lastElement());
		System.out.println(V.lastIndexOf(10));
		
//		System.out.println(V.removeAll(V));
//		System.out.println(V);
//		System.out.println(V.size());
//		V.removeAllElements();
//		System.out.println(V);
//		System.out.println(V.size());
//		V.removeElement(10);
//		System.out.println(V);
		
		
		
//		Integer [] arr= new Integer[5];
//		
//		V.copyInto(arr);
//		
//		for(Object v:arr) {
//			System.out.println(v);
//		}
		
		Iterator itr=V.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
