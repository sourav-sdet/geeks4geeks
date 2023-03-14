package com.geeks4geeks.sorting;

public class CollectionsPoint_Comparable implements Comparable<CollectionsPoint_Comparable> {
	
	int x, y;
	
	public CollectionsPoint_Comparable(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int compareTo(CollectionsPoint_Comparable p){
		return this.x-p.x;
	}

	
	
	

}
