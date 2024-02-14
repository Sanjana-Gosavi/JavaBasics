package com.prowings.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String resourcePath = Thread.currentThread().getContextClassLoader().getResource("").getPath()+"app.properties"; //dynamicaly reads the context
		
		Properties properties = new Properties();
		
		properties.load(new FileInputStream(resourcePath));
		
		String username = properties.getProperty("username");
		//System.out.println(username);
		
		String password = properties.getProperty("password");
		//System.out.println(password);
		
		String url = properties.getProperty("url");
		//System.out.println(url);
		
		properties.setProperty("username", "qwerty");
//		System.out.println(properties);
		
		System.out.println(properties);
	}
}
