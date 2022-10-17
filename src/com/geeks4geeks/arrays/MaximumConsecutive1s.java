package com.geeks4geeks.arrays;

public class MaximumConsecutive1s {

	public static void main(String[] args) {

		int arr[]={0,1,1,1,0,1,0};
		
		int max=maxConsecutiveOnes(arr,arr.length);
		
		System.out.println(max);
	}

	public static int maxConsecutiveOnes(int[] arr, int length) {
		
		//Traverse the array from left to right, when we see a 0, reset the current count
		int count=0, result=0;
		for(int i=0; i<length; i++){
			if(arr[i] ==0){
				count=0;
			}
			//Increment count and find the max count
			else{
				count++;
				result=Math.max(result, count);
			}
				
		}

		return result;
	}

}
