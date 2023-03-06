package com.geeks4geeks.searching;

import java.util.Arrays;

public class RepeatingElements_1 {

	public static void main(String[] args) {

		//Given an array, all elements occur exactly once except one element
		//One element may repeat any number of times
		//Zero is always present in the array
		//All elements from 0 to max(arr) are present in the array
		//arr.length >=2
		
		//O(n) time, O(1) auxilliary space, No modifications to original array
		
		int arr[]={0,2,1,3,2,2};
		
		//O(n^2) Time and O(1) Auxilliary space
		int repeatingElement=repeating_SuperNaive(arr, arr.length);
		System.out.println(repeatingElement);
		
		//O(nlogn) Time and O(1) Auxilliary space, Original array is modified
		repeatingElement=repeating_Naive(arr, arr.length);
		System.out.println(repeatingElement);
		
		
		

	}

	public static int repeating_Naive(int[] arr, int n) {

		Arrays.sort(arr);
		for(int i=0; i<n-1; i++){
			if(arr[i] == arr[i+1])
				return arr[i];
		}
		
		
		return 0;
	}

	public static int repeating_SuperNaive(int[] arr, int n) {
		
		//Run a loop from 0 to second last element
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n ; j++){
				if(arr[i] == arr[j])
					return arr[i];
			}
		}

		return -1;
	}

}
