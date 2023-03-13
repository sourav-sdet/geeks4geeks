package com.geeks4geeks.sorting;

import java.util.Arrays;

public class SortingInJava {

	public static void main(String[] args) {

		//Sorting is implemented in two classes- Arrays and Collections (Collection classes)
		//which implement List Interface allow sorting
		
		
		//Arrays.Sort
		//Primitives (int, char....) -------> DUAL PIVOT QUICK SORT
		//Non Primitives (String, Integer, Student....) -------> MERGE SORT/TIM SORT
		
		
		//Collections.Sort
		//Non Primitives (ArrayList<Integer>, LinkedList<String>....) -------> MERGE SORT/TIM SORT
		
		//For Sorting Primitives- Stability is not required
		//Non Primitives- Stability is required
		
		
	
		//ARRAYS.SORT IN JAVA
		//For Primitives, Arrays.Sort() does not allow a Custom Comparator, only default sorting (Non Decreasing)
		//order is allowed.
		int arr1[]={20,12,5,30};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		char arr2[]={'B','C','B','A', 'B'};
		Arrays.sort(arr2);
		System.out.println(arr2);
		
		//Sort subelements of a given array
		int arr3[]={20,12,5,30,1,50,25};
		Arrays.sort(arr3,1,6);
		System.out.println(Arrays.toString(arr3));	

	}

}
