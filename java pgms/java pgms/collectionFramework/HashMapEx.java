package com.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map= new HashMap<Integer,String >();
		map.put(1, "Amit");
		map.put(2, "Sagar");
		map.put(3, "Tejal");
		map.put(4, "Devidas");
		map.put(1, null);
		map.put(5, "Sagar");
		map.putIfAbsent(6, "Gaurav");
		//map.putIfAbsent(6, "Gaurav");
		
		
		HashMap<Integer, String> map1= new HashMap<Integer,String >();
		map1.put(1, "Amit");
		map1.put(2, "Sagar");
		map1.put(3, "Tejal");
		map1.put(7, "Devidas");
		
		map.putAll(map1);
		map.remove(1);
		map.remove(2,"Sagar");
		map.replace(6, "Ravi");
		map.replace(6, "Ravi", "Sachin");
		map.replaceAll((k,v)->"Vijay");
		
		System.out.println(map);
			
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
