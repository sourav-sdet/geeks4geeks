package com.geeks4geeks.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountOfDistinctElements {

	public static void main(String[] args) {
		
		int arr[]= {10,20,10,10,20,30,40};
		int distinctSize;
		
		//Naive Approach
		distinctSize=countDistinctNaive(arr);
		System.out.println(distinctSize);
		
		//Efficient Approach
		distinctSize=countDistinctEfficient(arr);
		System.out.println(distinctSize);
		
		//Improved Efficient Approach
		//distinctSize=countDistinctImprovedEfficient(arr);
		//System.out.println(distinctSize);
	
	}
	/*
	public static int countDistinctImprovedEfficient(int[] arr) {
		
		HashSet<Integer> hset=new HashSet<>(Arrays.asList(arr));
		return hset.size();
		
	}
	*/

	public static int countDistinctEfficient(int[] arr) {
		
		HashSet<Integer> hset=new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			hset.add(arr[i]);
		}
		
		return hset.size();
		
	}

	public static int countDistinctNaive(int[] arr) {
		
		int res=0;
		for(int i=0; i<arr.length; i++) {
			boolean flag=false;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag=true;
					break;
				}
			}
			
			if(flag==false) {
				res++;
			}
		}
		
		return res;
	}

}
