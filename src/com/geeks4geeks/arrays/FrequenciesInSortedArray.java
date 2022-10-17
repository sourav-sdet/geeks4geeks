package com.geeks4geeks.arrays;

public class FrequenciesInSortedArray {

	public static void main(String[] args) {

		int arr[]={10,10,10,25,30,30,40};
		printFrequencies(arr, arr.length);
		
	}

	public static void printFrequencies(int[] arr, int n) {

		int freq=1;   // as we consider first element of array already processed
		int i=1;	  // as we start from the second element
		
		while(i<arr.length){
			{
				//Same as previous element
				while(i<arr.length && arr[i] == arr[i-1]){
					freq++;
					i++;
				}
				
				System.out.println(arr[i-1]+"-"+freq);
				
				//Not same as previous element
				i++;
				freq=1;
			}
		}
		
		//Corner case scenario
		if(n==1 || arr[n-1]!=arr[n-2]){
			freq=1;
			i=1;
		}
		
		
		
	}

}
