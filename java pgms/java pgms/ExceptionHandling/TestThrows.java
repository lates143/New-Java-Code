package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestThrows {
	
	void method1() throws IOException , FileNotFoundException {
		throw new IOException("System error"); // Checked Exception
	}
	void method2() throws IOException {
		 method1();
	}
	void method3() {
		try {
			method2();
		} catch (IOException e) {
			System.out.println("Exception Handled");
			//e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestThrows T= new TestThrows();
		T.method3();
		System.out.println("ENd of code");

	}

}
