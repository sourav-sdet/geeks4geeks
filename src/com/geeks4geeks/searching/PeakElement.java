package com.geeks4geeks.searching;

public class PeakElement {

	public static void main(String[] args) {

		//An element is called a peak element if it is not smaller than (greater than or equal to) its neighbours
		//Leftmost Element- only check element after it.
		//Rightmost element- only check element before it.
		
		
		//Unsorted Input Array
		int arr[]={6,7,8,20,12};
		
		int peakElement=getPeak_Naive(arr, arr.length);
		System.out.println(peakElement);
		
		peakElement=getPeak_Efficient(arr, arr.length);
		System.out.println(peakElement);
		

	}

	
	//Use Binary Search Approach
	//O(logn) time complexity
	public static int getPeak_Efficient(int[] arr, int n) {
		
		int low=0, high=n-1;
		while(low<=high){
			
			int mid=(low+high)/2;
			if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == n-1 || arr[mid] >= arr[mid] + 1))
				return arr[mid];
			
			//left element is greater than or equal to mid element, go to the left half
			if(mid > 0 && arr[mid-1] >= arr[mid])
				high=mid-1;
			
			//right element is greater than or equal to mid element, go to the right half
			else
				low=mid+1;		
		}
		
		
		return -1;
	}


	//O(n) Time Complexity in worst case when we need to traverse the whole array
	public static int getPeak_Naive(int[] arr, int n) {

		//Check if there is a single element in the array
		if(n ==1)
			return arr[0];
		
		//For more elements check for the corner elements first
		//Check if first element is greater than or equal to second element
		if(arr[0] >= arr[1])
			return arr[0];
		
		//Check if last element is greater than or equal to second last element
		if(arr[n-1] >= arr[n-2])
			return arr[n-1];
		
		for(int i=1; i<n-1; i++){
			if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
				return arr[i];
		}
		
		return -1;
		
	}

}
