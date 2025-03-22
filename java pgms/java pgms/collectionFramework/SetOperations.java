package com.collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
	
	// addAll()--> Union
	// retainAll()--> intersection
	// removeAll()--> difference
		
	Integer [] A= {22,45,33,66,55,34,77};
	Integer [] B= {33,2,83,45,3,12,55};
	
	Set<Integer> set1= new HashSet<Integer>();
	set1.addAll(Arrays.asList(A)); // Convert A array into list.
	
	Set<Integer> set2= new HashSet<Integer>();
	set2.addAll(Arrays.asList(B));
	
	// Finding union of set1 and set2
	Set<Integer> union= new HashSet<Integer>(set1);
	
	union.addAll(set2);
	
	System.out.println("Union of set1 and set2: ");
	System.out.println(union);

	// intersection of set1 and set2
	Set<Integer> inter= new HashSet<Integer>(set1);
	//System.out.println(inter);
	inter.retainAll(set2);
	System.out.println("intersection of set1 and set2: ");
	System.out.println(inter);
	System.out.println(inter.contains(22));
	System.out.println(inter.containsAll(inter));
	
	// difference of set1 and set2
	Set<Integer> difference= new HashSet<Integer>(set1);
	difference.removeAll(set2);
	System.out.println("difference of set1 and set2: ");
	System.out.println(difference);
	System.out.println(inter.hashCode());
	
	}

}
