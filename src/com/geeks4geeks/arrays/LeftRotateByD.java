package com.geeks4geeks.arrays;

public class LeftRotateByD {

	public static void main(String[] args) {

		int arr[] ={2,3,4,5,6,7,8};
		
		leftRotateByD(arr, arr.length,3);
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		

	}
	
	//Naive Solution: Call LeftRotateByOne method d times
	
	//Efficient Solution: Reversal Algorithm
	public static void leftRotateByD(int[] arr, int n, int d) {
		
		//Reverse first d elements (0 to d-1)
		reverse(arr, 0,d-1);
		
		//Reverse elements from d to n-1
		reverse(arr, d,n-1);
		
		//reverse whole array
		reverse(arr,0,n-1);
		
	}

	public static void reverse(int[] arr, int low, int high) {

		while(low < high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			
			low++;
			high--;
		}
		
		
		
	}

}
