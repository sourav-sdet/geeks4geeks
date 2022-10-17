package com.geeks4geeks.arrays;

public class Leaders {

	public static void main(String[] args) {

		//An element is called a leader if there is exists no element greater than it on the right side
		
		//Rightmost element is always a leader
		
		//Array is sorted in increasing order--> Last element is the leader
		//Array is sorted in decreasing order --> Every element is a leader
		
		//10 is not a leader as there exists another 10 which is equal to it
		
		int arr[]={12,7,11,4,10,6,5,2};
		
		leaders(arr, arr.length);	

	}

	public static void leaders(int[] arr, int n) {

		//Traverse from right side of array as last element is always a leader
		int curr_ldr=arr[n-1];
		System.out.println(curr_ldr);
		for(int i=n-2; i>=0; i--){
			if(arr[i] > curr_ldr){ //Check if current element is greater than current leader
				curr_ldr=arr[i];
				System.out.println(curr_ldr);
			}
		}
		
		//prints the leaders of array from right to left
		//To get the order from left to right, use an array of size n to put the elements and reverse it.
		
		
	}

}
