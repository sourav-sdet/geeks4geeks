package com.geeks4geeks.searching;

public class IndexOfLastOccurenceInSortedArray {

	public static void main(String[] args) {

		//Given a sorted array, find index of first occurrence of x in the array
		int arr[]={1,10,10,10,20,20,40};
		int index=indexLastOccurence_Naive(arr,10);
		System.out.println(index);
				
				
		index=indexLastOccurence_Efficient(arr,10);
		System.out.println(index);

	}

	public static int indexLastOccurence_Efficient(int[] arr, int x) {

		int low=0,high=arr.length-1;
		
		while(low <=high){
			
			
			//NORMAL BINARY SEARCH
			int mid=(low+high)/2;
			
			if(x < arr[mid]){
				high=mid-1;
			
			}
			
			else if(x > arr[mid])
				low=mid+1;
			
			
			//If search element equals mid, check if it is the last occurrence, else shift to right half.
			else {
				if(arr[mid] != arr[mid+1] || mid==arr.length-1)
					return mid;
				else
					low=mid+1;
				
			}
			
			
			
		}
		
		
		
		return 0;
	}

	public static int indexLastOccurence_Naive(int[] arr, int x) {

		for(int i=arr.length-1; i>=0; i--){
			
			if(arr[i] == x)
				return i;
		}
		
		
		return 0;
	}

}
