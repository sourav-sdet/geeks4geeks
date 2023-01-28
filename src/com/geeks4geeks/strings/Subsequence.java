package com.geeks4geeks.strings;

public class Subsequence {

	public static void main(String[] args) {

		//Two strings S1 and S2,  find out whether s2 is a subsequence of s1
		
		//Subsequence- need not be contiguous characters, they are obtained by removing zero or more
		//characters, should be in the same order
		
		//Substring- need to be contiguous
		//Length of string =n, total number of substrings will be 2^n
		
		//Match- Move ahead in both i and j
		//Do not match- Move ahead in i
		
		//End of S1 --> Return false
		//End of S2 --> return true
		
		String s1="ABCDEF";
		String s2="ABC";
		
		boolean result=isStringSubsequence(s1, s2);
		System.out.println(result);

	}

	//O(n) solution
	private static boolean isStringSubsequence(String s1, String s2) {
		//Optimization Case
		if(s2.length() > s1.length())
			return false;
		
		//i will always be incremented
		
		int j=0;
		for(int i=0; i<s1.length() && j<s2.length(); i++){
			if(s1.charAt(i) == s2.charAt(j))
				j++;
			
		}
		
		return j==s2.length();
	}

}
