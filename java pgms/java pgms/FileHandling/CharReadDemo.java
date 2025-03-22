package com.FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharReadDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//char c= (char)br.read();
		//int a= (int)br.read();
		//System.out.println(c);
		//System.out.println(a);
		
		/* Reading String */
		InputStreamReader ir= new InputStreamReader(System.in);
		BufferedReader br1= new BufferedReader(ir);
		String name= br.readLine();
		System.out.println(name);
		
		// System.out
		// System.in
		System.err.println("Error msg");
	}

}
