package com.geeks4geeks.searching;

public class UnboundedBinarySearch {

	public static void main(String[] args) {


		//Infinite Binary Search Array
		int arr[]={1,2,3,4,5,6,7,8,9};
		
		int index=unboundedBinarySearch_Naive(arr,3);
		System.out.println(index);
		
		//index=unboundedBinarySearch_Efficient(arr,3);
		//System.out.println(index);
		

	}

	/*
	//O(log n) time
	public static int unboundedBinarySearch_Efficient(int[] arr, int x) {

		if(arr[0] == x)
			return 0;
		
		int i=1;
		while(arr[i] < x)
			i=i*2;
		
		if(arr[i] == x)
			return i;
		
		return bSearch(arr, (i/2)+1, i-1, x);
		
	}

	*/
	
	//O(pos) time where pos is the position of element x
	public static int unboundedBinarySearch_Naive(int[] arr, int x) {
		
		int i=0;
		while(true){
			if(arr[i] == x)
				return i;
			
			if(arr[i] > x)
				return -1;
			
			i++;
		}
		
	}

}
