package com.collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// HashSet<String> S= new HashSet<String>();
		LinkedHashSet<String> S= new LinkedHashSet<String>();
		S.add("Java");
		S.add("Python");
		S.add("CPP");
		S.add("C");
		S.add("c");
		S.add("C");
		S.add(null);
		
		System.out.println(S);
		System.out.println(S.size());

	}

}
