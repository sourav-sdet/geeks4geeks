package com.geeks4geeks.searching;

public class RepeatingElements_2 {

	public static void main(String[] args){

		//Given an array, all elements occur exactly once except one element
		//One element may repeat any number of times
		//Zero is always present in the array
		//All elements from 0 to max(arr) are present in the array
		//arr.length >=2
				
		//O(n) time, O(1) auxilliary space, No modifications to original array
		
		int arr[]={0,2,1,3,2,2};
		
		//O(n) Time and O(n) Auxilliary space
		int repeatingElement=repeating_Efficient(arr, arr.length);
		System.out.println(repeatingElement);
		
		//O(nlogn) Time and O(1) Auxilliary space, Original array is modified
		repeatingElement=repeating_SuperEfficient(arr, arr.length);
		System.out.println(repeatingElement);
	

	}
	
	public static int repeating_SuperEfficient(int[] arr, int length) {

		//All elements from 1 to max(arr) are present
		//1 <= max(arr) <=n-1
		
		//Traverse the array from left to right
		//Use array elements as indexes and form a chain
		//We always see a cycle in the chain where repeating element will be the first element of the cycle
		
		//Find first node of the cycle using a Linkedlist algorithm- Loop in the Linkedlist, find first node of the Linkedlist
		//TWO STEP ALGORITHM
		
		int slow=arr[0]+1, fast=arr[0]+1;
		//FIRST PHASE: slow moves one link at a time, fast moves two links at a time
		//slow and first will meet at some point inside the cycle.
		
		//PROOF OF FIRST PHASE CLAIM: Fast will enter the cycle first or at the same time (whole thing is a cycle)
		//fast will always be k links ahead(k is some number), for every iteration, k will increase by 1
		//After some iterations, distance between slow and fast will be equal to cycle length, this is the point they meet.
		do{
			slow=arr[slow]+1;
			fast=arr[arr[fast]+1 ]+1;
		}while(slow != fast);
			
		//SECOND PHASE: Keep fast as it is, make slow point to arr[0]
		//Both slow and fast move at the same pace
		//They will definitely meet at the first item of cycle which is a repeating element
		
		//PROOF OF SECOND PHASE CLAIM:
		//m= number of links from start node to the first node of cycle
		//x= number of links from first node of cycle to the first meeting point of slow and fast
		//c is the length of cycle
		//m+x is a multiple of c
		//Fast Distance = 2*(Slow Distance)
		//m+x+c*i = 2*(m+x+c*j)
		//m+x=c * (i-2j)
		
		
		
		slow=arr[0]+1;
		while(slow != fast){
			 slow=arr[slow]+1;
			 fast=arr[fast]+1;
			
		}
		
		return slow-1;
	}

	public static int repeating_Efficient(int[] arr, int n) {
		//Create a boolean array of same size as that of the array
		//Use array elements as index of the boolean array
		
		boolean visited[]=new boolean[n];   //automatically initialized to false
		for(int i=0; i<n; i++){
			if(visited[arr[i]])
				return arr[i];
			visited[arr[i]] = true;
		}
		
		
		
		
		
		
		return 0;
	}

}
