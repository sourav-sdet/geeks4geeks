package com.geeks4geeks.searching;

public class IterativeBinarySearch {

	public static void main(String[] args) {

		//Given a sorted array, find index of first occurrence of an element, if present.
		//Else return -1
		//If multiple occurrences are there, return index of any occurrences.
		
		
		//NAIVE SOLUTION- LINEAR SEARCH: doesnot take into account tht the array is sorted
		int arr[]={2,3,4,5,6,7,8,9};
		int index=linearSearch(arr, 9);
		System.out.println(index);
		
		index=binarySearchIterative(arr,8);

	}

	public static int binarySearchIterative(int[] arr, int x) {
		
		int low=0;
		int high=arr.length-1;
		
		while(low <= high){
			int mid=(low+high)/2;   //Integer division will always fetch the floor value
			if(x == arr[mid]){
				return mid;
			}
			
			else if(x < arr[mid])
				high=mid-1;
			
			else
				low=mid+1;
		
		}
		
		return -1;
	}

	public static int linearSearch(int[] arr, int x) {
		
		for(int i=0; i<arr.length; i++){
			if (arr[i] == x)
				return i;
		}
		
		return -1;
	}

}
