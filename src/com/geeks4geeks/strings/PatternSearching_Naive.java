package com.geeks4geeks.strings;

public class PatternSearching_Naive {

	public static void main(String[] args) {


		//m=Pattern Length
		//n=Text Length
		//1 <= m <= n
		
		//NAIVE PATTERN SEARCH ALGORITHM
		//Naive Pattern Search- O(n-m+1) * m
		//Naive Pattern Search when pattern characters are distinct- O(n)
		//NO PRE PROCESSING
		
		//RABIN KARP ALGORITHM
		//Uses idea of rolling hash to optimize the naive algorithm
		//Compute Hash, if hash matches, then compare individual characters
		//Time Complexity- O(n-m+1) * m
		//PRE PROCESS PATTERN
		//Can be used when text is not static
		
		
		//KMP ALGORITHM
		//Time Complexity- O(n) for any pattern and text
		//Can be used when text is not static
		
		//SUFFIX TREE
		//PRE PROCESS TEXT
		//Time Complexity- O(m)
		//Can be used when text is static
		
		String text="ABABABCD";
		String pat="ABAB";
		
		patternSearching_Naive(text,pat);	

	}

	public static void patternSearching_Naive(String text, String pat) {

		int n=text.length();   //n= text length
		int m=pat.length();    //m= pattern length
		
		for(int i=0; i<= n-m; i++){
			int j;
			for(j=0; j<m; j++){
				//Match all characters of pattern with current window of text
				if(pat.charAt(j) != text.charAt(i+j))
					break;			
			}
			
			if(j==m)
				System.out.print(i+ " ");	
		}
		
		
		
	}

}
