package com.Array;

public class MultiArrayEx {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,1,3,5}};
		
		for(int i=0;i<3;i++) // rows
		{
			for(int j=0;j<4;j++) // Column 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
