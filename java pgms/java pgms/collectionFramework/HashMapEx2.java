package com.collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		Map map= new HashMap(4);
		
		map.put(1, "Amit");
		map.put(2, "Sagar");
		map.put(3, "Tejal");
		map.put(4, "Devidas");
		map.put("Ravi", 101);
		
		System.out.println(map.containsValue("Tejal"));
		System.out.println(map.containsKey("Ravi"));
		System.out.println(map.get(2));
		System.out.println(map.hashCode());
		Set set= map.entrySet(); // Converting map to Set
		
		Iterator itr= set.iterator();
		
		while(itr.hasNext()) {
			// COnverting to Map.Entry so that we can get key and value separately
			
			Map.Entry entry= (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
