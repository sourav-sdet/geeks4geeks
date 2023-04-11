package com.interviews;

import java.util.Comparator;
import java.util.Map;

public class IPComparator implements Comparator<Map.Entry<String,Integer>> {
	
	
	public int compare(Map.Entry<String, Integer> ip1, Map.Entry<String, Integer> ip2){
		return ip2.getValue()-ip1.getValue();
	}


}
