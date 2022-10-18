package com.geeks4geeks.arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		
		//Point where sum of elements before it equals sum of elements after it
		//Consider sum of elements of leftmost element as 0
		//Consider sum of elements of rightmost element as 0
		int arr[]={3,4,8,-9,20,6};
		boolean ePoint;
		
		ePoint=ePointNaive(arr, arr.length);
		System.out.println(ePoint);
		
		ePoint=ePointEfficient(arr, arr.length);
		System.out.println(ePoint);
		
		
		

	}

	public static boolean ePointEfficient(int[] arr, int length) {

		//Using Prefix Sum Technique
		//Compute PrefixSum -- prefixSum(i)= sum of elements from 0 to i
		//Compute SuffixSum -- suffixSum(i)= sum of elements from i to n-1
		//For every element i, check if prefix(i-1) == suffix(i+1)
		
		
		return false;
	}

	public static boolean ePointNaive(int[] arr, int n) {
		for(int i=0; i<n; i++){
			int leftSum=0,rightSum=0;
			
			for(int j=0; j<i; j++){
				leftSum=leftSum+arr[j];   //Compute LeftSum
			}
			
			for(int k=i+1; k<n; k++){
				rightSum=rightSum+arr[k];  //Compute RightSum
			}
			
			if(leftSum==rightSum){
				return true;
			}
		}

		return false;
	}

}
