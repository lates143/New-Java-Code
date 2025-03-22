package Sample;

public class Sample_Test {

	public static void main(String[] args) {
		
		String s = "Hello Java";
		char o = 'J';
		int count = 0;
		
		 for ( int i=0; i<s.length(); i++){
			char oc = s.charAt(i);
			
			if(oc==o) {
				count++;
			}
			
		}
			System.out.println(count);

	}

}
