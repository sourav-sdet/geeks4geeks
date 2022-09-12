package com.geeks4geeks.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] ={1,2,3,4,5,6,7,8,9};
		
		int low=0, high=arr.length-1;
		
		while(low < high){    //till low and high cross each other/meet
			//Even: low and high will cross each other
			//Odd: low and high will meet
			int temp=arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
		

	}

}
