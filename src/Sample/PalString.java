package Sample;

public class PalString {

	public static void main(String[] args) {
		
		String pal= "MaM";
		String revpal= "";
		
		for(int i=0; i<pal.length(); i++) {
			char ch= pal.charAt(i);
			revpal = ch+ revpal;
		}
		if(pal.equals(revpal)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
