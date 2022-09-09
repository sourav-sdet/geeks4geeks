package com.geeks4geeks.arrays;

public class ArrayOperations_Delete {

	public static void main(String[] args) {
		
		
		int arr[] ={2,3,4,5,6,7,8};
		int newArraySize=delete(arr,4);
		System.out.println(newArraySize);
		
		//print the array
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}

	public static int delete(int[] arr, int x) {
		
		int i;
		
		//Search the element in the array
		for(i=0; i<arr.length; i++){
			if(arr[i] ==x)
				break;
		}
		
		//If element not found in the array
		if(i==arr.length)
			return arr.length;
		
		//If element is found in the array
		for(int j=i; j< arr.length-1; j++){
			arr[j]=arr[j+1];
		}
		return arr.length-1;
	}

}
