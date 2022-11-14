package com.interviews;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateProducts_Visa {

	public static void main(String[] args) {

		List<String> name=new ArrayList<>();
		name.add("AA");
		name.add("BB");
		name.add("CC");
		name.add("AA");
		name.add("AA");
		name.add("BB");
		
		List<Integer> price=new ArrayList<>();
		price.add(12);
		price.add(10);
		price.add(10);
		price.add(12);
		price.add(12);
		price.add(10);
		
		List<Integer> weight=new ArrayList<>();
		weight.add(10);
		weight.add(10);
		weight.add(10);
		weight.add(10);
		weight.add(10);
		weight.add(10);
		
		int duplicates=duplicateProducts(name,price,weight);
		System.out.println(duplicates);
	}

	public static int duplicateProducts(List<String> name, List<Integer> price, List<Integer> weight) {
		
		Set<String> uniqueItem=new HashSet<String>();
		for(int i=0; i< name.size(); i++){
			uniqueItem.add(name.get(i) + " " + price.get(i) + " " + weight.get(i));
			
		}
		
		return (name.size()-uniqueItem.size());
		
	}
}

