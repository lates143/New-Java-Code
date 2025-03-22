package Sample;

public class AllCharsOcc {

	public static void main(String[] args) {
		
		String str = "Hi Java How Are You?";
		
		String str1 = str.replace(" ", "");
		
		for(int i=0; i<str1.length(); i++) {
			char ch= str1.charAt(i);
			int count= 0;
			
			for(int j=0; j<str1.length(); j++) {
				char ch1= str1.charAt(j);
				
				if(ch==ch1) {
					count++;
				}
				
			}
			
			System.out.println(ch + " Occurenace is "+ count);
		}

	}

}
