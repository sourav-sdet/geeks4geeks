package com.geeks4geeks.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {


		//STABLE SORT
		//Always compares adjacent elements, arr[i] with arr[i+1]
		//arr[i] <= arr[i+1], Do nothing
		//arr[i] > arr[i+1], Swaps
		
		//If two items appear one after the other, its not going to swap them-- STABLILITY
		int arr[]={10,7,15,3,2,9,6,3,3};
		bubbleSort(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));

	}
	
	//O(n^2) time complexity
	//First Pass: Largest element is moved to the last index
	//Second Pass: Second largest element is moved to the second last index and so on ...
	//n-1 passes for n elements
	public static void bubbleSort(int[] arr, int n) {
		
		for(int i=0; i<n-1; i++){     //0 to n-2 = n-1 passes
			
			//Optimization to handle cases when array is already sorted/gets sorted in the middle of iterations
			boolean swapped=false;
			
			for(int j=0; j<n-i-1; j++) {     //Compare adjacent elements --> n-2 and n-1
				//Optimize n-1 to n-i-1 as in ith loop, i largest elements will already be preset at correct location
				
				if(arr[j] > arr[j+1]){
					
					//Swap(arr[j], arr[j+1])
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					
					swapped=true;
					
				}
				
			}
			
			if(swapped==false)
				break;
				
				
		}
		
	}

}
