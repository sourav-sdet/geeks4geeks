package com.geeks4geeks.searching;

public class IndexOfFirstOccurenceInSorted {

	public static void main(String[] args) {


		//Given a sorted array, find index of first occurrence of x in the array
		int arr[]={1,10,10,10,20,20,40};
		int index=indexFirstOccurence_Naive(arr,10);
		System.out.println(index);
		
		
		index=indexFirstOccurence_Efficient(arr,10);
		System.out.println(index);
		

	}

	public static int indexFirstOccurence_Efficient(int[] arr, int x) {

		int low=0, high=arr.length-1;
		
		//NORMAL BINARY SEARCH
		while(low <= high){
			
			int mid=(low+high)/2;
			if(x > arr[mid])
				low=mid+1;
			else if(x < arr[mid])
				high=low-1;
			
			
			//If search element equals mid, check if it is the first occurrence, else shift to left half.
			else{
				
				if(mid ==0 || arr[mid-1] != arr[mid])
					return mid;
				else
					high=mid-1;

			}
			
			
		}
		
		
		return 0;
	}

	public static int indexFirstOccurence_Naive(int[] arr, int x) {
		
		//Same as Linear Search- Time Complexity O(n), Space Complexity- O(1)
		for(int i=0; i<arr.length; i++){
			if(arr[i] == x)
				return i;
		}

		return -1;
	}

}
