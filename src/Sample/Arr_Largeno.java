package Sample;

public class Arr_Largeno {

	public static void main(String[] args) {
		
		int[] arr = {1,2,5,4,8,0};
		
		int large = arr[0];
		int small = arr[0];
		
		for(int i=1; i<arr.length; i++ ) {
			
			if(arr[i]>large) {
				large=arr[i];
			}
			else if (arr[i]<small){
				small=arr[i];
				
			}
			
		}
		
		System.out.println("small no is " + small);
		System.out.println("large no is "+ large);
		
		
	}

}
