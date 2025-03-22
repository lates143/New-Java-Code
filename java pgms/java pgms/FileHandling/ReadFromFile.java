package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
		File f1= new File("\C:\\Users\\lates\\Downloads\\Exit NDA- Sagar late_copy.pdf\");
		Scanner sc= new Scanner(f1);
		while(sc.hasNextLine()) {
			String filedata= sc.nextLine();
			System.out.println(filedata);
		}
		sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
