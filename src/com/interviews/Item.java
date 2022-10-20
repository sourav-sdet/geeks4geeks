package com.interviews;

//Helper Class for DuplicateProducts	
public class Item {
	String name;
	int price;
	int weight;
	
	public Item(String name, int price, int weight){
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	
	
	public boolean isDuplicate(Item i){
		
		if(this.name.equals(i.name) && this.price == i.price && this.weight == i.weight){
			return true;
		}
		return false;
	}
}
