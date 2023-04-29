package com.interviews;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Cisco_MeetingScheduler {

	public static void main(String[] args) {

		int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
		int minRooms=minMeetingRooms(intervals);
		System.out.println(minRooms);

	}

	public static int minMeetingRooms(int[][] intervals) {

		//Sort the meetings by their start time in ascending order
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		
		//Create a priority queue of end times
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		//Add the end time of first meeting to the priority queue
		pq.add(intervals[0][1]);
		
		//Check the remaining meetings for overlap
		for(int i=1; i<intervals.length; i++){
			
			//Check if the start time of current meeting is >= earliest end time of priority queue
			if(intervals[i][0] >= pq.peek()){
				pq.poll();
			}
			//Add the end time of current meeting to the priority queue
			pq.add(intervals[i][1]);
		}
		
		//Size of priority queue represents the min num of meeting rooms required without overlap
		return pq.size();
	}

}
