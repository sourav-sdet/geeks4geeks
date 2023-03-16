package com.geeks4geeks.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	
	
	public static void main(String args[]){
		
		int arr[]={10,7,15,3,2,9,6,3,3};
		selectionSort(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void selectionSort(int[] arr, int n) {
		
		//UNSTABLE SORT
		//O(n^2) time in all cases
		//Less memory writes as compared to other sorting algorithms, but Cycle Sort is most optimal
		//Find out/Select the min element and put in first position
		//Find out/Select second min element and put in second position and so on...
		//At any point, we maintain two sub arrays- Sorted and Unsorted
		
		//Elements from 0 to i are meant to be sorted, i+1 to n-1 are not yet sorted
		for(int i=0; i<n-1; i++){     //loop runs from 0 to n-2 for optimization
			
			int minIndex=i;
			for(int j=i+1; j<n; j++){
				if(arr[j] < arr[minIndex]){
					
					minIndex=j;
					
					
				}
				
			}
			
			//Swap
			int temp=arr[i];
			arr[i]= arr[minIndex];
			arr[minIndex]= temp;
			
			
		}
		
		
		
	}

}
