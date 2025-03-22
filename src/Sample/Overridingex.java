package Sample;

class childoverriding{
	
	public void childmethod() {
		System.out.println("m a child");
	}
		
}

public class Overridingex extends childoverriding {
	
	@Override
	public void childmethod() {
		System.out.println("m a parent");
		super.childmethod();
	}
	public static void main(String[] args) {
		Overridingex o= new Overridingex();
		o.childmethod();
		
	}

}
