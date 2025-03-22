package com.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

class Employee1{
	 int id;
	 String name,Dept,Desg;
	 float sal;
	 
	 public Employee1(int id, String name, String Dept,String Desg, float sal) {
		
		this.id=id;
		this.name=name;
		this.Dept=Dept;
		this.Desg=Desg;
		this.sal=sal;
	 }
	 
 }

public class ArrayDequeEx1 {

	public static void main(String[] args) {
		
		Deque<Employee1> de= new ArrayDeque<Employee1>();
		
		Employee1 e1= new Employee1(101, "Amit", "CSE", "Tester", 1000.89f);
		Employee1 e2= new Employee1(102, "Sagar", "ETC", "Dev", 12334.78f);
		Employee1 e3= new Employee1(103, "Ravi", "Civil", "Test Engg", 667777.64f);
		
		de.add(e1);
		de.add(e2);
		de.add(e3);
		
		for(Employee1 e:de) {
			System.out.println(e.id+" "+e.name+" "+e.Dept+" "+e.Desg+" "+e.sal);
		}

	}

}
