package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {


		Properties prop=new Properties();
		InputStream input=new FileInputStream("C:/Users/Sourav/Desktop/my-repos/geeks4geeks-local/geeks4geeks/src/com/resources/test.properties");
		prop.load(input);
		
		System.out.println(prop.get("env"));
		System.out.println(prop.get("user"));
	

	}

}
