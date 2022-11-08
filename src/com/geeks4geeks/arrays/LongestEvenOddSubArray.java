package com.geeks4geeks.arrays;

public class LongestEvenOddSubArray {

	public static void main(String[] args) {

		//Find the length of the longest subarray that has alternating even odd elements
		//Might begin with even or odd element
		//Sub Array- Contiguous elements
		
		//int arr[]={10,12,14,7,8};  //Output is 3
		//int arr[]={7,10,13,14};  //Output is 4
		//int arr[]={10,12,8,4};   //Output is 1 as all elements are even
		int arr[]={3,5,7,9};     //Output is 1 as all elements are odd
		
		//Single element is also considered as alternating subarray
		
		//Naive Solution: Quadratic complexity
		//Traverse through all the elements, for every element we find out longest alternating sub array
		//that begins with the element
		//Check if longest is more than result
		
		int length=longestEvenOddSubArrayNaive(arr,arr.length);
		System.out.println(length);
		
		//Efficient Solution- Based on Kadane's Algorithm, Linear complexity
		length=longestEvenOddSubArrayEfficient(arr, arr.length);
		System.out.println(length);
		

	}

	public static int longestEvenOddSubArrayEfficient(int[] arr, int n) {

		//Based on Kadane's Algorithm
		//Begin traversing from the second element
		
		int res=1;    //Single element is also considered as alternating sub array
		int curr=1;   //Single element is also considered as alternating sub array
		
		//For every element there are two cases:
		//Either begin a new sub array or extend the previous sub array
		//Extend the sub array when current element is alternating with the previous element
		//Begin a new sub array when it is not alternating
		
		
		for(int i=1; i<n; i++){
			if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i-1] % 2 == 0)){
				curr++;
				res=Math.max(curr, res);
			}
			
			else
				curr=1;
		}
		
		
		return res;
	}

	public static int longestEvenOddSubArrayNaive(int[] arr, int n) {
		
		int result=1; //Single element is also considered as alternating sub array
		
		for(int i=0; i<n; i++){
			int curr=1;  //Single element is also considered as alternating sub array
			
			for(int j=i+1; j<n; j++){
				if((arr[j] % 2 ==0 && arr[j-1] % 2 !=0) || (arr[j] % 2 !=0 && arr[j-1] % 2 ==0)){
					curr++;
				}
				
				else
					break;
			}
			
			result=Math.max(result, curr);
		}
		
		
		
		return result;
	}

}
