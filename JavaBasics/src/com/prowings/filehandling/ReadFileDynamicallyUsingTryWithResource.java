package com.prowings.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFileDynamicallyUsingTryWithResource {

	public static void main(String[] args) {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		try (InputStream inputStream = classLoader.getResourceAsStream("MyFile.txt");
				InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader);) {
			String line = "";
			line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error while reding the file!!");
			e.printStackTrace();
		}
	}
}
