package com.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RetainAllMethod {

	public static void main(String[] args) {
		
		Set<Integer> data= new HashSet<Integer>();
		
		data.add(10);
		data.add(20);
		data.add(41);
		data.add(21);
		data.add(25);
		
		ArrayList<Integer> data1= new ArrayList<Integer>();
		data1.add(10);
		data1.add(20);
		data1.add(21);
		data1.add(56);

		System.out.println(data1);
		
		data.retainAll(data1);
		System.out.println(data);
	}
}
