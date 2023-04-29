package com.interviews;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {


		ArrayList<Movie> list=new ArrayList<>();
		list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));
        
        /*
        //Sort by Year
        Collections.sort(list);
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
		*/
        
        /*
        //Sort by Rating
        Collections.sort(list, new RatingCompare());
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
        
        */
        
        //Sort by Name
        Collections.sort(list, new NamesCompare());
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
        
        
        //If sorting of objects needs to be based on natural order, use Comparable
        //If sorting needs to be done on attributes of different objects, use Comparator

	}

}
