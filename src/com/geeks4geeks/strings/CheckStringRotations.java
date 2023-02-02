package com.geeks4geeks.strings;

public class CheckStringRotations {

	public static void main(String[] args) {


		//Check whether str2 can be obtained from string s1 by rotating s1 any number of times
		//Either Left Rotate it or Right Rotate it any number of times
		
		String str1="ABCD";
		String str2="CDAB";
		
		boolean result=checkRotations(str1, str2);
		System.out.println(result);

	}

	private static boolean checkRotations(String str1, String str2) {
		
		if(str1.length() != str2.length())
			return false;
		
		return ((str1+str1).indexOf(str2) >=0); //indexOf function will return the first occurence of
		//str2 if it is present in str1+str1, else it will return a negative value
		
		//Linear Time Solution- Theta n time, Theta n space
	}

}
