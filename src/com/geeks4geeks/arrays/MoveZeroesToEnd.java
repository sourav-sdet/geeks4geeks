package com.geeks4geeks.arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {

		int arr[]={10,8,0,0,12,0};
		moveZeroesToEnd(arr, arr.length);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}

	}

	public static void moveZeroesToEnd(int[] arr, int n) {
		
		//Count of non zero elements
		int count=0;
		
		for(int i=0; i<n; i++){
			if(arr[i] != 0){
				
				//swap(arr[i], arr[count]);
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				
				count++;
			}
		}	
		
	}

}
