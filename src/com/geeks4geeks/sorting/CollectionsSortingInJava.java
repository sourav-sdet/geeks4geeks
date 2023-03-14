package com.geeks4geeks.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortingInJava {

	public static void main(String[] args) {

		//Collections.sort() --> works only for Collection classes that implement list interface.
		//Ex- ArrayList, LinkedList
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(50);
		list.add(100);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		//Wrapper Class implement Comparable Interface, hence they have compareTo method inside them
		

	}

}
