package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowChecked {
	
	public static void method() throws FileNotFoundException  {
		FileReader file= new FileReader("F:\\Java Notes 3r April\\Java Notes.pdf");
		BufferedReader file1= new BufferedReader(file);
		
		throw new FileNotFoundException("Exception in file");
	}

	public static void main(String[] args) {
		
		try {
			method();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("End of the code");

	}

}
