package com.interviews;

import java.util.Comparator;

//Unlike Comparable, Comparator is external to the element type we are comparing i.e its a separate class.
//We create multiple separate classes that implements Comparator to compare by different members.
//Collections class has a second sort method that takes a Custom Comparator. 



public class RatingCompare implements Comparator<Movie>{
	
	public int compare(Movie m1, Movie m2){
		if (m1.rating < m2.rating)
            return -1;
        if (m1.rating > m2.rating)
            return 1;
        else
            return 0;
	}
	
}
