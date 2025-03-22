package Sample;

public class Bubbleex2 {
	
	public void bubblesort(int[]arr) {
		int n= arr.length;
		int temp=0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=1; j<n-1; j++) {
				
				if(arr[j-1]>arr[j]) {
					temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}	
		}
	}
	
	

	public static void main(String[] args) {
		int[]arr= {5,6,9,8,7,2,1,0};
		
		Bubbleex2 b= new Bubbleex2();
		System.out.println("Before sorting an array");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		b.bubblesort(arr);
		System.out.println("\nAfter sorting an array");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}

}
