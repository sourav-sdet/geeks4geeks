package com.geeks4geeks.strings;

public class FrequencyOfStringElements {

	public static void main(String[] args) {

		//Given a string of lowercase characters, print every element and its frequency in sorted order
		
		String str="geeksforgeeks";
		int count[]=new int[26];   //as string contains only lowercase characters
		
		//Iterate through string, increment value in count array
		for(int i=0; i<str.length(); i++){
			
			count[str.charAt(i)-'a']++;
			
		}
		
		//Iterate through count array
		for(int i=0; i<26; i++){
			if(count[i] > 0){
				System.out.print((char)(i+'a')+" "+"-->");
				System.out.print(count[i]);
				System.out.println();
			}
		}
		
		
		
		

	}

}
