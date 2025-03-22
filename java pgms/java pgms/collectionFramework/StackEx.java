package com.collectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		Stack S= new Stack<>();
		S.push(10);
		S.push(12);
		S.push("Ashish");
		S.push("Amit");
		System.out.println(S);
		S.pop();
		S.pop();
		S.push(null);
		
		Iterator itr= S.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
