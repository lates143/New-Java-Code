package Sample;

public class InterfaceI1 implements InterfaceI2{

	@Override
	public void methodttwo() {
		
		System.out.println("method 2");
		
	}
//	@Override
//	public void methodone() {
//		InterfaceI2.super.methodone();
//	}
	public static void main(String[] args) {
	
		InterfaceI2 i= new InterfaceI1();
		i.methodone();
		i.methodttwo();
		
	}

}
