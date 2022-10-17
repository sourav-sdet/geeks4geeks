package com.geeks4geeks.arrays;

public class ArrayOperations_Search_Insert {

	public static void main(String[] args) {
		
		int arrayCapacity=10;
		int arr[]=new int[arrayCapacity];
		arr[0]=5;
		arr[1]=7;
		arr[2]=2;
		arr[3]=8;
		arr[4]=1;
		arr[5]=0;
		
		
		int searchIndex=search(arr, 10);
		System.out.println("Index of element is: "+searchIndex);
		
		/*
		int arraySize=insert(arr, 2, 10, arrayCapacity);
		System.out.println("New array size is: "+arraySize);
		*/
		
				
		}
		
		//Search element in unsorted array- LINEAR SEARCH
		public static int search(int arr[], int x){
			
			for(int i=0; i<arr.length; i++){
				if(arr[i] == x){
					return i;
				}
			}
			return -1;
		}
		
		
		
		//Insert element when there is capacity available in the array
		public static int insert(int arr[], int pos, int x, int cap){
			
			//If current size == capacity
			if(arr.length == cap)
				return arr.length;
			
			
			//If space is available in the array
			int index=pos-1; //as index begins from 0 and pos begins from 1
			
			//Move all elements including index and the next ones one position right
			for(int i=arr.length-1; i>=index; i++){
				arr[i+1]=arr[i];
			}
			
			arr[index]=x;
			return arr.length+1;
		}
		
		
		
		
		
		
		
		

	

}
