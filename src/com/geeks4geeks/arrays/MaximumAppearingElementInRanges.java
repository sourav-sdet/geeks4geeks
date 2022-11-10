package com.geeks4geeks.arrays;

public class MaximumAppearingElementInRanges {

	public static void main(String[] args) {

		//Element ranges are given in form of 2 arrays- left and right
		//Find out maximum appearing element in all the ranges
		
		int left[]={1,2,5,15};
		int right[]={5,8,7,18};
		
		//[1,2,3,4,5], [2,3,4,5,6,7,8], [5,6,7], [15,16,17,18]
		//Output is 5
		
		//0<=left[i] <right[i] < 100
		
		int maxAppear=max_Appear_Naive(left,right, left.length);
		System.out.println(maxAppear);
		
		maxAppear=max_Appear_Efficient(left,right, left.length);
		System.out.println(maxAppear);
		
		

	}
	
	//Quadratic Complexity
	public static int max_Appear_Efficient(int[] left, int[] right, int n) {
		
		int freq[]=new int[101];
		//1- Traverse through all the ranges, mark beginning as 1 and ending+1 as -1 in frequency[]
		//2- Do Prefix Sum in frequency[]
		//3- Return index of maximum value
		
		for(int i=0; i<n; i++){
			freq[left[i]]++;
			freq[right[i]+1]--;
		}
		
		int res=0;
		for(int i=1; i<100; i++){
			freq[i]=freq[i-1]+freq[i];
			if(freq[i] > freq[res])
				res=i;
		}
	
		return res;
	}
	//Complexity: O(n * MAX) where MAX is the maximum size of the range
	public static int max_Appear_Naive(int[] left, int[] right, int n) {
		
		int freq[]=new int[100];    //as range is in between 0 to 99, by default in java array elements are initialized to 0
		
		for(int i=0; i<n; i++){
			
			for(int j=left[i]; j<=right[i]; j++){
				freq[j]+=1;
			}
		
		}
		
		int res=0;
		for(int i=1; i<100; i++){
			if(freq[i] > freq[res])
				res=i;
		}

		
		return res;
	}

}
