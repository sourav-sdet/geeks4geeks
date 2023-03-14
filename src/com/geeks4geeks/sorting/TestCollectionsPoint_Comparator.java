package com.geeks4geeks.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionsPoint_Comparator {

	public static void main(String[] args) {
		
		//Collections.sort for User Defined Types
		List<CollectionsPoint_Comparator> list=new ArrayList<>();
		list.add(new CollectionsPoint_Comparator(10,20) );
		list.add(new CollectionsPoint_Comparator(1,2) );
		list.add(new CollectionsPoint_Comparator(3,4) );
		list.add(new CollectionsPoint_Comparator(50,60) );
				
		Collections.sort(list, new MyCustomComparator2());
		System.out.println(list);

	}

}
