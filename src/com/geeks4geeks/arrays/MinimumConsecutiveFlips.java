package com.geeks4geeks.arrays;

public class MinimumConsecutiveFlips {

	public static void main(String[] args) {

		//Target is to make all elements same either by flipping all 0s or all 1s
		
		int arr[]={0,0,1,1,0,0,1,1,0};

		//Naive Solution:
		//Traverse the array from left to right, count how many groups of 0s and 1s are present.
		//Find the minimum group count
		
		minimumConsecutiveFlips(arr, arr.length);
	}

	private static void minimumConsecutiveFlips(int[] arr, int n) {
		//Only 2 possibilities: Group counts differ by 1 or they are same
		
		//Differ by 1: Begin Index Element same as End Index
		//Same: Begin Index Element != End Index
		
		//Hence first group never going to be flipped.
		//Always flip the second group as they will differ by 1 or same as the first group
		
		for(int i=1; i<n; i++){    //start from the second element of the array
			
			//If equal, do nothing, just increment i by 1
			
			//If unequal, then it is the beginning of second group element
			if(arr[i] != arr[i-1]){
				
				if(arr[i] != arr[0]){    //Compare it with the first element
					System.out.println("From i: "+i);
				}
				else
					System.out.println(i-1);
			}
			
			
		}
		
		
		//To handle number of groups are same case
		if(arr[n-1] != arr[0])
			System.out.println(n-1);
		
		
		
	}

}
