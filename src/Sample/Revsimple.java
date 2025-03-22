package Sample;

public class Revsimple {

	public static void main(String[] args) {
		
		String str = "Reverse";
		String rev= "";
		
		
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			rev = ch + rev;
	
		}
		System.out.println(rev);
	}

}
