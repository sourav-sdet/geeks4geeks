package com.geeks4geeks.searching;

public class Count1sInSortedBinaryArray {

	public static void main(String[] args) {


		//Given a sorted binary array, find out the number of 1's in the array
		//int arr[]={0,1,1,1,1,1,1};
		int arr[]={0,0,1,1,1};
		int count=count1s_Naive(arr, arr.length);
		System.out.println(count);
		
		count=count1s_Efficient(arr, arr.length);
		System.out.println(count);
	}

	//Efficient
	//Use Binary Search to find first occurrence of 1, then subtract from the length of array
	//Time Complexity- O(logn), Space Complexity- O(1)
	public static int count1s_Efficient(int[] arr, int n) {
		
		int low=0, high=n-1;
		
		while(low<=high){
			
			int mid=(low+high)/2;
			
			//If mid element is 0, go to right half
			if(arr[mid] == 0)
				low=mid+1;
			
			//If mid element =1, check if it is the first occurrence
			else{
				
				if(mid==0 || arr[mid-1] == 0)
					return n-mid;
				
				else
					high=mid-1;
			}
			
			
			
		}
		return 0;
	}

	//Naive
	//Traverse through the array, as soon as you find a 1, subtract the array length with this index
	//Time Complexity is upper bounded by n O(n) in worst case as we need to travel through the whole array when we dont find 1
	public static int count1s_Naive(int[] arr, int n) {

		for(int i=0; i<n; i++){
			
			if(arr[i] ==1)
				return arr.length-i;
			
		}
		
		
		return 0;
	}

}
