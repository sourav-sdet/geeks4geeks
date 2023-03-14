package com.geeks4geeks.sorting;

import java.util.Comparator;

public class MyCustomComparator2 implements Comparator<CollectionsPoint_Comparator>{
	
	public int compare(CollectionsPoint_Comparator p1, CollectionsPoint_Comparator p2){
		
		return p1.x-p2.x;
	}
	
	

}
