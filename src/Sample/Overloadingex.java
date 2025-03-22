package Sample;

public class Overloadingex {

	public void a(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		Overloadingex o = new Overloadingex();
		o.a(100);

	}

}
