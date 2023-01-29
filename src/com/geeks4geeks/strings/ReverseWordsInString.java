package com.geeks4geeks.strings;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str="welcome to Gfg";
		//String str="welcome";
		
		//Naive Solution
		//Create a Stack
		//Put words one by one into it
		//Pop words from the stack and append to output
		//Solution requires Auxillary Space equal to number of words in the string as well as number of
		//characters in individual word. O(n)
		
		char[] resultCharArray=reverseWords(str.toCharArray(), str.length());
		String stringResult=new String(resultCharArray);
		System.out.println(stringResult);

	}

	public static char[] reverseWords(char ch[], int n) {
		
		//Starting Point of current word
		int start=0;
		
		//Reverse Individual Word
		for(int end=0; end<n; end++){
			
			if(ch[end] == ' '){
				reverse(ch,start,end-1);
				start=end+1;
			}
		}	
		
		
		//Reverse the last word
			reverse(ch,start,n-1);
			
		//Reverse whole array
			reverse(ch, 0, n-1);
		
		return ch;
	}

	public static void reverse(char ch[], int start, int end) {
		
		while(start < end){
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			
			start++;
			end--;
		}
		
	
	}

}
