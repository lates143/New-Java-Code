package Sample;

public class AllOccofStrings {

	public static void main(String[] args) {
		
		String str= "Hello World";
		String str1= str.replace(" ", "");
		//System.out.println(str1);
		
		for(int i=0; i<str1.length();i++) {
			char ch= str1.charAt(i);
			int count =0;
			
			for(int j=0; j<str1.length(); j++) {
				char ch1= str1.charAt(j);
				if(ch==ch1) {
					count++;
				}
				
			}
			
			if(count>0) {
				System.out.println(ch+ " count " + count);
			}
			
		}

	}

}
