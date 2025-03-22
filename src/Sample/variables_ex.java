package Sample;

public class variables_ex {
	
			//instance
			int a = 15;
			//static 
			 static String ab  = "java";


	public static void main(String[] args) {
		
		//local 
		char ac = 'a';
		System.out.println("local print " + ac);
		
		//instance print 
		variables_ex printa = new variables_ex(); 
		System.out.println("instance print " + printa.a);
		
		//static print
		System.out.println("static print " + ab);
		
		
	}

}
