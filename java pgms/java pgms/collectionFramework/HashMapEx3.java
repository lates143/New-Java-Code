package com.collectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapEx3 {

	public static void main(String[] args) {
		
		IdentityHashMap<String, Integer> map= new IdentityHashMap<String,Integer>(6);
		//Map<String, Integer> map= new HashMap<String,Integer>();
		
		map.put("Java", 1);
		map.put("is", 2);
		map.put("best", 3);
		map.put("Programming", 4);
		map.put("language", 5);
		map.put("language1", 7);
		map.put("language2", 6);
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.keySet());
	}

}
