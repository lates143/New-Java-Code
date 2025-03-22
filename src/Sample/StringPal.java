package Sample;

public class StringPal {

	public static void main(String[] args) {
		
		String str= "mama";
		String rev= "";
		
		for(int i=str.length()-1; i>=0; i--) {
				rev = rev + str.charAt(i);
			
			if(str.equals(rev)) {
				System.out.println("string is pal");
			}
			else
				System.out.println("not pal");
			break;
		}

	}

}
