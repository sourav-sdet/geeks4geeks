package com.geeks4geeks.arrays;

public class PrefixSum {

	public static void main(String[] args) {

		//1) Given fixed array and multiple queries
		// {2,8,3,9,6,5,4}
		//getSum(l,r)
		
		//Answer queries in O(1) time
		
		int arr[]={2,8,3,9,6,5,4};
		int sum=getSum_Naive(arr, 0,2);
		System.out.println(sum);
		
		int prefixSum[]=prefixSum(arr,arr.length);
		sum=getSum_PrefixSum(prefixSum, 0,2);
		System.out.println(sum);
		
		

	}
	
	public static int getSum_PrefixSum(int[] prefixSum, int l, int r) {
		int sum;
		if(l!=0){
			sum=prefixSum[r]-prefixSum[l-1];
		}
		else {
			sum=prefixSum[r];
		}
		
		
		return sum;
	}

	//Worst Case complexity can be O(n) when l=0 and r=n-1
	public static int getSum_Naive(int[] arr, int l, int r) {
		
		int sum=0;
		for (int i=l; i<=r; i++){
			sum=sum+arr[i];
		}
		return sum;
	}
	
	
	//Prefix Sum Array- array with sum of elements from 0 to i at index i
	//Suffix Sum Array- array with sum of elements from i to n-1 at index i
	public static int[] prefixSum(int[] arr, int n) {
		
		//Build a prefix sum array
		int prefixSum[]=new int[n]; //same size as of original array
		prefixSum[0]=arr[0];
		
		for(int i=1; i<n; i++){
			prefixSum[i]=prefixSum[i-1]+ arr[i]; //previous value of prefix sum + current element
		}
		
		
		//To answer queries in O(1) time, use the prefix sum
		//prefixSum[r] - prefixSum[l-1]
		
		return prefixSum;
		
	}
}
