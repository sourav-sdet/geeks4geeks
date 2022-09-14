package com.geeks4geeks.arrays;

public class MaximumDifference {

	public static void main(String[] args) {

		//Max value of arr[j] - arr[i], where j > i
		//If array is sorted in ascending order, max difference is last element - first element
		int arr[]={2,3,10,6,4,8,1};
		
		int maxDiff=maximumDifference(arr, arr.length);
		System.out.println(maxDiff);
	}

	public static int maximumDifference(int[] arr, int n) {

		int maxDiff=arr[1]-arr[0];
		int minVal=arr[0]; //stores minimum value of the array
		
		for(int i=1; i<n; i++){
			maxDiff=Math.max(maxDiff, arr[i] - minVal);
			minVal=Math.min(minVal, arr[i]);
		}
		
		
		return maxDiff;
	}
	
	
	

}
