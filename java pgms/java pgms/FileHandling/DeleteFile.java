package com.FileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File f1= new File("F:\\Java Notes 15th May\\File Handling\\Sample.txt");
		if(f1.delete()) {
			System.out.println(f1.getName()+" file is deleted..");
		}
		else {
			System.out.println("Unexpected Error");
		}

	}

}
