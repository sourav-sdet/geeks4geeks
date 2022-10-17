package com.geeks4geeks.arrays;

public class MajorityElement {

	public static void main(String[] args) {

		//Majority element is an element that occurs more than n/2 times in an array of size n
		
		int arr[]={6,8,4,8,8};
		int indexMajority;
		indexMajority= findMajority_Naive(arr,arr.length);
		System.out.println(indexMajority);
		
		indexMajority=findMajority_Efficient(arr,arr.length);
		System.out.println(indexMajority);

	}

	public static int findMajority_Efficient(int[] arr, int n) {

		//Murray's Voting Algorithm
		//Phase 1: Find a candidate
		//Phase 2: Check if candidate is actually a majority
		
		//If assumption is there is always going to be a majority, then only one phase is required
		//This algorithm may not always give the first occurence of majority element
		
		//PHASE 1
		int res=0; //index of majority element
		int count=1; //First element is already processed
		for(int i=1; i<n; i++){
			if(arr[i] == arr[res])
				count++;
			else
				count--;
			
			if(count == 0){
				res=i;
				count=1;
			}
		}
		
		//PHASE 2
		//Count number of occurences of res
		int countMaj=0;
		for(int i=0; i<n; i++){
			if(arr[res] == arr[i])
				countMaj++;
		}
		
		if(countMaj <=n/2)
			return -1;
		
		return res;
	}

	public static int findMajority_Naive(int[] arr, int n) {
		
		for(int i=0; i<n; i++){
			int count=1;    //arr[i] is processed
			for(int j=i+1; j<n; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			
			if(count > n/2){
				return i;
			}
		}
		
		return -1;
	}

}
