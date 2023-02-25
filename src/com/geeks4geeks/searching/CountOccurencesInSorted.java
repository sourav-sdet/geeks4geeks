package com.geeks4geeks.searching;

public class CountOccurencesInSorted {

	public static void main(String[] args) {

		
		//Given: Sorted Array which may contain duplicates
		//Find Occurrences of an element in sorted array
		int arr[]={10,10,10,10,10};
		int count=countOccurrence(arr, 10);
		System.out.println(count);
		
	}

	public static int countOccurrence(int[] arr, int x) {
		
		//Find the first occurence
		int first=IndexOfFirstOccurenceInSorted.indexFirstOccurence_Efficient(arr, x);
		
		//If no first occurrence, return 0
		if(first == -1)
			return 0;
		//Number of occurences= lastOcc- firstOcc +1
		else
			return (IndexOfLastOccurenceInSortedArray.indexLastOccurence_Efficient(arr,arr.length, x) - first +1);
		
	}
	
	
	//Naive Solution: Linearly traverse through the array and find number of times element is present
	//O(n) time solution
	
	
	//O(logn) solution using first occurrence and last occurence solutions
	

}
