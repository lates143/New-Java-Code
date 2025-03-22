package com.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("Amit");
		al.add(34.66f);
		al.add(12.3444);
		al.add('c');
		
//		for(char c='A';c<='Z';c++) {
//			al.add(c);
//		}
		Object[] a= al.toArray();
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(Object i:a ) {
			
			System.out.print(i+" ");
		}
		
		// System.out.println(al);
		
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}	
	}

}
