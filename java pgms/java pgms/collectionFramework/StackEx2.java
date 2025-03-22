// Push 1-100 numbers in stack
package com.collectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class StackEx2 {

	public static void main(String[] args) {
		
		Stack s= new Stack<>();
		
		System.out.println(s.peek());
		
		for(int i=1;i<=100;i++) {
			s.push(i);
		}
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(1));
		Iterator itr= s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
