package Sample;

public class GetterSetter {
	
	private double balance;
	
	public void setbalance(double accbalance) {
		if(accbalance>0) {
			balance=accbalance;	
		}
	}
	
	 double getbalance(){
		return balance;
	}
	
	public static void main(String[] args) {
		
		GetterSetter gs= new GetterSetter();
		gs.setbalance(500);
		System.err.println(gs.getbalance());

	}

}
