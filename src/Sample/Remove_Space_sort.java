package Sample;

import java.util.Arrays;

public class Remove_Space_sort {
	
	    public static void main(String[] args) {
	        String str = "My Name is Nikhil";
	        
	        // Remove spaces
	        str = str.replaceAll(" ", "");
	        
	        // Convert string to character array
	        char[] charArray = str.toCharArray();
	        
	        // Sort the character array
	        Arrays.sort(charArray);
	        
	        // Convert back to string and print
	        String sortedStr = new String(charArray);
	        System.out.println("Sorted String without spaces: " + sortedStr);
	    }
	}



