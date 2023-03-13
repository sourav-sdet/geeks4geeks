package com.geeks4geeks.sorting;

import java.util.Arrays;
import java.util.Collections;

public class TestPoint {

	public static void main(String[] args) {

		Point arr[]={new Point(10,20), new Point(3,12), new Point(5,7)};
		//Natural Order Sorting
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].x+ " "+ arr[i].y);
		}
		
		//Reverse Sorting using Custom Comparator - Collections.reverseOrder
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].x+ " "+ arr[i].y);
		}
		
		

	}

}
