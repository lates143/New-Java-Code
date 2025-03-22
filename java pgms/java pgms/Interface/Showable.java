package com.Interface;

public interface Showable extends Printable {
	
	void show();
	@Override
	default void print() {
		
		System.out.println("Override method of printable interface");
		
	}

}
