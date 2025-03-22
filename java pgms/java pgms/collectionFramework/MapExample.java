package com.collectionFramework;

import java.util.Map;
import java.util.TreeMap;

class Library{
	
	int id;
	String name,author,publisher;
	int quantity;
	
	public Library(int id,String name, String author, String publisher, int quantity) {
		
		this.id=id;
		this.name=name;
		this.publisher=publisher;
		this.author=author;
		this.quantity=quantity;
	}
}

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, Library> map= new TreeMap<Integer,Library>();
		
		Library L1= new Library(101,"Java", "James", "Sun", 10);
		Library L2= new Library(102,"Pyhton","Foruzon", "Oracle", 11);
		Library L3= new Library(103,"CPP", "Galvin", "OOPs", 12);
		
		map.put(2, L3);
		map.put(1, L1);
		map.put(3, L2);

		for(Map.Entry<Integer, Library> entry:map.entrySet()) {
			
			int key= entry.getKey();
			Library lb= entry.getValue();
			System.out.println(key+" ");
			System.out.println(lb.id+" "+lb.name+" "+lb.author+" "+lb.publisher+" "+lb.quantity);
		}
	}

}
