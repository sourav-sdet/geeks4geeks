package com.geeks4geeks.strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {


		//Every character must be present
		//Frequency of every character must be same
		//Order of occurrence can be different
		
		String str1="tom marvolo riddle";
		String str2="i am lordvoldemort";
		
		//O(nlogn) time due to sorting, O(n) space due to use of character arrays
		boolean result=checkAnagram_Naive(str1,str2);
		System.out.println(result);
		
		//O(n) time, O(CHAR) space
		result=checkAnagram_Efficient(str1, str2);
		System.out.println(result);
			
	}

	public static boolean checkAnagram_Efficient(String str1, String str2) {

		//Check unequal length
		if(str1.length() != str2.length())
			return false;
		int count[]=new int[256];
		
		for(int i=0; i<str1.length(); i++){
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		
		for(int i=0; i<256; i++){
			if(count[i] !=0)
				return false;
		}
		return true;
	}

	public static boolean checkAnagram_Naive(String str1, String str2) {
		
		//If length is unequal, they cannot be anagrams
		if(str1.length() != str2.length())
			return false;
		
		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
	}
	
	

}
