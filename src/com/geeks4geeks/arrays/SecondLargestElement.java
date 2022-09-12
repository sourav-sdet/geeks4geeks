package com.geeks4geeks.arrays;

public class SecondLargestElement {

	public static void main(String[] args) {

		int arr[] ={1,2,3,10, 4,5,6,7,8};
		
		int secondLargest;
		secondLargest=secondLargestElement_Naive(arr);
		System.out.println(secondLargest);
		
		secondLargest=secondLargestElement_Efficient(arr);
		System.out.println(secondLargest);	

	}

	public static int secondLargestElement_Efficient(int[] arr) {

		int secondLargest=-1, largest=0;
		for(int i=1; i<arr.length; i++){
			
			//If new element greater than largest element
			if(arr[i] > arr[largest]){
				secondLargest=largest;
				largest=i;
				
			}
			
			//Ignore, if new element is equal to largest
			
			//If new element is less than largest
			else if(arr[i] != arr[largest]){
				//If secondLargest ==-1 or new element > secondLargest
				if(secondLargest == -1 || arr[i] > arr[secondLargest])
					secondLargest=i;
					
			}
			
		}
		
		return arr[secondLargest];
	}

	public static int secondLargestElement_Naive(int[] arr) {
		
		//Find index of largest element
		int largest=LargestElement.largestElement(arr);
		
		//Find largest of remaining elements
		int secondLargest=-1; //as there may/may not be a second largest element
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] != arr[largest]){    //Consider elements which are not equal to largest
				if(secondLargest==-1)
					secondLargest=i;
				else if (arr[i] > arr[secondLargest])
					secondLargest=i;
			}
		}
		
		
		return arr[secondLargest];
	}

}
