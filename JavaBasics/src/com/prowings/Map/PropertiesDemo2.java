package com.prowings.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		prop.setProperty("username", "abc");
		prop.setProperty("password", "asdfghj");
		prop.setProperty("url", "abc");
		
		System.out.println(prop);
		
		String fileName = "abc.java";
		
		OutputStream outPutStream;
		try {
			outPutStream = new FileOutputStream(fileName);
			prop.store(outPutStream, "My file");
			outPutStream.close();
			System.out.println("File stored Successfully!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		


	}
}
