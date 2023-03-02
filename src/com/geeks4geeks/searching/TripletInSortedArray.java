package com.geeks4geeks.searching;

public class TripletInSortedArray {

	public static void main(String[] args) {


		//Given a sorted array and a number x
		//Check if there exists a triplet in the array whose sum equals x
		int arr[]={2,3,9,20,40,48};
		
		boolean res=checkTriplet_Naive(arr, arr.length, 32);
		System.out.println(res);
		
		
		res=checkTriplet_Efficient(arr, arr.length, 32);
		System.out.println(res);
		
	}
	
	public static boolean checkTriplet_Efficient(int[] arr, int n, int sum) {
		//Traverse the array from left to right
		//For every i, check if a pair sum exists for  x-arr[i]
		
		//Time Complexity- O(n ^ 2), same for sorted as well as unsorted array.
		//In case of unsorted array, sort the array first
		for(int i=0; i<n-2; i++){       //Loop till n-3
			
			if(twoPointerModified(arr, sum-arr[i], i+1))
				return true;
			
		}
		
		return false;
	}

	public static boolean twoPointerModified(int[] arr, int x, int si ) {

		int i=si,j=arr.length-1;
		
		
		while(i < j){    //Come out of the loop when i and j become same
			
			if(arr[i] + arr[j] == x )
				return true;
			else if(arr[i] + arr[j] > x)
				j=j-1;
			else
				i=i+1;
		}
		
		return false;
	}

	//Naive Solution: O(n ^3)
	public static boolean checkTriplet_Naive(int[] arr, int n, int x) {

		for(int i=0; i<n-2; i++){
			
			for(int j=i+1; j<n-1; j++){
				
				for(int k=j+1; k<n; k++){
					if(arr[i] + arr[j] + arr[k] ==x)
						return true;
					
				}
			}
			
			
		}
		
		
		return false;
	}

}
