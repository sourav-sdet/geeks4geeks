package com.geeks4geeks.arrays;

public class LeftRotateByOne {

	public static void main(String[] args) {

		int arr[] ={2,3,4,5,6,7,8};
		
		leftRotateByOne(arr, arr.length);
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	public static void leftRotateByOne(int[] arr, int n) {
		
		//Copy first element into a temporary variable
		int temp=arr[0];
		
		//Shift all elements from second position onwards one position left
		for(int i=1; i<n; i++){
			arr[i-1]=arr[i];
		}
		
		arr[n-1]=temp;	
		
	}

}
