package com.geeks4geeks.strings;

public class PatternSearching_Naive_DistinctPattern {

	public static void main(String[] args) {

		String text="ABCABCDABCD";
		String pat="ABCD";    //Pattern has unique characters
		
		patternSearching_Naive_Distinct_Pattern(text,pat);
	
	}

	private static void patternSearching_Naive_Distinct_Pattern(String text, String pat) {

		int n=text.length();
		int m=pat.length();
		
		for(int i=0; i<=n-m;){
			
			int j=0;
			for(j=0; j<m; j++){
				
				if(pat.charAt(j) != text.charAt(i+j))
					break;
			}
			
			if(j==m)
				System.out.print(i+" ");
			
			if(j==0)
				i++;        //Similar to Naive Algorithm
			
			else
				i=i+j;     //Mismatch after some matches, shift i by j position as all characters in pattern are distinct
		}
		
		//For some iterations of inside loop, we save that many iterations for the outer loop. 
		//Hence, overall time complexity is linear
		
		
	}

}
