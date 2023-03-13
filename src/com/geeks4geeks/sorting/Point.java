package com.geeks4geeks.sorting;

public class Point implements Comparable<Point> {

	//Sorting Array of Non Primitive (User Defined)
	//This class implements Comparable interface
	
	int x,y;
	
	//Constructor
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//Method of Comparable Interface
	//Sort in increasing order of x co-prdinates
	public int compareTo(Point P){
		return this.x-P.x;
	}


}
