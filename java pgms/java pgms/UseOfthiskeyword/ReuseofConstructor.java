package com.UseOfthiskeyword;

public class ReuseofConstructor {
	
	int rollno;
	String name,course;
	float fee;
	
	ReuseofConstructor(int rollno,String name, String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	ReuseofConstructor(int rollno,String name, String course,float fee){
		this(rollno, name, course);
		this.fee=fee;
		// this(rollno, name, course); //Constructor call must be the first statement in a constructor
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}


	public static void main(String[] args) {
		ReuseofConstructor ru= new ReuseofConstructor(111, "Sagar", "Btech");
		ReuseofConstructor ru1= new ReuseofConstructor(111, "Sagar", "Btech",12000);
		ru.display();
		ru1.display();


	}

}
