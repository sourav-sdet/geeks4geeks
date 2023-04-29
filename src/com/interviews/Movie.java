package com.interviews;




//Comparable vs Comparator in Java
//Java provides two interfaces to sort objects using data members of the class
//1- Comparable
//2- Comparator


//Comparable
//A Comparable Object is capable of comparing itself with another object. The class itself must implement
//Comparable interface to compare with its instances.


public class Movie implements Comparable<Movie>{
	
	//Data Members
	public double rating;
	public String name;
	public int year;
	
	//Sort Movies by year
	public int compareTo(Movie m){
		return m.year - this.year;
	}
	
	//If we want to sort movies by their rating and names as well- when a class implements comparable, we get only
	//one chance to implement compareTo().
	//The solution is by using comparator
	
	//Constructor
	public Movie(double rating, String name, int year){
		this.rating=rating;
		this.name=name;
		this.year=year;
	}
	
	// Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
	
	

}
