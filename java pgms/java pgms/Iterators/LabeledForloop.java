package com.Iterators;

public class LabeledForloop {
	

	public static void main(String[] args) {
		forlabel:
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		Outer:
			for(int i=1;i<=3;i++) {
			Inner:
				for(int j=1;j<=3;j++) {
					if(i==2&&j==2) {
						break;
					}
					System.out.println(i+" "+j);
				}
				
			}			
	}

}
