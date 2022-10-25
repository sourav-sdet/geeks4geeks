package com.geeks4geeks.arrays;

public class SlidingWindow_MaximumSumOfKConsecutiveElements {

	public static void main(String[] args) {


		int arr[]={1,8,30,-5,20,7};
		int k=3;
		
		//Find Maximum Sum of k consecutive elements
		int sum=maximumSumKConsecutiveElements(arr,k);
		System.out.println(sum);
		
	}

	public static int maximumSumKConsecutiveElements(int[] arr, int k) {
		int curr_sum=0;
		
		//Compute the sum of first window/first k elements (0 to k-1)
		for(int i=0; i<k; i++){
			curr_sum=curr_sum+arr[i];
		}
		
		int max_sum=curr_sum;
		
		//Compute Sum of remaining window elements (k to n-1)
		for(int i=k; i<arr.length; i++){
			//Add first element of current window, subtract first element of last window
			curr_sum=curr_sum+arr[i] - arr[i-k];
			max_sum=Math.max(max_sum, curr_sum);		}
			
		return max_sum;
	}

}
