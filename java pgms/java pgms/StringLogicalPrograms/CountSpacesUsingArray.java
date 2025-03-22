package com.StringLogicalPrograms;

public class CountSpacesUsingArray {

	public static void main(String[] args) {
		String str="Java is my favourite language";
		int count=0;
		
		char[] arr1=str.toCharArray();
		System.out.println(arr1.length);
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==' ') {
				count++;
			}
		}
		System.out.println(count);
		
		String[] arr=str.split("");
		int count1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(" ")) {
				count1++;
			}
		}
		System.out.println(count1);

	}

}
