package Sample;

public interface InterfaceI2 extends InterfaceI3 {

	public void methodttwo();
	@Override
	default void methodone() {
		
		System.out.println("method one");
		
	}
}
