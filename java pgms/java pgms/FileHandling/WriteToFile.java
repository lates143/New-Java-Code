package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try {
			FileWriter fw= new FileWriter("F:\\Java Notes 15th May\\File Handling\\Sample.txt");
			fw.write("ASCII is a 7-bit character set containing 128 characters. It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters. The character sets used in modern computers, in HTML, and on the Internet, are all based on ASCII.");
			fw.close();
			System.out.println("Content is successfully written ");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
