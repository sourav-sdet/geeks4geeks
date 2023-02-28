package com.geeks4geeks.searching;

public class SearchSortedRotatedArray {

	public static void main(String[] args) {

		//Given a sorted and rotated array, find index of an element if it exists
		//Sorted array can be rotated any number of times
		int arr[]={100,200,500,1000,2000, 10, 20};
		int index=searchInSortedRotatedArray_Naive(arr, 30);
		System.out.println(index);
		
		index=searchInSortedRotatedArray_Efficient(arr, 30);
		System.out.println(index);
		

	}
	//Use Binary Search, O(logn) time
	//In a sorted and rotated array, one half of the array will always be sorted
	//Compute middle element, compare with any corner element
	//If middle element is greater than first element, left half is sorted, else right half is sorted
	//If search element is present in range of first element to middle element, consider right half, else consider left half
	//Corner Case: Both Halves of the array are sorted
	public static int searchInSortedRotatedArray_Efficient(int[] arr, int x) {
		
		int low=0, high=arr.length-1;
		while(low<=high){
			
			//NORMAL BINARY SEARCH
			int mid=(low+high)/2;
			if(arr[mid] == x)
				return mid;
			
			
			//CHECK IF LEFT HALF OR RIGHT HALF IS SORTED
			if(arr[mid] > arr[low]) {    // Left Half Sorted
				//Consider this half or ignore this half
				if(x >= arr[low] && x < arr[mid])
					high=mid-1;
				else
					low=mid+1;
						
			}
			
			else{     //Right Half Sorted
				//Consider this half or ignore this half
				if(x > arr[mid] && x <= arr[high])
					low=mid+1;
				else
					high=mid-1;
	
			}

		}
		
		return -1;
	}
	
	
	//Simple Linear Search, O(n) time
	public static int searchInSortedRotatedArray_Naive(int[] arr, int x) {
		
		for(int i=0; i< arr.length; i++){
			if(arr[i] == x)
				return i;
		}
		
		return -1;
	}

}
