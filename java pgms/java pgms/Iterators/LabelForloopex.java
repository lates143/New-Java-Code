package com.Iterators;

public class LabelForloopex {

	public static void main(String[] args) {
		
		int i=0;
		
		whilelabel:
				while(i<5) {
					System.out.println("Outer value of i:"+i);
					i++;
					forlable:
						for(int j=0;j<5;j++) {
							{
								if(j>0)
								{
									continue forlable; // Execution transfer to the for loop.
								}
								if(i>1) {
									continue whilelabel;// Execution transfer to the while loop.
								}
								System.out.println("inner loop of i:"+ i +",j:"+j);
							}
						}
				}

	}

}
