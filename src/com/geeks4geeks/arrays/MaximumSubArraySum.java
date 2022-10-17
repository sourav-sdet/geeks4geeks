package com.geeks4geeks.arrays;

public class MaximumSubArraySum {

	public static void main(String[] args) {

		//Sub arrays are contiguous elements in array
		//int arr[]={1,2,3}
		//{1,3} not a sub array as they are not contiguous
		
		int arr[]={-5,1,-2,3,-1,2,-2};
		int maxSum=maxSubArraySum(arr, arr.length);
		System.out.println(maxSum);
		

	}

	public static int maxSubArraySum(int[] arr, int length) {
		
		//KADANE ALGORITHM
		int result=arr[0];
		int maxEnding=arr[0];
		
		for(int i=1; i<length; i++){
			maxEnding=Math.max(maxEnding+arr[i], arr[i]);
			result=Math.max(result, maxEnding);
		}

		return result;
	}

}
