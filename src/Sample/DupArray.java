package Sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupArray {

	public static void main(String[] args) {
		
		int []arr= {1,2,5,1,6,2};
		
		Set<Integer> hs= new HashSet<Integer>();
		
		for(int num:arr) {
			hs.add(num);
		}
		
		int[] newarr= hs.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(newarr));
		
	
		
		
	}

}
