package com.FileHandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		File f0= new File("F:\\Java Notes 15th May\\File Handling\\Sample.txt");
		if(f0.exists()) {
			// Getting file name
			System.out.println("The name of file is: "+f0.getName());
			
			// Getting path of the file
			System.out.println("The path of the file : "+f0.getAbsolutePath());
			
			// File is writable or not
			System.out.println("Is file writable :"+ f0.canWrite());
			
			// File is readable or not
			System.out.println("File is readable or not: "+f0.canRead());
			
			// Length of the file in bytes
			System.out.println("The size of the file in bytes: "+f0.length());
		}
		else
			System.out.println("file dose not exists");

	}

}
