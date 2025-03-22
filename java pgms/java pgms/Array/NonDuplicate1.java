package com.Array;

import java.util.Arrays;

public class NonDuplicate1 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,2,7,8,8,3};
		Arrays.sort(arr);
		
		boolean[] vis= new boolean[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==arr[i+1]) {
				vis[i]=true;
				vis[i+1]=true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(!vis[i]) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
