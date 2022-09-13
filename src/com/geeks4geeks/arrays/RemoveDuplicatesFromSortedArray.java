package com.geeks4geeks.arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int arr[] ={1,2,3,3,3,4, 4,5,5,6,7,8};
		int size;
		
		size=removeDuplicates_Naive(arr, arr.length);
		System.out.println(size);
		
		size=removeDuplicates_Efficient(arr, arr.length);
		System.out.println(size);
		
		
		

	}

	public static int removeDuplicates_Efficient(int[] arr, int n) {
		
		//Initialize size of result array as 1
		int result=1;
		
		for(int i=1; i<n; i++){
			if(arr[result-1] != arr[i] ){
				arr[result] = arr[i];
				result++;
			}
		}
		
		return result;
	}

	public static int removeDuplicates_Naive(int arr[], int n) {

		//Create temporary array, copy all distinct elements to it
		int temp[]=new int[n];   // size may be equal to original array size as all elements may be distinct
		
		//First element will always be a part of the temp array
		temp[0]=arr[0];
		
		//Initialize size of result array as 1
		int result=1;
		
		
		for(int i=1; i<n; i++){
			//Check if this element is same as the last copied element
			if(temp[result-1] != arr[i]){
				temp[result]=arr[i];
				result++;
			}
		}
		
		return result;	
		
	}

}
