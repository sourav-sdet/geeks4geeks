package com.geeks4geeks.strings;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="geeksforgeeks";
		
		boolean result=isPalindrome_Naive(str);
		System.out.println(result);
		
		result=isPalindrome_Efficient(str);
		System.out.println(result);	

	}

	public static boolean isPalindrome_Efficient(String str) {

		int begin=0, end=str.length()-1;
		//begin==end --> EVEN, begin>end --> ODD
		while(begin < end){
			if(str.charAt(begin) != str.charAt(end))
				return false;
			begin++;
			end--;
		}
		
		return true;
	}

	public static boolean isPalindrome_Naive(String str) {


		StringBuilder rev=new StringBuilder(str);
		rev.reverse();
		return str.equals(rev.toString());
		
	}

}
