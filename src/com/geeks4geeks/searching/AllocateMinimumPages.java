package com.geeks4geeks.searching;

public class AllocateMinimumPages {

	public static void main(String[] args) {

		//Given number of pages in n books
		//Number of students
		//Constraint: A student can only read contiguous books
		//Task is to minimize the maximum number of pages allocated
		
		int arr[]={10,20,10,30};
		
		int result=allocateMinPages(arr, arr.length, 2);
		System.out.println(result);
		
	}
	
	//Input is not sorted, but we are using Binary Search
	//Objective: Maximum number of pages read by a student is minimized
	
	//The maximum number of pages read by a student is upper bounded by the sum of total pages to be read (sum)
	//Minimum possible value is maximum pages in a book -- max(array) (max)
	//Our answer must lie in the range of max and sum
	//Perform Binary Search in the range of max and sum
	public static int allocateMinPages(int[] arr, int n, int k) {

		//Compute the sum of array elements and the max of array
		int sum=0,max=0;
		for(int i=0; i<n; i++){
			sum=sum+arr[i];
			max=Math.max(max, arr[i]);
			
		}
		
		//Execute Binary Search in the range of max to sum
		int low=max, high=sum, res=0;
		while(low<=high){
			
			int mid=low+high/2;
			if(isFeasible(arr,n,k,mid)) {      //If feasible, go to the left half
				res=mid;                       //Update the result everytime we see a feasible solution
				high=mid-1;
			}
			else                              //Else, go to the right half
				low=mid+1;

		}
		
		return res;
	}
	
	//Time Complexity: O(n log (sum-max))
	//This method simply traverses through the array, checks how many students are required when
	//no students get more than "mid" number of pages
	public static boolean isFeasible(int[] arr, int n, int k, int ans) {
		
		int req=1, sum=0;
		for(int i=0; i<n; i++){
			if(sum+arr[i] > ans){
				req++;
				sum=arr[i];
				
			}
			else{
				sum=sum+arr[i];
			}
			
			
		}
		
		return (req <=k);
	}

}
