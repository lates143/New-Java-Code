package com.inheritance;

class RBI{
	int roi=6;
	protected  void rateOfInterest(){
		System.out.println("Rate of interest of RBI"+roi+"%");
	}
}
class SBI extends RBI{
	
	@Override
	public void rateOfInterest() {
		super.rateOfInterest();
		System.out.println("Rate of interest of SBI 8%");
	}
}
class AXIS extends SBI{
	
	@Override
	public void rateOfInterest() {
		System.out.println("Rate of interest of AXIS 7%");
		super.rateOfInterest();
	}
}

public class ICICI extends AXIS{

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of interest of ICICI 9%");
		super.rateOfInterest();
	}
	public static void main(String[] args) {
		
//		RBI rbi= new RBI();
//		SBI sbi= new SBI();
//		AXIS axis= new AXIS();
		ICICI ic= new ICICI();
//		rbi.rateOfInterest();
//		sbi.rateOfInterest();
//		axis.rateOfInterest();
		ic.rateOfInterest();
		
		

	}

}
