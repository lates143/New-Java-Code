package Sample;

public class CharOcc {

	public static void main(String[] args) {
		
		String str= "Hello World";
		String str1= str.replace(" ", "");
		
		for(int i=0; i<str1.length(); i++) {
			int count=0;
			char ch1= str1.charAt(i);
			for(int j=0; j<str1.length();j++) {
				char ch= str1.charAt(j);
				
				if(ch1== ch) {
					count++;
				}

			}
			
			System.out.println(ch1 +" "+ count);
			
		}

	}

}
