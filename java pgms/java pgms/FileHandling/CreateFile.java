package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File f0= new File("F:\\Java Notes 15th May\\File Handling\\Sample.txt");
		//f0.createNewFile();
		try {
			if(f0.createNewFile()) {
				System.out.println("File "+f0.getName()+" is created.");
			}
			else {
				System.out.println("File already exist..");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
