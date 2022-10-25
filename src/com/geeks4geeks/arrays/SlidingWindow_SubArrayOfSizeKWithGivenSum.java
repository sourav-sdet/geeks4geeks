package com.geeks4geeks.arrays;

public class SlidingWindow_SubArrayOfSizeKWithGivenSum {

	public static void main(String[] args) {


		int arr[]={1,8,30,-5,20,7};
		int k=3;
		int sum=47;
		
		boolean subArrayOfSizeKExists= subArrayOfSizeKWithGivenSum(arr, k, sum);
		System.out.println(subArrayOfSizeKExists);
		
		

	}

	public static boolean subArrayOfSizeKWithGivenSum(int[] arr, int k, int sum) {

		int curr_sum=0;
		
		//Compute the sum of first window/first k elements (0 to k-1)
		for(int i=0; i<k; i++){
			curr_sum=curr_sum+arr[i];
		}
		
		//Compare with given sum
		if (curr_sum == sum){
			return true;
		}
		
		
		//Compute Sum of remaining window elements (k to n-1)
		for(int i=k; i<arr.length; i++){
			curr_sum= curr_sum+arr[i] - arr[i-k];
			
			if(curr_sum == sum){
				return true;
			}
		}
		return false;
	}

}
