package com.geeks4geeks.sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortingNonPrimitiveWrapperClasses {

	public static void main(String[] args) {


		Integer arr[]={5,20,10,12};
		//Natural Order Sorting
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//Reverse Sort
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		

	}

}
