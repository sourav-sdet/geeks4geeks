package com.geeks4geeks.sorting;

import java.util.Arrays;


public class TestPointClass {

	public static void main(String[] args) {

		PointClass arr[]={new PointClass(10,20), new PointClass(3,12), new PointClass(5,7)};
		
				//Natural Order Sorting
				Arrays.sort(arr, new MyComparator());
				for(int i=0; i<arr.length; i++){
					System.out.println(arr[i].x+ " "+ arr[i].y);
				}
				
				
		

	}

}
