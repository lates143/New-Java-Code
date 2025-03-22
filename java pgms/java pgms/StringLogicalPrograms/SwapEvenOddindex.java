// Swap even and odd index characters.
package com.StringLogicalPrograms;

public class SwapEvenOddindex {

	public static void main(String[] args) {
		
		String str="AmitSagare";//mAtiaSagr
		
		String str1="";
		
		for(int i=0;i<str.length()-1;i=i+2) {
			str1=str1+str.charAt(i+1)+str.charAt(i); // 0+m+A==> mA+t+i==>mAti
		}
		System.out.println(str1);

	}

}
