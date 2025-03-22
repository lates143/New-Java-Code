package com.encapsulation;

class Employee{
	private int empid;
	
	public void setEmpid(int id) {
		empid=id;
	}
	public int getEmpid() {
		//System.out.println(empid);
		return empid;
	}
}

public class Main extends Employee{

	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.setEmpid(101);
		System.out.println(e.getEmpid());

	}

}
