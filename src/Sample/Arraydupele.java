package Sample;

public class Arraydupele {

	public static void main(String[] args) {
		
		int arr[] = {55,95,65,55,65,65,70,44,88,70,35,95,55};
		System.out.println("Duplicate no are: ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[i]+ " ");
				}
				
			}
			
		}

	}

}
