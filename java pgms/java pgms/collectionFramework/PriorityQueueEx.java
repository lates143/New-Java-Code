package com.collectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("Amit");
		pq.add("Vijay");
		pq.add("Vijay");
		pq.add("Kiran");
		pq.add("Rahul");
		pq.add("Sagar");
		pq.add("Alish");
		
		
		System.out.println("Head of the queue : "+pq.element());
		System.out.println("Head of the queue : "+pq.peek());
		
		Iterator itr= pq.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		//pq.remove();
		//pq.poll();
		
		System.out.println("\nAfter removing two elements: ");
		Iterator itr1= pq.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
		

	}

}
