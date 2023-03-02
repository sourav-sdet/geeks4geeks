package com.geeks4geeks.searching;

public class CheckIfPairExistsWithGivenSum {

	public static void main(String[] args) {


		//Two Pointer Approach- best solution for sorted array
		//For unsorted array, hashing can be a better solution, but it requires extra space
		//Check if there exists a pair in the given sorted array which equals the given sum
		int arr[]={2,3,8,11};
		
		boolean res=checkIfPairExistsWithGivenSum(arr, arr.length,15);
		System.out.println(res);
		
		res=twoPointer(arr, arr.length,15);
		System.out.println(res);
		
		

	}
	//Time Complexity- O(n)- Linear
	public static boolean twoPointer(int[] arr, int n, int x) {

		int i=0,j=n-1; //Maintain two pointers
		
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

	//Naive Approach- O(n square) time complexity, worst case happens when there is no pair
	public static boolean checkIfPairExistsWithGivenSum(int[] arr, int n, int x) {
		
		for(int i=0; i<n-1; i++){    //Loop runs from first element to second last element
			
			for(int j=i+1; j<n; j++){
				
				if(arr[i] + arr[j] ==x)
					return true;
				
			}
		}
		
		
		return false;
	}

}
