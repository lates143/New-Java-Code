package Sample;

public class IsuppercaseIslowercase {

	public static void main(String[] args) {
		
		String str= "AutoMaTioN";
		int isUppercase= 0;
		int isLowercase= 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				isUppercase++;
			}
			else if(Character.isLowerCase(ch)) {
				isLowercase++;
			}
		
		}
		
		System.out.println("Uppercase count is " +isUppercase);
		System.out.println("Lowercase count is "+isLowercase);

	}

}
