package com.geeks4geeks.strings;

public class LeftmostNonRepeatingCharacter {

	public static void main(String[] args) {

		//Leftmost Occurrence of a Non Repeating Character
		//String str="geeksforgeeks";
		String str="abcabc";
		 int result= leftmostNonRepeatingCharacter(str);
		 System.out.println(result);
		

	}

	public static int leftmostNonRepeatingCharacter(String str) {

		int count[]=new int[256];
		
		for(int i=0; i<str.length(); i++){
			count[str.charAt(i)]++;
		}
		
		for(int i=0; i<str.length(); i++){
			if(count[str.charAt(i)] == 1)
				return i;
		}
		
		
		return -1;
	}

}
