package com.geeks4geeks.sorting;

import java.util.Arrays;


public class TestArrayPoint_Comparator {

	public static void main(String[] args) {

		ArrayPoint_Comparator arr[]={new ArrayPoint_Comparator(10,20), new ArrayPoint_Comparator(3,12), new ArrayPoint_Comparator(5,7)};
		
				//Natural Order Sorting
				Arrays.sort(arr, new MyCustomComparator1());
				for(int i=0; i<arr.length; i++){
					System.out.println(arr[i].x+ " "+ arr[i].y);
				}
				
				
		

	}

}
