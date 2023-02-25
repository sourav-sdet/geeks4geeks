package com.geeks4geeks.searching;

public class SquareRoot {

	public static void main(String[] args) {


		//Given an integer, find the square root of the number
		//Perfect Square- return the square root
		//Not a perfect Square- return the floor of square root
		int x=25;
		int sqroot=sqrt_Naive(x);
		System.out.println(sqroot);
		
		sqroot=sqrt_Efficient(x);
		System.out.println(sqroot);

	}
	
	public static int sqrt_Efficient(int x) {
		
		//Use Binary Search
		int low=1, high=x, ans=-1;
		
		while(low <=high){
			
			int mid=(low+high)/2;
			int midSq=mid*mid;
			
			if(midSq == x)
				return mid;
			
			//mid square > x, consider left half
			else if(midSq > x)
				high=mid-1;
			
			//mid square < x, consider right half
			else{
				low=mid+1;
				ans=mid;
			}
		}
		
		
		
		return 0;
	}

	//Time Complexity- O(Sqrt(x)), x is the integer
	public static int sqrt_Naive(int x) {

		int i=1;
		while(i * i <=x)
			i++;
	
		return i-1;
	}

}
