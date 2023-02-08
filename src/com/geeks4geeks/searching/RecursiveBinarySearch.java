package com.geeks4geeks.searching;

public class RecursiveBinarySearch {

	public static void main(String[] args) {


		//Given a sorted array, find index of first occurrence of an element, if present.
		//Else return -1
		//If multiple occurrences are there, return index of any occurrences.
		
		
		//Time Complexity of Iterative and Recursive are same --> O(logn)
		//Space Complexity of Iterative --> O(1)
		//Space Complexity of Recursive --> O(logn) for recursive function call stack
		
		int arr[]={2,3,4,5,6,7,8,9};
		int index=binarySearchRecursive(arr,8,0,arr.length-1);
		System.out.println(index);
		

	}

	public static int binarySearchRecursive(int[] arr, int x, int low, int high) {
		
		//Base Case
		if(low > high)
			return -1;
		
		//Compute mid
		int mid=(high+low)/2;
		
		if(x == arr[mid])
			return mid;
		else if(x < arr[mid])
			return binarySearchRecursive(arr, x,low, mid-1);
		else
			return binarySearchRecursive(arr, x,mid+1, high);
		
	}

}
