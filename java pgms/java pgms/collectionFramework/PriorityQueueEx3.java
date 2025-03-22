package com.collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
	return "Employee Details : name= "+name+",salary= "+salary;
	}
}

class EmpComp implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		//return o1.salary - o2.salary;
		return o2.salary - o1.salary;
	}
}
public class PriorityQueueEx3 {

	public static void main(String[] args) {
		EmpComp comp= new EmpComp();
		PriorityQueue<Employee> pr = new PriorityQueue<>(10, comp);
		pr.add(new Employee("A", 300));
		pr.add(new Employee("B", 200));
		pr.add(new Employee("C", 4000));
		pr.add(new Employee("D", 50));
		pr.add(new Employee("E", 10));
		pr.add(new Employee("F", 3500));
		pr.add(new Employee("G", 50000));
				
		System.out.println(pr.poll());
		
	}

}
