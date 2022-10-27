package com.geeks4geeks.arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

	//Given an unsorted array of non negative integers
	int arr[]={1,4,20,3,10,5};
	int sum=33;
	
	boolean result=isSubarraySum(arr,arr.length, sum);	
	System.out.println(result);	
		

	}
	//Efficient solution using Window Sliding Technique- only for elements with non negative elements
	public static boolean isSubarraySum(int[] arr, int n, int sum) {

		//Maintain a window of current sum
		//Check if the sum of current window is less than the given sum
		//If smaller, add next element
		//If greater, remove elements from beginning and check again
		
		int curr_sum=arr[0]; //first element of the array
		int start=0;  //start of current window
		
		for(int end=1; end<n; end++){       //end of current window
			
			//Clean the previous window if curr_sum is greater than given sum
			while(curr_sum > sum && start < end-1){
				curr_sum=curr_sum - arr[start];
				start++;
			}
			
			//If curr_sum == given sum, return true
			if(curr_sum == sum)
				return true;
			
			//If curr_sum < given sum, add next element
			if(end < n){
				curr_sum= curr_sum+arr[end];
			}
		}
	
		return (curr_sum == sum);
	}

}
