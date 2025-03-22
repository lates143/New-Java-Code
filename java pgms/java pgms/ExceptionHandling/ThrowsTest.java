package com.ExceptionHandling;

import java.io.FileNotFoundException;

public class ThrowsTest {

	public static void main(String[] args) {
		ThrowsKeyword T= new ThrowsKeyword();
		try {
		ThrowKeyword.validate(17);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		try {
			T.readfile();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		try {
			T.saveFile();
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("ENd of the code");
	}

}
