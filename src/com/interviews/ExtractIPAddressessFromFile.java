package com.interviews;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIPAddressessFromFile {

	public static void main(String[] args) throws IOException {


		LinkedHashMap<String, Integer> ipMap=new LinkedHashMap<>();
		
		//STEP 1: PARSE THE FILE AND EXTRACT IP ADDRESS, STORE IT IN A LINKEDHASHMAP
		File file=new File("C:/Users/Sourav/Desktop/logs.txt");
		FileReader fr= new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String ipRegex="\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";  //xxx.xxx.xxx.xxx
		Pattern pattern=Pattern.compile(ipRegex);
		
		
		String line;
		while((line=br.readLine()) !=null){
			Matcher matcher=pattern.matcher(line);
			while(matcher.find()){
				String ip=matcher.group();
				if(ipMap.containsKey(ip))
					ipMap.put(ip, ipMap.get(ip)+1);
				else
					ipMap.put(ip, 1);
				
			}
	
		}
		
		
		//STEP 2: SORT THE LINKEDHASHMAP IN DESCENDING ORDER OF VALUES USING A COMPARATOR
		List<Map.Entry<String, Integer>> ipList=new ArrayList<>(ipMap.entrySet());
		System.out.println(ipList);
		System.out.println(ipList.get(0));
		
		Collections.sort(ipList, new IPComparator());
		
		
		//STEP 3: CREATE A NEW LINKEDHASHMAP AND STORE THE SORTED ENTRIES
		LinkedHashMap<String, Integer> sortedIPMap=new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry: ipList){
			
			String key=entry.getKey();
			int value=entry.getValue();
			sortedIPMap.put(key, value);
			
		}
		
		
		//STEP 4: PRINT CONTENTS OF SORTED LINKEDHASHMAP
		Iterator<Map.Entry<String,Integer>> iter=sortedIPMap.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		
		
		
		
		

	}

}
