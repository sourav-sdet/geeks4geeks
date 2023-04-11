package com.interviews;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FetchIPAddressessFromFile {

	public static void main(String[] args) throws IOException {

		
		LinkedHashMap<String, Integer> ips=new LinkedHashMap<>();

		//STEP 1: Parse the file and put IP Addresses in a LinkedHashMAp
		File file=new File("C:/Users/Sourav/Desktop/logs.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		while((line = br.readLine()) !=null){
			
			String ip=line.substring(0,13);
			
			//if ip is already present
			if(ips.containsKey(ip)){
				
				ips.put(ip, ips.get(ip)+1);
				
			}
			
			//If ip is not present
			else{
				ips.put(ip, 1);
			}
			
			
		}
		
		//STEP 2: Print contents of LinkedHashMap
		for (Map.Entry<String,Integer> mapElement : ips.entrySet()) {
            String key = mapElement.getKey();
 
            // Adding some bonus marks to all the students
            int value = mapElement.getValue();
 
            // Printing above marks corresponding to
            // students names
            System.out.println(key + " : " + value);

	}
		
		
		
		//STEP 3: Sort the LinkedHashMap
		List<Map.Entry<String, Integer>> list=new ArrayList<>(ips.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
	
			public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
				return m2.getValue()-(m1.getValue());
			}
		});
		
		System.out.println(list);
		
		//STEP 4: Create a new LinkedHashMap to store the sorted entries
		LinkedHashMap<String, Integer> sortedMap=new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry: list){
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		//STEP 5: Print contents of Sorted LinkedHashMap
				for (Map.Entry<String,Integer> mapElement : sortedMap.entrySet()) {
		            String key = mapElement.getKey();
		 
		            // Adding some bonus marks to all the students
		            int value = mapElement.getValue();
		 
		            // Printing above marks corresponding to
		            // students names
		            System.out.println("***********************************");
		            System.out.println(key + " : " + value);

			}
		

}
	
}
