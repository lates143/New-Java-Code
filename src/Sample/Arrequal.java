package Sample;

public class Arrequal {

	public static void main(String[] args) {
		
		int[]arr1 = {1,2,3,4,5};
		int[]arr2 = {1,2,3,5,4};
		
		boolean arrequal= true;
		
		for(int i=0; i<arr1.length; i++) {
			boolean matchfound = false;
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i]==arr2[j]) {
					
					matchfound = true;
					break;
				}
				
			}
			
			if(!matchfound) {
				
				arrequal = false;
				break;
				
			}
		}
		
		if(arrequal) {
			System.out.println("matching");
		}
		
		else
			System.out.println("not matching");
	}

}
