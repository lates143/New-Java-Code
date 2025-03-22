package com.collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap <Integer, String> map= new TreeMap<Integer,String>();
		TreeMap <Integer, String> map2= new TreeMap<Integer,String>();
		TreeMap <String,Integer> map1= new TreeMap<String,Integer>();
		
		map.put(104, "Devidas");
		map.put(106, "Vijay");
		map.put(102, "Sagar");
		map.put(103, "Tejal");
		map.put(101, "Amit");
		
		map1.put("Devidas",104);
		map1.put("Vijay",106);
		map1.put("Vijaya",107);
		map1.put("Zebra",107);
		map1.put("Sagar",102);
		map1.put("Tejal",103);
		map1.put("Amit",101);
		
		System.out.println("First entry:"+ map.firstEntry());
		System.out.println("FLoor ENtry:"+map.floorEntry(105));
		System.out.println("Head Map:"+map.headMap(104));
		System.out.println("Tail Map: "+map.tailMap(102));
		System.out.println("subMap: "+ map.subMap(101, true, 104, true));
		System.out.println("subMap: "+ map.subMap(101,104));
		System.out.println("Higher Entry:"+map.higherEntry(102));
		System.out.println("Last Entry: "+ map.lastEntry());
		System.out.println("Last Entry: "+ map1.lastEntry());
		System.out.println("Lower Entry: "+map.lowerEntry(101));
		System.out.println("Lower Entry: "+map1.lowerEntry("Sagar"));
		System.out.println("Lower key: "+ map.lowerKey(103));
		System.out.println("Poll First ENtry: "+map2.pollFirstEntry());
		System.out.println("Poll Last ENtry: "+map.pollLastEntry());
		System.out.println("FIrst key: "+ map.firstKey());
		System.out.println("Last Key: "+ map.lastKey());
		System.out.println("Descending map: "+map.descendingMap());
		System.out.println(map.ceilingEntry(100));
		//System.out.println(map1= (TreeMap<Integer, String>) map.clone());
		System.out.println(map1);
		
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
