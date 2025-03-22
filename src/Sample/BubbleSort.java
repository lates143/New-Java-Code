package Sample;

//Program to implement bubble sort.


public class BubbleSort {

//	public void bubbleSort(int[] arr) {
//		int n=arr.length;
//		int temp=0;
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<n;j++) {
//				if(arr[j-1]>arr[j]) {
//					temp=arr[j-1];
//					arr[j-1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//	}
	public void bubbleSort(int[] arr) {
	    int n = arr.length;
	    int temp;
	    boolean swapped;
	    
	    for (int i = 0; i < n - 1; i++) {
	        swapped = false;
	        for (int j = 1; j < n - i; j++) {
	            if (arr[j - 1] > arr[j]) {
	                temp = arr[j - 1];
	                arr[j - 1] = arr[j];
	                arr[j] = temp;
	                swapped = true;
	            }
	        }
	        if (!swapped) break; // Break if no swaps occur
	    }
	}
	public static void main(String[] args) {
		int[] arr= new int[] {7,8,4,3,5,2,1,9};
		
		BubbleSort b= new BubbleSort();
		System.out.println("Before Bubble Sort");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		b.bubbleSort(arr);
		
		System.out.println("\nAfter Bubble Sort");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
		
	}
}
