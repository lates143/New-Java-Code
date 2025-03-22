package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsKeyword {
	
	void readfile() throws FileNotFoundException {
		FileInputStream fis= new FileInputStream("F:\\abc.txt");
	}
	void saveFile() throws FileNotFoundException {
		FileOutputStream fos= new FileOutputStream("F:\\abc.txt");
	}

	public static void main(String[] args) {
		
		ThrowsKeyword T= new ThrowsKeyword();
		try {
			T.readfile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("End of code");
	}

}
