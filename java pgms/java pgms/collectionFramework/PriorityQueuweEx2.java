package com.collectionFramework;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuweEx2 {

	public static void main(String[] args) {
		
	Queue <Integer> pr= new PriorityQueue<Integer>();
	pr.add(500);
	pr.add(900);
	pr.add(750);
	pr.add(100);
	pr.add(50);
	
		
	System.out.println(pr.size());
	System.out.println(pr.poll());
	System.out.println(pr);
	}

}
