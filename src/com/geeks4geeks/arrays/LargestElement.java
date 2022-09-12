package com.geeks4geeks.arrays;

public class LargestElement {

	public static void main(String[] args) {

		int arr[] ={1,2,3,10, 4,5,6,7,8};
		
		int largest=largestElement(arr);
		System.out.println(largest);

	}

	public static int largestElement(int[] arr) {
		int largest=0; //Consider index of first element as the largest element
		for(int i=1; i<arr.length; i++){   // traverse through the remaining elements
			if(arr[i] > arr[largest])
				largest=i;
		}

		
		//return arr[largest];
		return largest;
	}

}
