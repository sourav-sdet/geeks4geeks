package com.geeks4geeks.arrays;

public class CheckArraySorted {

	public static void main(String[] args) {
		
		
		int arr[] ={1,2,3,4,5,6,7,8};
		boolean array_sorted_naive=arraySortedNaive(arr);
		System.out.println(array_sorted_naive);
		
		boolean array_sorted_efficient=arraySortedEfficient(arr);
		System.out.println(array_sorted_efficient);
		
	}

	public static boolean arraySortedEfficient(int[] arr) {
		
		//For every element, check if it is smaller than the previous element
		for(int i=1; i<arr.length; i++){
			if(arr[i] < arr[i-1])
				return false;
		}	
		
		return true;
	}

	public static boolean arraySortedNaive(int[] arr) {
		
		//Check for every element, there should be no smaller element on the right side
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[i])
					return false;
			}
		}
		return true;
	}

}
