package com.geeks4geeks.arrays;

public class TrappingRainWater {

	public static void main(String[] args) {

		//Given array of non negative integers
		//Values in the array are heights of bars
		//If array is in increasing or decreasing order, O units of water can be collected.
		//Leftmost and Rightmost bars can never store water
		//i=0 and i=n-1 can never store any water
		
		//int arr[]={2,0,2};
		int arr[]={3,0,1,2,5};
		int units=trappingRainWater_Naive(arr, arr.length);    //n*n solution
		System.out.println(units);
		
		units=trappingRainWater_Efficient(arr, arr.length);    //n time and space  solution
		System.out.println(units);

	}

	public static int trappingRainWater_Efficient(int[] arr, int n) {

		//Precompute lMax and rMax instead of computing it for every i
		int units=0;
		int lMax[]=new int[n];
		int rMax[]=new int[n];
		
		lMax[0]=arr[0];
		for(int i=1; i<n; i++){
			lMax[i]=Math.max(arr[i], lMax[i-1]);
		}
		
		
		rMax[n-1]=arr[n-1];
		for(int i=n-2; i>=0; i--){
			rMax[i]=Math.max(arr[i], rMax[i+1]);
		}
		
		//Same approach as naive
		for(int i=1; i<n-1; i++){
			units=units+(Math.min(lMax[i], rMax[i])  - arr[i]);
		}
		
		return units;
	}

	public static int trappingRainWater_Naive(int[] arr, int n) {

		//For any ith bar between 1 to n-2, find lMax and rMax
		//Result for ith bar= min(lMax,rMax)-arr[i]
		
		int units=0;
		for(int i=1; i<n-1; i++){
			
			//Find lMax
			int lMax=arr[i];
			for(int j=0; j<i; j++){     //Traverse from 0 to i-1
				lMax=Math.max(lMax, arr[j]);
			}
			
			//Find rMax
			int rMax=arr[i];
			for(int j=i+1; j<n; j++){    //Traverse from i+1 to n-1
				rMax=Math.max(rMax, arr[j]);
				
			}
			units=units+(Math.min(lMax, rMax)) -arr[i];
		}
		
		
		
		return units;
	}

}
