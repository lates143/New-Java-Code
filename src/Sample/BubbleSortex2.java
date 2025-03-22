package Sample;

public class BubbleSortex2 {
	
	public void bubble(int[]arr) {
		int n= arr.length;
		int temp;
		
		for(int i=0; i<n-1; i++) {
			
			for(int j=1; j<n-i; j++) {
				
				if(arr[j-1]>arr[j]) {
					
					//Swapping
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}	
			}	
		}
	}
	

	public static void main(String[] args) {
		
		int[]arr= {4,6,7,5,1,2};
		
		Bubbleex2 b= new Bubbleex2();
		
		System.out.print("Array before sort ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		b.bubblesort(arr);
		
		System.out.print("\nArray after sort ");
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
	}

}
