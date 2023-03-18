package com.geeks4geeks.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[]={10,7,15,3,2,9,6,3,3};
		insertionSort(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));

	}

	public static void insertionSort(int[] arr, int n) {

		//O(n^2) time in worst case (reverse sorted), O(n) in best case (sorted)
		//In Place and Stable Algorithm
		//Best used when array size is small
		//Element i: elements from 0 to i-1 should already be sorted, insert element i into the sorted part
		//at correct position and increment the length of sorted part
		
		//Run a loop that begins with the second element as first element is already sorted
		for(int i=1; i<n; i++){    //Loop from 1 to n-1
			
			//For every element, first store it in an element called key
			int key=arr[i];
			
			//Go to the left side of the element and find its correct position in sorted array
			int j=i-1;
			while(j>=0 && arr[j] > key){     //Run the loop while elements are greater than key, ensures stablility as well
				//Shift elements to the right
				arr[j+1] = arr[j];
				j--;

			}
			
			arr[j+1]=key;
			
		}
	}

}
