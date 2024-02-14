package com.prowings.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("abcd.txt");
		
		if(file.createNewFile())
			System.out.println("File created successfully!!");
		else
			System.out.println("File Already exist!!");
		
		
		System.out.println("canRead():"+file.canRead());
		System.out.println("canWrite():" +file.canWrite());
		System.out.println("canExecute():"+file.canExecute());
		System.out.println("exists():"+file.exists());
		
		
		//file.setReadOnly();
		System.out.println("canWrite():"+file.canWrite());
		System.out.println("LastModified():"+file.lastModified());
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		FileReader fr = new FileReader(file);
		
		int i;
		while((i = fr.read())!= -1)
			System.out.println((char)i);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		FileWriter fw = new FileWriter(file);
		fw.append("Hello World");
		fw.close();
		
		
	}
}
