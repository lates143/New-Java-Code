package com.Iterators;

public class ContinueEx2 {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			
			if(i>4 && i<9) {
				continue;
			}
			System.out.println(i);
		}
	}
}
