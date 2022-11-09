package com.geeks4geeks.arrays;

public class MaximumCircularSumSubarray {

	public static void main(String[] args) {

		//A circular sub array includes normal sub arrays as well as sub arrays formed by connecting last element
		//back to first element
		//Find maximum sum of all circular sub arrays
		
		int arr[]={3,-4,5,6,-8,7};
		
		int maxSum=maximumCircularSumSubArray_Naive(arr, arr.length);
		System.out.println(maxSum);
		
		maxSum=maximumCircularSumSubArray_Efficient(arr, arr.length);
		System.out.println(maxSum);
		
		

	}
	//Linear Time Complexity
	//Idea: Find Maximum Sum of normal sub array using Kadane's algorithm
	//Find Maximum sum of circular sub array
	//Find maximum of the above two
	
	//Find out maximum sum of circular sub array using sum of whole array - minimum sum of normal sub array (MODIFIED KADANE'S ALGORITHM)
	public static int maximumCircularSumSubArray_Efficient(int[] arr, int n) {
		
		//Compute Maximum sum in normal sub array
		int maxSum_Normal=normalMaxSum(arr,n);     //Normal Max Sum Computation using Standard Kadane's Algorithm
		
		//If all the elements in the array are negative
		if(maxSum_Normal < 0)
			return maxSum_Normal;
		
		//Compute Maximum Sum in Circular sub array-- Whole Array Sum - Min Sub Array Sum
		// In order to use the same method of Standard Kadane's algorithm, invert the array
		int array_sum=0;
		for(int i=0; i<n; i++){
			array_sum=array_sum+arr[i];
			arr[i]=-arr[i];    //Invert the array
		}
		
		int maxSum_Circular=array_sum+normalMaxSum(arr,n);
		
		return Math.max(maxSum_Circular,maxSum_Normal) ;
	}

	//STANDARD KADANE
	public static int normalMaxSum(int arr[], int n){
		
		int res=arr[0];
		int maxEnding=arr[0];
		
		for(int i=1; i<n; i++){
			maxEnding=Math.max(arr[i], maxEnding+arr[i]);
			res=Math.max(res, maxEnding);
		}
		return res;	}
	
	
	
	//Quadratic Time Complexity
	//Consider every element as the beginning element, find out the maximum sum that can be obtained by this element as beginning element
	//For every element, we find out all the sub arrays, find out their sum, store maximum of these sums for every element.
	//Final result is maximum of all these maximum sums.
	public static int maximumCircularSumSubArray_Naive(int[] arr, int n) {
		
		int result=arr[0];
		
		for(int i=0; i<n; i++){
			
			int curr_max=arr[i];       //stores the maximum sum that can be obtained when element at index i is the beginning of subarray
			int curr_sum=arr[i];
			
			//For every element, there can be n sub arrays since we need to consider circular sub array
			
			for(int j=1; j<n; j++){
				int index=(i+j)%n;
				curr_sum=curr_sum+arr[index];
				curr_max=Math.max(curr_max, curr_sum);
			}
			
			result=Math.max(result, curr_max);
		}
		
		
		return result;
	}

}
