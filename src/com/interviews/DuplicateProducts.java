package com.interviews;

import java.util.ArrayList;
import java.util.List;

public class DuplicateProducts {

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
		
		
		List<Item> itemList=new ArrayList<>();
		
		for(int i=0; i<name.size(); i++){
			Item item=new Item(name.get(i), price.get(i), weight.get(i));
			itemList.add(item);
		}
		
		int duplicates=0;
		for(int i=0; i< itemList.size(); i++){
			for(int j=i+1; j<itemList.size(); j++){
			if(itemList.get(i).isDuplicate(itemList.get(j))){
				duplicates++;
			}
			}
		}
		return duplicates;
	}
}

