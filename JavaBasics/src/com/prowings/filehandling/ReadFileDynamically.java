package com.prowings.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFileDynamically {

	public static void main(String[] args) {
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("myFile.txt");
		InputStreamReader streamReader = new InputStreamReader(input, StandardCharsets.UTF_8);
		
		BufferedReader reader = new BufferedReader(streamReader);
		
		try {
			for(String line; (line = reader.readLine())!= null;) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
