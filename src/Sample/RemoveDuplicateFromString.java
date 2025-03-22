package Sample;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String str= "Sagar Late";
		String afterduplicationremoved = "";
		boolean isduplicate;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			isduplicate = false;
			for(int j=0; j<afterduplicationremoved.length(); j++) {
				if(afterduplicationremoved.charAt(j)==ch) {
					isduplicate= true;
					break;
				}
			}
			if(!isduplicate) {
				afterduplicationremoved += ch;
			}
			
		}
		
		System.out.println("After removing duplicates: "+ afterduplicationremoved);

	}

}
