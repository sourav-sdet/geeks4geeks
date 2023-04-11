package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class WaysOfReadingTextFiles {
	
	
	
	public static void main(String[] args) throws Exception
    {
		//METHOD 1: USING BUFFEREDREADER CLASS
		File file1=new File("C:/Users/Sourav/Desktop/logs.txt");
		BufferedReader br=new BufferedReader(new FileReader(file1));
		String str;
		
		while((str = br.readLine()) !=null){
			
			System.out.println(str);
			
		}
		
		
		//METHOD 2: USING FILEREADER CLASS
		FileReader fr=new FileReader("C:/Users/Sourav/Desktop/logs.txt");
		int i;
		while((i = fr.read()) != -1){
			System.out.println((char)i);
		}
		
		
		//METHOD 3: USING SCANNER CLASS
		File file2=new File("C:/Users/Sourav/Desktop/logs.txt");
		Scanner sc=new Scanner(file2);
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
			
		}
		
    }
	
	
	
	
	
	

}
