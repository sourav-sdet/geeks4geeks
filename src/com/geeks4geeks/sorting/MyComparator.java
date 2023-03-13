package com.geeks4geeks.sorting;

import java.util.Comparator;

public class MyComparator implements Comparator<PointClass> {
	
	
	public int compare(PointClass p1, PointClass p2){
		
		//ncreasing order of x co-prdinates
		return p1.x-p2.x;
	}


}
