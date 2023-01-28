package com.geeks4geeks.strings;

public class LeftmostRepeatingCharacter {

	public static void main(String[] args) {

		
		String str="ABCCDDEFF";
		int result=leftmostRepeating(str);
		System.out.println(result);
	}
	
	
	//Naive approach- we traverse through every character, check if it repeats
	//Two loops- i=0 to n-1, j= i+1 to n-1
	public static int leftmostRepeating(String str) {

		//Leftmost character that repeats
		int count[]=new int[256]; //Assumption: Input characters are ASCII characters
		
		for(int i=0; i<str.length(); i++){
			count[str.charAt(i)]++;
		}
		
		for(int i=0; i<count.length; i++){
			if(count[str.charAt(i)] > 1){
				return i;
			}
		}
		
		return -1;
	}

}
