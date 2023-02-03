package com.geeks4geeks.strings;

public class LongestSubstringWithDistinctCharacters {

	public static void main(String[] args) {

		//Find longest substring from the string that has distinct characters
		//Substring- consecutive characters
		//Subsequence- may not be consecutive
		
		String str1="abcdabc";  //Output: 4
		String str2="aaa";      //Output: 1
		String str3="";         //Output: 0
		
		int result=longestSubstringDistinctCharacters_SuperNaive(str1);
		System.out.println(result);
		
		result=longestSubstringDistinctCharacters_Naive(str2);
		System.out.println(result);
		

	}
	

	//O(n^2) solution
	public static int longestSubstringDistinctCharacters_Naive(String str2) {
		
		int n=str2.length(), res=0;
		for(int i=0; i<n; i++){
			boolean visited[]=new boolean[256];
			for(int j=i; j<n; j++){
				if(visited[str2.charAt(j)] == true)
					break;
				else{
					res=Math.max(res, j-i+1);
					visited[str2.charAt(j)]=true;
				}
			}
		}
		return res;
	}

	//O(n^3) solution
	public static int longestSubstringDistinctCharacters_SuperNaive(String str1) {

		int n=str1.length();
		int result=0;
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				if(areDistinct(str1,i,j))
					result=Math.max(result, j-i+1);
					
			}
		}
		return result;
	}

	public static boolean areDistinct(String str1, int i, int j) {
		
		
		boolean visited[]=new boolean[256];
		for(int k=i; k<=j; k++){
			if(visited[str1.charAt(k)] == true)
				return false;
			visited[str1.charAt(k)]=true;
		}
		return true;
	}

}
