package com.geeks4geeks.searching;

import java.util.Arrays;

public class MedianOfSortedArrays {

	public static void main(String[] args) {


		int arr1[]={10,20,30,40,50};   //5 elements
		int arr2[]={5,15,25,35,45,55};    //5 elements
		
		
		//Even Elements- Average of two middle elements
		//Odd Elements- Middle Element
		
		double median= median_Naive(arr1, arr2);
		System.out.println(median);
		
		median= median_Efficient(arr1, arr2, arr1.length, arr2.length);
		System.out.println(median);
	}
	

	//Use Binary Search
	//Assumption: arr1.length is always <= arr2.length
	//Time Complexity of the solution is O(log n1)
	//Perform Binary Search on smaller array
	//Binary Search tries to establish a condition where all the elements in left half is smaller or equal to all elements in right half
	public static double median_Efficient(int[] arr1, int[] arr2, int n1, int n2) {
		
		int begin1=0, end1=n1;
		
		//min1- Min element in right of arr1
		//max1- Max element in left of arr1
		//min2- min element in right of arr2
		//Max2- Max element in left of arr2
		
		while(begin1 <=end1){
			
			int i1=(begin1+end1)/2;
			int i2=(n1+n2+1)/2 - i1;
			
			int min1=(i1==n1)?Integer.MAX_VALUE:arr1[i1];
			int max1=(i1==0)?Integer.MIN_VALUE:arr1[i1-1];
			
			
			int min2=(i2==n2)?Integer.MAX_VALUE:arr2[i2];
			int max2=(i2==0)?Integer.MIN_VALUE:arr2[i2-1];
			
			if(max1 <=min2 && max2 <=min1){
				
				if((n1+n2) %2 == 0)
					return ((double) Math.max(max1, max2) + Math.min(min1, min2)) /2;
				
				else
					return ((double) Math.max(max1, max2));
				
			}
			
			else if(max1 > min2){
				end1=i1-1;
				
			}
			
			else
				begin1=i1+1;
			
		}
		return -1;
	}






	//O(n1+n2 log(n1+n2)) where n1= arr1.length and n2=arr2.length
	public static double median_Naive(int[] arr1, int[] arr2) {

		//Create a temporary array of size n1+n2
		int temp[]=new int[arr1.length + arr2.length];
		
		//Copy elements of arr1 and arr2 into temp
		for(int i=0; i<arr1.length; i++){
			temp[i]=arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++){
			temp[i+arr1.length]=arr2[i];
		}
		
		//Sort temp
		Arrays.sort(temp);
		//5,10,15,20,25,30,35,40,45,50
		
		//If n1+n2 is odd, return middle element
		//If n1+n2 is even, return average of two middle elements
		int low=0, high=temp.length-1;
		int mid=(low+high)/2;
		
		if((temp.length) % 2 ==0)  //Even Length
		{
			
			return ((double)(temp[mid] + temp[mid+1]) /2);
		}
		else
		{
			return (temp[mid]);
		}
		
	}

}
