// Count the number of words present in string
package com.StringLogicalPrograms;

public class CountWord {

	public static void main(String[] args) {
		String str=" Welcome to  the java ";
		int count;
		if(str.charAt(0)==' ') {
			count=0;
		}
		else {
			count=1;
		}
		
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Words in string: "+count);

	}

}
