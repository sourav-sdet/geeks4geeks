package com.geeks4geeks.sorting;

import java.util.Comparator;

public class MyCustomComparator1 implements Comparator<ArrayPoint_Comparator> {
	
	
	public int compare(ArrayPoint_Comparator p1, ArrayPoint_Comparator p2){
		
		//ncreasing order of x co-prdinates
		return p1.x-p2.x;
	}


}
