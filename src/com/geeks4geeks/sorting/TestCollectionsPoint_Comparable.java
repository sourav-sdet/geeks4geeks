package com.geeks4geeks.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionsPoint_Comparable {

	public static void main(String[] args) {

		//Collections.sort for User Defined Types
		List<CollectionsPoint_Comparable> list=new ArrayList<>();
		list.add(new CollectionsPoint_Comparable(10,20) );
		list.add(new CollectionsPoint_Comparable(1,2) );
		list.add(new CollectionsPoint_Comparable(3,4) );
		list.add(new CollectionsPoint_Comparable(50,60) );
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
