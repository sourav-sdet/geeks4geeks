package com.geeks4geeks.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {


		//Divide and Conquer algorithm
		//Stable Sorting Algorithm
		//Theta(nlogn) time and O(n) space- best possible time for a random input
		//Works well for linkedlists, O(1) Aux space
		//Quick Sort outperforms Merge Sort for arrays
		
		int arr[]={10,15,20,40,8,11,15,22,25};
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		

	}

	public static void mergeSort(int[] arr, int l, int r) {

		if(r > l){    //Check if array contains at least 2 elements
			
			int m=l+(r-l)/2;     //to avoid overflow when l and r are high
			
			//Recursively Sort Elements from l to mid
			mergeSort(arr, l, m);
			
			//Recursively Sort Elements from mid+1 to r
			mergeSort(arr, m+1, r);
			
			merge(arr, l, m, r);
	
		}

		
	}

	//ELements from low to mid are sorted, mid+1 to high are sorted
	public static void merge(int[] arr, int low, int mid, int high) {


		//Create two auxillary arrays left and right
		//Size of left- low to mid
		//Size of right- mid+1 to high
		//Copy elements from arr to left and right
		
		int n1=mid-low+1, n2=high-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		//Copy n1 elements of array to left
		for(int i=0; i<n1; i++){
			
			left[i]=arr[low+i];
		}
		
		//Copy n2 elements of array to right
		for(int j=0; j<n2; j++){
					
			right[j]=arr[mid+j+1];
		}
		
		int i=0, j=0, k=low;
		while(i < n1 && j < n2){
			
			if(left[i] <= right[j]) {
				arr[k]=left[i];
				i++;
				k++;
			}
			
			else{
				arr[k]=right[j];
				j++;
				k++;
				
			}
			
		}
		
		
		while(i < n1){
			arr[k]=left[i];
			i++;
			k++;
		}
		
		while(j< n2){
			arr[k] = right[j];
			j++;
			k++;
		}

		
	}

}
