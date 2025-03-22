// Remove junk and special characters from string
package com.StringLogicalPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		
	String s="!@#$testing%&Selenium1234567";
	String str="";
	//s=s.replaceAll("[a-zA-Z0-9]", ""); // To print special charcters
	//s=s.replaceAll("[^a-zA-Z0-9]", "");  // To print string i.e.a-z, A-Z and 0-9.
	System.out.println(s);
	
	
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)>64 && s.charAt(i)<=122) {
			str=str+s.charAt(i);
		}
		
//		if(s.equals("[^a-zA-Z0-9]")) {
//			
//			str=str+s.charAt(i);
//		}
	}
	System.out.println("After removing special/ junks in string: "+str);

	}

}


//	      String string = "Kno$*w;..,98   P7rogr5'a^m?6";
//	      for (int i = 0; i < string.length(); i++) {
//	         if ((string.charAt(i) < 'A' || string.charAt(i) > 'Z') && 
//	            (string.charAt(i) < 'a' || string.charAt(i) > 'z') &&
//	            (string.charAt(i) < '0' || string.charAt(i) > '9')) {
//	            string = string.substring(0, i) + string.substring(i + 1);
//	            i--;
//	         }
//	      }
//	      System.out.print(string);
//	