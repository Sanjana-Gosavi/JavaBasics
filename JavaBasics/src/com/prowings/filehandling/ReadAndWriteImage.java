package com.prowings.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteImage {

	public static void main(String[] args)  {
		
		try {
		FileInputStream fin = new FileInputStream(new File("C:\\Users\\RATAN\\Pictures.tree-736885_1280.png"));
		FileOutputStream fout = new FileOutputStream(new File("Nature_Images_Free_Download_(172096539.jpeg"));
		
		int content;
		while ((content = fin.read())!= -1){
			fout.write(content);
		}
		System.out.println("Finished!!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
