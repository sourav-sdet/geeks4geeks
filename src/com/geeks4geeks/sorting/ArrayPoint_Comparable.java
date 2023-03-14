package com.geeks4geeks.sorting;

public class ArrayPoint_Comparable implements Comparable<ArrayPoint_Comparable> {

	//Sorting Array of Non Primitive (User Defined)
	//This class implements Comparable interface
	
	int x,y;
	
	//Constructor
	public ArrayPoint_Comparable(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//Method of Comparable Interface
	//Sort in increasing order of x co-prdinates
	public int compareTo(ArrayPoint_Comparable P){
		return this.x-P.x;
	}


}
